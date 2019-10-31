package logic;

import write.and.read.MyReader;
import write.and.read.MyWriter;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputValidations {

    public static int checkOneTwo(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int choice = scanner.nextInt();
            if(choice == 1 || choice == 2){
                return choice;
            } else {
                Output.printOutRed("Неккоректный ввод! Попробуйте ещё раз, пожалуйста.");
                return checkOneTwo();
            }
        } else {
            Output.printOutRed("Неккоректный ввод! Попробуйте ещё раз, пожалуйста.");
            return checkOneTwo();
        }
    }

    public static String checkLogin() throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        String login;
        if(scanner.hasNext()){
            login = scanner.nextLine();
            if(isExist(login)){
                Output.printOutRed("Неккоректный ввод! Такой логин уже используется.");
                return checkLogin();
            } else {
                return login;
            }
        } else {
            Output.printOutRed("Неккоректный ввод! Попробуйте ещё раз, пожалуйста.");
            return checkLogin();
        }
    }

    public static String checkPassword(){
        Scanner scanner = new Scanner(System.in);
        String password;
        if(scanner.hasNext()){
            password = scanner.nextLine();
            if(password.length() < 8 || password.length() > 36){
                Output.printOutRed("Неккоректный ввод! Попробуйте ещё раз, пожалуйста.");
                return checkPassword();
            } else {
                return password;
            }
        } else {
            Output.printOutRed("Неккоректный ввод! Попробуйте ещё раз, пожалуйста.");
            return checkPassword();
        }
    }

    public static String checkEmail(){
        Scanner scanner = new Scanner(System.in);
        String email;
        Pattern pattern = Pattern.compile("/.+@.+\\..+/i");
        //TODO pattern emaila ne rabotaet
        if(scanner.hasNext()){
            email = scanner.nextLine();
            return email;
        } else {
            Output.printOutRed("Неккоректный ввод! Попробуйте ещё раз, пожалуйста.");
            return checkEmail();
        }
    }

    private static boolean isExist(String login) throws URISyntaxException, IOException {
        URL resource = MyWriter.class.getResource("Authentication.txt");
        File file = Paths.get(resource.toURI()).toFile();
        return MyReader.findString(login, file);
    }
}
