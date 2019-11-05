package person;

import action.Action;
import book.Catalog;
import logic.Logic;
import menu.Menu;
import java.io.IOException;

//Суперкласс, реализующий общие черты администратора и пользователя.
public class Person {
    private String login;
    private String email;

    //Метод продолжения работы с пользователем.
    public void resume(Catalog catalog) throws IOException{
        Logic.resume(this, catalog);
    }

    //Метод выполнения заданного действия.
    public void doAction(int action, Catalog catalog) throws IOException{
        Action act = new Action();
        act.doAction(this, action, catalog);
    }

    //Метод выбора действия.
    public int chooseAction(){
        Action action = new Action();
        return action.chooseAction(this);
    }

    //Метод вывода меню.
    public void showMenu(){
        Menu menu = new Menu();
    }

    //Конструктор
    public Person(String login, String email) {
        this.login = login;
        this.email = email;
    }

    //Набор геттеров и сеттеров
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
