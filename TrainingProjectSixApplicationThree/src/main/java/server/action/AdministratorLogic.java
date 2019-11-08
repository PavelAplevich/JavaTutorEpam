package server.action;

import org.xml.sax.SAXException;
import server.logic.ServerLogic;
import server.persons.Person;

import javax.xml.parsers.ParserConfigurationException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class AdministratorLogic extends ActionLogic{

    @Override
    public void doAction(Person person, int action, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException {
        switch (action){
            case 1:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[33mСледуйте инструкциям:\u001B[0m");
                findId(person, in, out, clientSocket);
                break;
            case 2:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[33mСледуйте инструкциям:\u001B[0m");
                findInitials();
                break;
            case 3:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[33mСледуйте инструкциям:\u001B[0m");
                changeData();
                break;
            case 4:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[33mСледуйте инструкциям:\u001B[0m");
                addPortfolio();
                break;
            case 5:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[33mВаш результат:\u001B[0m");
                removePortfolio();
                break;
            default:
                out.writeUTF("ActionReject");
                out.writeUTF("\u001B[31mВведены неожидаемые данные. Пожалуйста, повторите ваш ввод!\u001B[0m");
                ServerLogic.actionStart( person, in, out, clientSocket);
        }
    }

    private void removePortfolio() {
    }

    private void addPortfolio() {
    }

    private void changeData() {
    }
}
