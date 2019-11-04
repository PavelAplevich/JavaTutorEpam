package note;

import java.util.ArrayList;

public class NotePad {
    private ArrayList<Note> notepad;

    public NotePad(ArrayList<Note> notepad) {
        this.notepad = notepad;
    }

    public ArrayList<Note> getNotepad() {
        return notepad;
    }

    public void setNotepad(ArrayList<Note> notepad) {
        this.notepad = notepad;
    }

    @Override
    public String toString() {
        String result = "";
        for(Note x:notepad){
            result += x.toString() + "\n";
        }
        return result;
    }
}
