import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {


    public static String inputText(){
        System.out.println("Введите полный путь к вашему тексту. Спасибо!");
        return readText();
    }

    private static String readText(){
        Scanner scanner = new Scanner(System.in);
        String str = "";
        File file = new File (scanner.nextLine());
        try{
            scanner = new Scanner(file);
        }   catch (FileNotFoundException e){
            System.out.println("Введите корректный путь к файлу. Спасибо! ");
            return readText();
        }
        while(scanner.hasNext()){
            str+=scanner.nextLine()+"\n";
        }
        scanner.close();
        return str;
    }

    public static int chooseAction(){
        System.out.println("Введите номер действия, которое вы хотите произвести: ");
        System.out.println("1. Отсортировать абзацы по количеству предложений. " +
                "(Абзацы должны быть выделены символом табуляции");
        System.out.println("2. В каждом предложении отсортировать слова по длине.");
        System.out.println("3. Отсортировать лексемы в предложении по убыванию количества вхождений " +
                " заданного символа, а в случае равенства - по алфавиту.");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(incorrectInput(choice)){
            System.out.println("Неккоректный ввод, попробуйте ещё раз. Спасибо!");
            return chooseAction();
        } else {
        return choice;
        }
    }

    private static boolean incorrectInput(int choice){
        return choice != 1 && choice != 2 && choice != 3;
    }
}
