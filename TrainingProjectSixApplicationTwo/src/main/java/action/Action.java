package action;

import note.NotePad;
import output.Output;

import java.util.Scanner;

public class Action {

    public static int chooseAction(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                    return choice;
                default:
                    Output.printRed("Неверный ввод. Пожалуйста, повторите.");
                    return chooseAction();
            }
        } else {
            Output.printRed("Неверный ввод. Пожалуйста, повторите.");
            return chooseAction();
        }
    }

    public static void doAction(NotePad notePad, int choice){
        switch (choice){
            case 1:
                ActionLogic.addNote(notePad);
                break;
            case 2:
                ActionLogic.findNote(notePad);
                break;
            case 3:
                ActionLogic.printNotes(notePad);
                break;
            case 4:
                ActionLogic.removeNotes(notePad);
                break;
            default:
                Output.printRed("Something went wrong...");
        }
    }
}
