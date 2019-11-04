package logic;

import note.Note;
import output.Output;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MyReader {

    public static String getString() {
        String result = "";
        Output.printRed("После окончания ввода строки, на новой строке введите \"EXIT\" и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while(!line.equals("EXIT")){
            result = result.concat("\n" + line);
            line = scanner.nextLine();
        }
        if (result.length() == 0){
            Output.printRed("Не оставляйте пустых полей, пожалуйста!");
            return getString();
        } else {
            return result;
        }
    }


    public static String getEmail() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if(isValidEmailAddress(line)){
            return "\n" + line;
        } else {
            Output.printRed("Введен неккоректный email. Пожалуйста, повторите ввод.");
            return getEmail();
        }

    }

    private static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

    public static ArrayList<Note> getNotePad() throws IOException {
        ArrayList<Note> notes = new ArrayList<>();
        FileReader fileReader = new FileReader(Path.getNotes());
        Scanner scanner = new Scanner(fileReader);
        while(scanner.hasNext()){
            scanner.nextLine();
            scanner.nextLine();
            String topic = "";
            String topicLine = scanner.nextLine();
            while (!(topicLine.equals("Date:"))){
                topic += "\n" + topicLine;
                topicLine = scanner.nextLine();
            }
            String dateString = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern ( "yyyy-MM-dd" , Locale.ENGLISH );
            LocalDate date = LocalDate.parse ( dateString, formatter );
            scanner.nextLine();
            String email = "\n" + scanner.nextLine();
            scanner.nextLine();
            String message = "";
            String messageLine = scanner.nextLine();
            while (!(messageLine.equals("<NOTE END>"))){
                message += "\n" + messageLine;
                messageLine = scanner.nextLine();
            }
            notes.add(new Note(topic,date,email,message));
        }
        fileReader.close();
        return notes;
    }

}
