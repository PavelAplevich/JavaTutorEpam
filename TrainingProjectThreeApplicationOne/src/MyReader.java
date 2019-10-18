import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Класс отвечает за различные считывания информации.
public class MyReader {

    //Метод считывания пути к файлу и файла по этому пути.
    public String readText(){
        Scanner scanner = new Scanner(System.in);
        String str = "";
        File file = new File (scanner.nextLine());
        try{                                //Считывание файла по введенному пути
            scanner = new Scanner(file);
        }   catch (FileNotFoundException e){    //Обработка исключений через рекурсию
            new Output().stringOutLn("Введите корректный путь к файлу. Спасибо! ");
            return readText();
        }
        while(scanner.hasNext()){
            str+=scanner.nextLine()+"\n";   //Считывание текста до конца в одну строку
        }
        scanner.close();
        return str;
    }

    //Чтение одного символа из ввода.
    public String readSymbol(){
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();
        Pattern pattern = Pattern.compile("[,.?!'\"><@#$%^&*()]");
        Matcher matcher = pattern.matcher(symbol);
        if(symbol.length() != 1 || matcher.find()){
            new Output().stringOutLn("Введите корректный символ. Спасибо! ");
            readSymbol();
        }
        return symbol;
    }
}
