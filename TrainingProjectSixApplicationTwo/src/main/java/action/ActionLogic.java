package action;

import logic.MyReader;
import note.Note;
import note.NotePad;
import output.Output;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Класс реализующий действия, доступные пользователю.
public class ActionLogic {

    //Метод добавления заметки
    public static void addNote(NotePad notePad) {
        Output.printBlue("Введите топик вашей заметки:");
        String topic = MyReader.getString();
        Output.printBlue("Введите текст вашей заметки:");
        String message = MyReader.getString();
        Output.printBlue("Введите связанный с заметкой E-mail:");
        String email = MyReader.getEmail();
        LocalDate date = LocalDate.now();
        notePad.getNotepad().add(new Note(topic,date,email,message));
    }

    //Метод, реализующий поиск заметок.
    public static void findNote(NotePad notePad) throws InterruptedException {
        Output.printBlue("Выберите тип поиска, который необходим:\n" +
                "1. Поиск по слову в топике.\n" +
                "2. Поиск по слову в сообщении.\n" +
                "3. Поиск по email.\n" +
                "4. Поиск по дате.\n" +
                "5. Поиск по слову в топике или сообщении.");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    FindLogic.findTopic(notePad);
                    break;
                case 2:
                    FindLogic.findMessage(notePad);
                    break;
                case 3:
                    FindLogic.findEmail(notePad);
                    break;
                case 4:
                    FindLogic.findDate(notePad);
                    break;
                case 5:
                    FindLogic.findTopicOrMessage(notePad);
                    break;
                default:
                    Output.printRed("Некорректный ввод. Повторите пожалуйста.");
                    findNote(notePad);
            }
        }
    }

    //Метод вывода на консоль всех заметок.
    public static void printNotes(NotePad notePad) throws InterruptedException {
        ArrayList<Note> buf = notePad.getNotepad();
        Collections.reverse(buf);
        int count = 1;
        for(Note x: buf){
            Thread.sleep(400);
            if((count % 2) == 0){
                Output.printYellow(x.toString());
            } else if((count%3) == 0){
                Output.printBlue(x.toString());
            } else {
                Output.print(x.toString());
            }
            count++;
        }
    }

    //Метод удаления заметки.
    public static void removeNotes(NotePad notePad) throws InterruptedException {
        Output.printBlue("Введите номер заметки, которую вы хотите удалить:");
        Thread.sleep(500);
        int count = 0;
        for(Note x: notePad.getNotepad()){
            count++;
            Output.printGreen(count + ".\n" + x.toString());
        }
        if(count == 0){
            Output.printRed("Нет заметок..");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int choice = scanner.nextInt();
            if(choice < 1 || choice > count){
                Output.printRed("Некорректный ввод. Попробуйте ещё раз.");
                Thread.sleep(500);
                removeNotes(notePad);
                return;
            } else {
                notePad.getNotepad().remove(choice -1 );
            }
        } else {
            Output.printRed("Некорректный ввод. Попробуйте ещё раз.");
            Thread.sleep(500);
            removeNotes(notePad);
        }
    }
}
