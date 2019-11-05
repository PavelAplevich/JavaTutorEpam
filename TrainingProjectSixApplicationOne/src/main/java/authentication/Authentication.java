package authentication;

import logic.Output;
import logic.Path;
import person.Admin;
import person.Person;
import person.User;
import write.and.read.MyReader;
import write.and.read.MyWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Класс, реализующий аутентификацию пользователя.
public class Authentication {

    //Метод, реализующий выбор.
    public static Person chooseUser() throws IOException {
        Output.printOutPurple("1. Создать нового пользователя.\n2. У меня есть аккаунт.");
        int choice = InputValidations.checkOneTwo();
        if(choice == 1){
            return CreateUser.createNewUser();
        } else {
            return Authentication.userIn();
        }
    }

    //Внутренние методы, обеспечивающие проверку и логику.
    private static Person userIn() throws IOException {
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

    private static boolean isExist(String login) throws IOException {
        File file = Path.getAuthentication();
        if(MyReader.findString(login, file)){
            return true;
        } else {
            return false;
        }
    }
}
