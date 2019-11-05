package logic;

import action.Action;
import note.NotePad;
import output.Output;
import java.util.Scanner;

//Класс основной работы приложения. Реализует общение с пользователем.
public class Run {

    public static void run(NotePad notePad) throws InterruptedException {
        Output.printPurple("Что вы хотите сделать?");
        Output.printCyan("1. Добавить заметку.\n" +
                "2. Найти заметку.\n" +
                "3. Вывести список всех заметок.\n" +
                "4. Удалить заметку.");
        Action.doAction(notePad, Action.chooseAction());
        Output.printBlue("\nВы хотите продолжить работу с программой?\n" +
                "1. Да.\n" +
                "2. Нет.");
        choice(notePad);
    }

    private static void choice(NotePad notePad) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    run(notePad);
                    break;
                case 2:
                    Output.printBlue("Программа закрывается.. До свидания.");
                    return;
                default:
                    Output.printRed("Некорректный ввод. Пожалуйста повторите..");
            }
        } else {
            Output.printRed("Некорректный ввод. Пожалуйста повторите..");
        }
    }
}
