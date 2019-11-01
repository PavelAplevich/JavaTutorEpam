package person;

import action.Action;
import menu.Menu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

public class Person {
    private String login;
    private String email;

    public void doAction(int action) throws URISyntaxException, IOException {
        Action act = new Action();
        act.doAction(this, action);
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
