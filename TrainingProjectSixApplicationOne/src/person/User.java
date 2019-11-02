package person;

import action.Action;
import action.UserAction;
import catalog.Catalog;
import menu.Menu;
import menu.UserMenu;

import java.io.IOException;
import java.net.URISyntaxException;

public class User extends Person{
    public User(String login, String email) {
        super(login, email);
    }

    @Override
    public void doAction(int action, Catalog catalog) throws URISyntaxException, IOException {
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
