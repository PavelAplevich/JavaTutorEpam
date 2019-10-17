import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Класс отвечает за обработку ввода текста
public class Input {

    //Публичный метод выдает приветственное сообщение и вызывает методы считывания
    public static String inputText(){
        System.out.println("Введите полный путь к вашему тексту. Спасибо!");
        return readText();
    }

    //Публичный метод для выбора действия над текстом. Выводит сообщения выбора и возвращает ввод пользователя.
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
            System.out.println("Неккоректный ввод, попробуйте ещё раз. Спасибо!"); //Обработка неккоректного ввода
            return chooseAction();                                              //через рекурсию.
        } else {
        return choice;
        }
    }

    //Метод определяет желает ли пользователь продолжить работу с программой
    public static void workContinue(){
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if(incorrectInput(choice)){
            System.out.println("Неккоректный ввод. Пожалуйста повторите. Спасибо!");
            workContinue();
        } else if(choice.equals("да")){
            Main.run();
        }else{
            System.out.println("Спасибо! До свидания!");
        }
    }

    //Метод считывания пути к файлу и файла по этому пути.
    private static String readText(){
        Scanner scanner = new Scanner(System.in);
        String str = "";
        File file = new File (scanner.nextLine());
        try{                                //Считывание файла по введенному пути
            scanner = new Scanner(file);
        }   catch (FileNotFoundException e){    //Обработка исключений через рекурсию
            System.out.println("Введите корректный путь к файлу. Спасибо! ");
            return readText();
        }
        while(scanner.hasNext()){
            str+=scanner.nextLine()+"\n";   //Считывание текста до конца в одну строку
        }
        scanner.close();
        return str;
    }

    //Метод проверки корректности ввода для выбора действия над текстом. Перегружен для выбора продолжения работы.
    private static boolean incorrectInput(int choice){
        return choice != 1 && choice != 2 && choice != 3;
    }

    private static boolean incorrectInput(String choice){
        return !(choice.equals("да") || choice.equals("нет"));
    }
}
