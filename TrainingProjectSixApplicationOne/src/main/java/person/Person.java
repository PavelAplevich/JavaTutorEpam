package person;

import action.Action;
import catalog.Catalog;
import logic.Logic;
import menu.Menu;
import java.io.IOException;

public class Person {
    private String login;
    private String email;

    public void resume(Catalog catalog) throws IOException {
        Logic.resume(this, catalog);
    }

    public void doAction(int action, Catalog catalog) throws IOException {
        Action act = new Action();
        act.doAction(this, action, catalog);
    }

    public int chooseAction(){
        Action action = new Action();
        return action.chooseAction(this);
    }

    public void showMenu(){
        Menu menu = new Menu();
    }

    public Person(String login, String email) {
        this.login = login;
        this.email = email;
    }

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
