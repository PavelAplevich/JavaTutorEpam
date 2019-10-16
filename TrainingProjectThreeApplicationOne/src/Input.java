import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputText(){
        System.out.println("Введите ваш текст. После окончания ввода нажмите Enter. Спасибо!");
        String str = scanner.nextLine();
        return str;
    }

    public static void chooseAction(){
        System.out.println("Введите номер действия, которое вы хотите произвести: ");
        System.out.println("№1: Отсортировать абзацы по количеству предложений.");
    }
}
