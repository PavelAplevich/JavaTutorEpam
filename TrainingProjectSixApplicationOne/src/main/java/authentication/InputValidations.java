package authentication;

import logic.Output;
import logic.Path;
import write.and.read.MyReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputValidations {

    public static boolean checkPointer(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            String symbol = scanner.next();
            if(symbol.equals("D")){
                return true;
            } else if(symbol.equals("A")){
                return false;
            }else{
                Output.printOutRed("Неккоректный ввод..");
                return checkPointer();
            }
        } else {
            Output.printOutRed("Неккоректный ввод..");
            return checkPointer();
        }
    }

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

    public static String checkLogin() throws IOException {
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

    private static boolean isExist(String login) throws IOException {
        return MyReader.findString(login, Path.getAuthentication());
    }
}
