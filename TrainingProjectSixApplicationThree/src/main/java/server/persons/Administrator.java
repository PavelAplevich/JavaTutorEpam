package server.persons;

import org.xml.sax.SAXException;
import server.action.AdministratorLogic;

import javax.xml.parsers.ParserConfigurationException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Administrator extends Person {

    public Administrator(String login, String password) {
        super(login, password);
    }

    @Override
    public void doAction(int action, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException {
        AdministratorLogic administratorLogic = new AdministratorLogic();
        administratorLogic.doAction(this, action, in, out,clientSocket);
    }
}
