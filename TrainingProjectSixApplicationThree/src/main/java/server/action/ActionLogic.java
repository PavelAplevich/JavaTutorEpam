package server.action;

import org.xml.sax.SAXException;
import server.archive.Archive;
import server.archive.Document;
import server.logic.ServerLogic;
import server.persons.Person;

import javax.xml.parsers.ParserConfigurationException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ActionLogic {
    public void doAction(Person person, int action, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException {
        switch (action){
            case 1:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[36mСледуйте инструкциям:\u001B[0m");
                findId(person,in,out,clientSocket);
                break;
            case 2:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[36mСледуйте инструкциям:\u001B[0m");
                findInitials();
                break;
            default:
                out.writeUTF("ActionReject");
                out.writeUTF("\u001B[31mВведены неожидаемые данные. Пожалуйста, повторите ваш ввод!\u001B[0m");
                ServerLogic.actionStart( person, in, out, clientSocket);
        }
    }

    protected void findInitials() {
    }

    protected void findId(Person person, DataInputStream in, DataOutputStream out, Socket clientSocket) throws ParserConfigurationException, SAXException, IOException {
        out.writeUTF("Введите id необходимого дела");
        int id = Integer.parseInt(in.readUTF());
        Archive archive = Archive.createArchive();
        for(Document document:archive.getDocuments()){
            if(id == document.getId()){
                out.writeUTF("\u001B[37mВаш результат:\u001B[0m\u001B[34m\n" + document.toString());
            }
        }
    }
}
