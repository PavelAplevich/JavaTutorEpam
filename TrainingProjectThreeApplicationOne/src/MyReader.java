import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Класс отвечает за различные считывания информации.
public class MyReader {

    //Метод считывания пути к файлу и файла по этому пути.
    public String readFile(){
        Scanner scanner = new Scanner(System.in);
        String str = "";
        File file = new File (scanner.nextLine());
        try{                                //Считывание файла по введенному пути
            scanner = new Scanner(file);
        }   catch (FileNotFoundException e){    //Обработка исключений через рекурсию
            new Output().stringOutLnRed("Введите корректный путь к файлу. Спасибо! ");
            return readFile();
        }
        while(scanner.hasNext()){
            str+=scanner.nextLine()+"\n";   //Считывание текста до конца в одну строку
        }
        scanner.close();
        return str;
    }

    //Метод считывания текста из консоли.
    public String readConsole(){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String str = "";
        while (true){
            input = scanner.nextLine();
            if(input.equals("EXIT")){       //Цикл считывания текста из консоли до ввода EXIT.
                break;
            }
            str = str.concat(input + "\n");
        }
        if(str.equals("")){                 //Если EXIT введен сразу, программа предлагает продолжить работу.
            new Output().stringOutLnCyan("Вы хотите продолжить работу? да/нет");
            new Input().workContinue();
            System.exit(0);
        }
        return str;
    }

    //Чтение одного символа из ввода.
    public String readSymbol(){
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();
        Pattern pattern = Pattern.compile("[,.?!'\"><@#$%^&*()]");
        Matcher matcher = pattern.matcher(symbol);
        if(symbol.length() != 1 || matcher.find()){
            new Output().stringOutLnRed("Введите корректный символ. Спасибо! ");
            readSymbol();
        }
        return symbol;
    }

    //Считывание выбора пользователя.
    public int readChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        try{
            choice = scanner.nextInt();
        }catch (InputMismatchException e){
            new Output().stringOutLnRed("Неккоректный ввод, попробуйте ещё раз. Спасибо!\n");
            return readChoice();
        }
        if(incorrectInput(choice)){
            new Output().stringOutLnRed("Неккоректный ввод, попробуйте ещё раз. Спасибо!\n");
            return readChoice();
        } else {
            return choice;
        }
    }

    //Считывание выбора пользователя по продлению работы с программой.
    public void readWorkContinue(){
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if(incorrectInput(choice)){
            new Output().stringOutLnRed("Неккоректный ввод. Пожалуйста повторите. Спасибо!");
            readWorkContinue();
        } else if(choice.equals("да")){
            Main.run();
        }else{
            new Output().stringOutLnCyan("Спасибо! До свидания!");
        }
    }

    //Метод проверки корректности ввода для выбора действия над текстом. Перегружен для выбора продолжения работы.
    private boolean incorrectInput(int choice){
        return choice != 1 && choice != 2 && choice != 3;
    }

    private boolean incorrectInput(String choice){
        return !(choice.equals("да") || choice.equals("нет"));
    }
}
