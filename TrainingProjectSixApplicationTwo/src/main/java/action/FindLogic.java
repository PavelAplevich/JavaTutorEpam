package action;

import logic.MyReader;
import note.Note;
import note.NotePad;
import output.Output;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Класс, реализующий логику работы поиска по заметкам.
public class FindLogic {

    //Метод поиска по тексту заметки.
    public static void findMessage(NotePad notePad) throws InterruptedException {
        Output.printBlue("Введите слово для поиска..");
        Scanner scanner = new Scanner(System.in);
        String result = "";
        if(scanner.hasNext()){
            result = scanner.nextLine();
        } else {
            Output.printRed("Некорректный ввод. Пожалуйста повторите.");
            findTopic(notePad);
            return;
        }
        Pattern pattern = Pattern.compile(result, Pattern.CASE_INSENSITIVE);
        int count = 1;
        for(Note x: notePad.getNotepad()){
            Matcher matcher = pattern.matcher(x.getMessage());
            if(matcher.find()){
                Thread.sleep(400);
                if(count%2==0){
                    Output.printYellow(x.toString());
                    count++;
                } else {
                    Output.printWhite(x.toString());
                    count++;
                }
            }
        }
        if(count == 1 ){
            Output.printRed("Совпадений не найдено..");
        }
    }

    //Метод поиска по топикам заметок.
    public static void findTopic(NotePad notePad) throws InterruptedException {
        Output.printBlue("Введите слово для поиска..");
        Scanner scanner = new Scanner(System.in);
        String result = "";
        if(scanner.hasNext()){
            result = scanner.nextLine();
        } else {
            Output.printRed("Некорректный ввод. Пожалуйста повторите.");
            findTopic(notePad);
            return;
        }
        Pattern pattern = Pattern.compile(result, Pattern.CASE_INSENSITIVE);
        int count = 1;
        for(Note x: notePad.getNotepad()){
            Matcher matcher = pattern.matcher(x.getTopic());
            if(matcher.find()){
                Thread.sleep(400);
                if(count%2==0){
                    Output.printGreen(x.toString());
                    count++;
                } else {
                    Output.printCyan(x.toString());
                    count++;
                }
            }
        }
        if(count == 1 ){
            Output.printRed("Совпадений не найдено..");
        }
    }

    //Метод поиска по e-mail.
    public static void findEmail(NotePad notePad) throws InterruptedException {
        Output.printBlue("Введите email для поиска..");
        String email = MyReader.getEmail();
        int count = 1;
        Output.printBlue("Найденные результаты:");
        for(Note x: notePad.getNotepad()){
            if(email.equals(x.getEmail())){
                Thread.sleep(400);
                if(count%2==0){
                Output.printPurple(x.toString());
                count++;
                } else {
                    Output.printGreen(x.toString());
                    count++;
                }
            }
        }
        if(count==1){
            Output.printRed("Совпадений не найдено.");
        }
    }

    //Метод поиска по дате.
    public static void findDate(NotePad notePad) throws InterruptedException {
        LocalDate date = MyReader.getDate();
        int count = 1;
        for(Note x: notePad.getNotepad()){
            if(date.equals(x.getDate())){
                Thread.sleep(400);
                if(count%2==0){
                    Output.printPurple(x.toString());
                    count++;
                } else {
                    Output.printCyan(x.toString());
                    count++;
                }
            }
        }
        if(count == 1){
            Output.printRed("Совпадений не найдено..");
        }
    }

    //Метод поиска по топикам и текстам заметок.
    public static void findTopicOrMessage(NotePad notePad) throws InterruptedException {
        Output.printBlue("Введите слово для поиска..");
        Scanner scanner = new Scanner(System.in);
        String result = "";
        if(scanner.hasNext()){
            result = scanner.nextLine();
        } else {
            Output.printRed("Некорректный ввод. Пожалуйста повторите.");
            findTopicOrMessage(notePad);
            return;
        }
        Pattern pattern = Pattern.compile(result, Pattern.CASE_INSENSITIVE);
        int count = 1;
        for(Note x: notePad.getNotepad()){
            Matcher matcher = pattern.matcher(x.getTopic());
            Matcher matcher1 = pattern.matcher(x.getMessage());
            if(matcher.find() || matcher1.find()){
                Thread.sleep(400);
                if(count%2==0){
                    Output.printGreen(x.toString());
                    count++;
                } else {
                    Output.printCyan(x.toString());
                    count++;
                }
            }
        }
        if(count == 1 ){
            Output.printRed("Совпадений не найдено..");
        }
    }
}
