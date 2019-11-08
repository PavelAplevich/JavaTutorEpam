package server.persons;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class User extends Person {

    public User(String login, String password) {
        super(login, password);
    }

    @Override
    public void doAction(int action, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException {
        super.doAction(action, in, out, clientSocket);
    }
}
