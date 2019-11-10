package server.action;

import org.xml.sax.SAXException;
import server.archive.Archive;
import server.archive.Document;
import server.main.ServerLogic;
import server.persons.Person;
import server.myWriter.MyWriter;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

//Класс, реализующий логику действий администратора.
public class AdministratorLogic extends ActionLogic{

    @Override
    public void doAction(Person person, int action, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException, TransformerException {
        switch (action){
            case 1:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[33mСледуйте инструкциям:\u001B[0m");
                findId(person, in, out, clientSocket);  //Запускаем поиск по ID.
                break;
            case 2:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[33mСледуйте инструкциям:\u001B[0m");
                findInitials(person, in, out, clientSocket);    //Запускаем поиск по ФИО.
                break;
            case 3:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[33mСледуйте инструкциям:\u001B[0m");
                changeData(person, in, out, clientSocket);  //Запускаем процесс изменения информации.
                break;
            case 4:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[33mСледуйте инструкциям:\u001B[0m");
                addPortfolio(person, in, out, clientSocket);    //Запускаем процесс добавления дела.
                break;
            case 5:
                out.writeUTF("ActionAccept");
                out.writeUTF("\u001B[33mВаш результат:\u001B[0m");
                removePortfolio(person, in, out, clientSocket); //Запускаем процесс удаления дела.
                break;
            default:
                out.writeUTF("ActionReject");
                out.writeUTF("\u001B[31mВведены неожидаемые данные. Пожалуйста, повторите ваш ввод!\u001B[0m");
                ServerLogic.actionStart( person, in, out, clientSocket);
        }
    }

    //Метод удаления дела.
    private void removePortfolio(Person person, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException {
        out.writeUTF("Введите ID дела, которое вы хотите удалить.");
        //// TODO: 11/9/19 Велосипед?
        File folder = new File("/Users/dariaapril/IDEA projects/TrainingProjectSixApplicationThree/src/main/java/server/base");
        File[] files = folder.listFiles();
        String filePath = "/Users/dariaapril/IDEA projects/TrainingProjectSixApplicationThree/src/main/java/server/base/student" +in.readUTF() + ".xml";
        int count = 0;
        for(File file : files){
            if(file.toString().equals(filePath)){
                file.delete();
                out.writeUTF("Файл удален.");
                count++;
                out.writeUTF("quit");
            }
        }
        if(count == 0){
            out.writeUTF("Файл не найден.");
            out.writeUTF("quit");
        }
    }

    //Метод добавления дела.
    private void addPortfolio(Person person, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException {
        out.writeUTF("Введите ФИО, возраст и средний балл студента через пробел.");
        String[] buf = in.readUTF().split(" ");
        if(buf.length != 5){
            out.writeUTF("Неожидаемые данные. Попробуйте ещё раз.");
            out.writeUTF("quit");
            return;
        }
        Archive archive = Archive.createArchive();
        int id = archive.getDocuments().get(0).getId() + 1;
        File file = new File("/Users/dariaapril/IDEA projects/TrainingProjectSixApplicationThree/src/main/java/server/base/student" + id + ".xml");
        MyWriter.writeFile(file, buf, id);
        out.writeUTF("Файл с делом создан.");
        out.writeUTF("quit");
    }

    //Метод изменения дела.
    private void changeData(Person person, DataInputStream in, DataOutputStream out, Socket clientSocket) throws IOException, ParserConfigurationException, SAXException, TransformerException {
        out.writeUTF("Введите ID дела для изменения");
        int id = Integer.parseInt(in.readUTF());
        Archive archive = Archive.createArchive();
        int count = 0;
        Document result = null;
        for(Document document: archive.getDocuments()){
            if(document.getId() == id){
                count++;
                result = document;
                out.writeUTF("\u001B[37mКакое поле вы хотите изменить?(Введите название поля из списка)\n\u001B[0m" + result.toString());
            }
        }
        if(count == 0){
            out.writeUTF("Дело с таким ID не найдено.");
            out.writeUTF("quit");
            return;
        }
        out.writeUTF("input");
        String choice = in.readUTF();
        switch (choice){
            case "First_Name":
                out.writeUTF("Введите новое имя.");
                changeHelper(id,choice,in,out);
                break;
            case "Second_Name":
                out.writeUTF("Введите новую фамилию.");
                changeHelper(id,choice,in,out);
                break;
            case "Patronymic":
                out.writeUTF("Введите новое отчество.");
                changeHelper(id,choice,in,out);
                break;
            case "Age":
                out.writeUTF("Введите новый возраст.");
                changeHelper(id,choice,in,out);
                break;
            case "Characteristic":
                out.writeUTF("Введите новую характеристику.");
                changeHelper(id,choice,in,out);
                break;
            case "Average_Mark":
                out.writeUTF("Введите новый средний балл.");
                changeHelper(id,choice,in,out);
                break;
            case "Other_Marks":
                out.writeUTF("Введите новые заметки.");
                changeHelper(id,choice,in,out);
                break;
                default:
                    out.writeUTF("Получены неожидаемые данные. Попробуйте ещё раз.");
                    out.writeUTF("quit");
        }
    }

    //Внутренний метод, чтобы не повторять блоки кода.
    private static void changeHelper(int id, String choice, DataInputStream in, DataOutputStream out) throws IOException, TransformerException, SAXException, ParserConfigurationException {
        out.writeUTF("input");
        String string = in.readUTF();
        MyWriter.change(id, string, choice);
        out.writeUTF("quit");
    }

}
