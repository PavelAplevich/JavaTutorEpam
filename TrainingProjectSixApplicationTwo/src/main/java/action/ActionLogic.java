package action;

import logic.MyReader;
import note.Note;
import note.NotePad;
import output.Output;

import java.time.LocalDate;

public class ActionLogic {

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

    public static void findNote(NotePad notePad) {
    }

    public static void printNotes(NotePad notePad) {
        int count = 1;
        for(Note x: notePad.getNotepad()){
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

    public static void removeNotes(NotePad notePad) {
    }
}
