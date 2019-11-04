package logic;

import action.Action;
import note.NotePad;
import output.Output;

public class Run {
    public static void run(NotePad notePad){
        Output.printPurple("Что вы хотите сделать?");
        Output.printCyan("1. Добавить заметку.\n" +
                "2. Найти заметку.\n" +
                "3. Вывести список всех заметок.\n" +
                "4. Удалить заметку.");
        Action.doAction(notePad, Action.chooseAction());
    }
}
