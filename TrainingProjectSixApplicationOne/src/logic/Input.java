package logic;

import authentication.user.Authentication;
import authentication.user.CreateUser;
import person.Admin;
import person.User;
import write.and.read.MyReader;

import java.io.IOException;
import java.net.URISyntaxException;

public class Input {
    public static void chooseUser() throws IOException, URISyntaxException {
        Output.printOutPurple("1. Создать нового пользователя.\n2. У меня есть аккаунт.");
        int choice = InputValidations.checkOneTwo();
        if(choice == 1){
            CreateUser.createNewUser();
        } else {
            Authentication.userIn();
        }
    }

    public static void menu(String login) throws IOException, URISyntaxException {
        if(login.equals("administrator")){
            Admin admin = new Admin(login, MyReader.findEmail(login));
            Logic.runAdminMenu(admin);
        } else {
            User user = new User(login, MyReader.findEmail(login));
        }
    }
}
