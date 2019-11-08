package server.action;

import org.xml.sax.SAXException;
import server.persons.Person;

import javax.xml.parsers.ParserConfigurationException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class UserLogic extends ActionLogic{

    @Override
    public void doAction(Person person, int action, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException {
        super.doAction(person, action, in, out, clientSocket);
    }
}
