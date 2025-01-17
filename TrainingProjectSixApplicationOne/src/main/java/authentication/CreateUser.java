package authentication;

import logic.Output;
import person.Person;
import person.User;
import write.and.read.MyWriter;
import java.io.IOException;

//Класс, реализующий создание нового пользователя.
class CreateUser {

    static Person createNewUser() throws IOException{
        Output.printOutGreen("Введите ваш логин, пожалуйста.");
        String login = InputValidations.checkLogin();
        Output.printOutGreen("Введите ваш пароль(8-36 символов). Хорошо запомните его!");
        String password = InputValidations.checkPassword();
        Output.printOutGreen("Введите ваш действующий e-mail.");
        String email = InputValidations.checkEmail();
        Output.printOutGreen("Учётная запись успешно создана! Используйте её для входа в приложение.");
        MyWriter.writeNewUser(login,password,email);
        return new User(login, email);
    }
}
