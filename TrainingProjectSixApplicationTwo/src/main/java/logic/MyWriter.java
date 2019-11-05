package logic;

import note.Note;
import note.NotePad;

import java.io.FileWriter;
import java.io.IOException;

//Класс реализующий запись заметок в файл.
public class MyWriter {
    public static void writeNotePad(NotePad notePad) throws IOException {
        FileWriter fileWriter = new FileWriter(Path.getNotes(), false);
        for(Note x: notePad.getNotepad()){
            fileWriter.write("<NOTE BEGIN>\n");
            fileWriter.write(x.toString());
            fileWriter.write("\n<NOTE END>\n");
        }
        fileWriter.close();
    }
}
