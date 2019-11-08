package server.logic;

import org.xml.sax.SAXException;
import server.action.Action;
import server.authentication.Authentication;
import server.persons.Person;
import javax.xml.parsers.ParserConfigurationException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.NoSuchElementException;

public class ServerLogic {

    public static void start(DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException {
        in = new DataInputStream(clientSocket.getInputStream());
        out = new DataOutputStream(clientSocket.getOutputStream());
        String login = in.readUTF();
        String password = in.readUTF();
        try {
            Person person = Authentication.check(login, password);
            out.writeUTF("LoginAccept");
            out.writeUTF("\u001B[32mДобро пожаловать, " + person.getLogin() + "!\u001B[0m");
            out.writeUTF(Action.actionList(person));
            actionStart(person, in, out, clientSocket);
        } catch (NoSuchElementException e){
            out.writeUTF("LoginReject");
            out.writeUTF("\u001B[31mВведен неверный логин и/или пароль! Повторите ещё раз");
            start(in, out, clientSocket);
        }
    }

    public static void actionStart(Person person,DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException {
        int action = Integer.parseInt(in.readUTF());
        person.doAction(action, in, out, clientSocket);
    }
}
