import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputText(){
        System.out.println("Введите полный путь к вашему тексту. Спасибо!");
        String str = readText();
        return str;
    }

    private static String readText() throws IOException {
        String str = "";
        String file = scanner.nextLine();

        try {
            FileReader reader = new FileReader(file);
        } catch (IOException e){
            System.out.println("Введите корректный путь к файлу. Спасибо!");
            readText();
        }
        Files.lines(Paths.get(file));
        return str;
    }

    public static int chooseAction(){
        System.out.println("Введите номер действия, которое вы хотите произвести: ");
        System.out.println("№1: Отсортировать абзацы по количеству предложений.");
        System.out.println("№2: В каждом предложении отсортировать слова по длине.");
        System.out.println("№3: Отсортировать лексемы в предложении по убыванию количества вхождений " +
                " заданного символа, а в случае равенства - по алфавиту.");
        if(incorrectInput(scanner.nextInt())){
            System.out.println("Неккоректный ввод, попробуйте ещё раз. Спасибо!");
            chooseAction();
        }
        return scanner.nextInt();

    }

    private static boolean incorrectInput(int choose){
        return choose != 1 && choose != 2 && choose != 3;
    }
}
