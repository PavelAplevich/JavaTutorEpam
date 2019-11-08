package server.persons;

import org.xml.sax.SAXException;
import server.action.ActionLogic;

import javax.xml.parsers.ParserConfigurationException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Person {
    private String login;
    private String password;

    public Person(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void doAction(int action, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException {
        ActionLogic actionLogic = new ActionLogic();
        actionLogic.doAction(this,action, in, out, clientSocket);
    }
}
