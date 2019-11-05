package person;

import action.Action;
import action.UserAction;
import book.Catalog;
import menu.Menu;
import menu.UserMenu;

import java.io.IOException;

public class User extends Person{
    //Конструктор пользователя
    public User(String login, String email) {
        super(login, email);
    }

    //Перезаписанные методы суперкласса для пользователя.
    @Override
    public void doAction(int action, Catalog catalog) throws IOException{
        Action act = new UserAction();
        act.doAction(this, action, catalog);
    }

    @Override
    public void showMenu() {
        Menu menu = new UserMenu();
        menu.showMenu();
    }

    @Override
    public int chooseAction() {
        Action action = new UserAction();
        return action.chooseAction(this);
    }
}
