package server.action;

import org.xml.sax.SAXException;
import server.archive.Archive;
import server.archive.Document;
import server.main.ServerLogic;
import server.persons.Person;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
//Суперкласс реализации действий в программе.
public class ActionLogic {
    public void doAction(Person person, int action, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException, TransformerException {
        switch (action){
            case 1:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[36mСледуйте инструкциям:\u001B[0m");
                findId(person, in, out, clientSocket);  //Запускаем поиск по ID
                break;
            case 2:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[36mСледуйте инструкциям:\u001B[0m");
                findInitials(person, in, out, clientSocket);    //Запускаем поиск по ФИО
                break;
            default:
                out.writeUTF("ActionReject");
                out.writeUTF("\u001B[31mВведены неожидаемые данные. Пожалуйста, повторите ваш ввод!\u001B[0m");
                ServerLogic.actionStart(person, in, out, clientSocket);
        }
    }

    //Метод поиска по ФИО.
    protected void findInitials(Person person, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException {
        out.writeUTF("Введите ФИО студента(Фамилия Имя Отчество через пробел)");
        String[] buf = in.readUTF().split(" ");
        if(buf.length != 3){
            out.writeUTF("Неожидаемые данные. Попробуйте ещё раз.");
            out.writeUTF("quit");
            return;
        }
        int count = 0;
        Archive archive = Archive.createArchive();
        for(Document document:archive.getDocuments()){
            if(document.getSecondName().equals(buf[0]) && document.getFirstName().equals(buf[1]) && document.getPatronymic().equals(buf[2])){
                out.writeUTF("\u001B[37mВаш результат:\u001B[0m\u001B[34m\n" + document.toString());
                count++;
                out.writeUTF("quit");
            }
        }
        if(count == 0){
            out.writeUTF("Дело не найдено..");
            out.writeUTF("quit");
        }
    }

    //Метод поиска по ID.
    protected void findId(Person person, DataInputStream in, DataOutputStream out, Socket clientSocket) throws ParserConfigurationException, SAXException, IOException {
        out.writeUTF("Введите id необходимого дела");
        int id = Integer.parseInt(in.readUTF());
        Archive archive = Archive.createArchive();
        int count = 0;
        for(Document document:archive.getDocuments()){
            if(id == document.getId()){
                out.writeUTF("\u001B[37mВаш результат:\u001B[0m\u001B[34m\n" + document.toString());
                count++;
                out.writeUTF("quit");
            }
        }
        if(count == 0){
            out.writeUTF("Дело не найдено..");
            out.writeUTF("quit");
        }
    }
}
