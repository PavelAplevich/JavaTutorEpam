package server.persons;

import org.xml.sax.SAXException;
import server.action.AdministratorLogic;
import server.main.Server;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

//Класс реализует администратора.
public class Administrator extends Person {

    public Administrator(String login, String password) {
        super(login, password);
    }

    @Override
    public void doAction(int action, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException, TransformerException {
        AdministratorLogic administratorLogic = new AdministratorLogic();
        administratorLogic.doAction(this, action, in, out,clientSocket);
        Server.getPerson(this);
    }
}
