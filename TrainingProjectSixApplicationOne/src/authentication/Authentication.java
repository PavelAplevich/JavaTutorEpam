package authentication;

import logic.InputValidations;
import logic.Output;
import person.Admin;
import person.Person;
import person.User;
import write.and.read.MyReader;
import write.and.read.MyWriter;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Scanner;

public class Authentication {

    public static Person chooseUser() throws IOException, URISyntaxException {
        Output.printOutPurple("1. Создать нового пользователя.\n2. У меня есть аккаунт.");
        int choice = InputValidations.checkOneTwo();
        if(choice == 1){
            return CreateUser.createNewUser();
        } else {
            return Authentication.userIn();
        }
    }

    private static Person userIn() throws URISyntaxException, IOException {
        Output.printOutBlue("Ваш логин:");
        String login = "";
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            login = scanner.nextLine();
            if(!isExist(login)){
                Output.printOutRed("Такого пользователя не существует! Попробуйте ещё раз..");
                return userIn();
            }
        }
        Output.printOutBlue("Введите ваш пароль:");
        String password = "";
        if(scanner.hasNext()){
            password = scanner.nextLine();
            StringBuilder result = new StringBuilder();
            for(int x: MyWriter.encode(password,"readme")){
                result.append(x);
            }
            if(!isExist(result.toString())){
                Output.printOutRed("Пароль неккоректен! Попробуйте ещё раз..");
                return userIn();
            }
        }
        Output.printOutBlue("Вход успешно завершён!\n");
        if(login.equals("administrator")){
            return new Admin(login, MyReader.findEmail(login));
        } else {
            return new User(login, MyReader.findEmail(login));
        }
    }

    private static boolean isExist(String login) throws URISyntaxException, IOException {
        URL resource = Authentication.class.getResource("Authentication.txt");
        File file = Paths.get(resource.toURI()).toFile();
        if(MyReader.findString(login, file)){
            return true;
        } else {
            return false;
        }
    }
}
