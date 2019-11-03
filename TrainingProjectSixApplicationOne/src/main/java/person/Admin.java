package person;

import action.Action;
import action.AdminAction;
import catalog.Catalog;
import menu.AdminMenu;
import menu.Menu;
import java.io.IOException;

public class Admin extends Person{

    public Admin(String login, String email) {
        super(login, email);
    }

    @Override
    public void doAction(int action, Catalog catalog) throws IOException {
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
