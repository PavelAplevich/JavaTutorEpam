package server.main;

import org.xml.sax.SAXException;
import server.action.Action;
import server.persons.Person;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//Точка входа сервера.
public class Server {

    private static Socket clientSocket; //сокет для общения
    private static ServerSocket server; // серверсокет
    private static DataInputStream in; // поток чтения из сокета
    private static DataOutputStream out; // поток записи в сокет
    private static Person person;

    public static void main(String[] args) throws ParserConfigurationException, SAXException, TransformerException, IOException {
            while(true){
                serverStart();
            }
    }

    //Метод реализующий продолжение работы с пользователем.
    private static void resume(Person person) throws IOException, TransformerException, SAXException, ParserConfigurationException {
        out.writeUTF("Вы хотите продолжить работу с программой? Да/Нет");
        String choice = in.readUTF();
        while(choice.equals("Да")){
            out.writeUTF(Action.actionList(person));
            ServerLogic.actionStart(person, in, out, clientSocket);
            out.writeUTF("Вы хотите продолжить работу с программой? Да/Нет");
            choice = in.readUTF();
        }
        if(choice.equals("Нет")){
            out.writeUTF("Архив закрывается..");
        } else {
            out.writeUTF("Получены неожидаемые данные");
        }
    }

    //Основной метод работы сервера.
    private static void serverStart() throws ParserConfigurationException, SAXException, TransformerException {
        try {
            try {
                server = new ServerSocket(4004); // серверсокет прослушивает порт 4004
                clientSocket = server.accept();
                try {
                    in = new DataInputStream(clientSocket.getInputStream());
                    out = new DataOutputStream(clientSocket.getOutputStream());
                    ServerLogic.start(in,out,clientSocket); //Запускаем цепочку действий по работе с пользователем.
                    resume(person); //Запускаем цепочку по продолжению работы с пользователем.
                } finally {
                    clientSocket.close();
                }
            } finally {
                System.out.println("Сессия завершена.");
                server.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    //Метод получения текущего пользователя.
    public static void getPerson(Person personActive) {
        person = personActive;
    }
}