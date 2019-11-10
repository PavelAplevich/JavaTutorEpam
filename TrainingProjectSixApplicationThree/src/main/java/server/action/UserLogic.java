package server.action;

import org.xml.sax.SAXException;
import server.persons.Person;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

//Класс, реализующий логику действий пользователя.
public class UserLogic extends ActionLogic{

    @Override
    public void doAction(Person person, int action, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException, TransformerException {
        super.doAction(person, action, in, out, clientSocket);
    }
}
