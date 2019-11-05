package person;

import action.Action;
import action.AdminAction;
import book.Catalog;
import menu.AdminMenu;
import menu.Menu;

import java.io.IOException;

//Класс, реализующий администратора.
public class Admin extends Person{
    //Конструктор администратора.
    public Admin(String login, String email) {
        super(login, email);
    }

    //Переопределенные методы суперкласса, для администратора
    @Override
    public void doAction(int action, Catalog catalog) throws IOException{
        Action act = new AdminAction();
        act.doAction(this, action, catalog);
    }

    @Override
    public int chooseAction() {
        Action action = new AdminAction();
        return action.chooseAction(this);
    }

    @Override
    public void showMenu() {
        Menu menu = new AdminMenu();
        menu.showMenu();
    }
}
