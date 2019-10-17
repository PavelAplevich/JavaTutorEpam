import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Класс отвечает за выполнение действий над текстом. Имеет один публичный метод для работы с текстом и несколько
//внутренних приватных для логики своей работы.

public class Action {

    //Публичный метод, выполняет заданной действие над входным текстом и вызывает методы вывода
    public static void doAction(int numberAction,String text){
        //Выбор действия в зависимости от переданного номера
        switch (numberAction){
            case 1:
                doActionOne(text);
                break;
            case 2:
                doActionTwo(text);
                break;
            case 3:
                System.out.println("Введите символ для сортировки...");
                String symbol = readSymbol();
                System.out.println();
                doActionThree(text, symbol);
                break;
            default:
                System.out.println("Something went wrong...");
        }
    }

    //Метод выполняет сортировку текста по количеству предложений.
    private static void doActionOne(String text){
        //Передача методу сортировки массива из разбитого по знаку табуляции текста
        String[] result = stringArraySort(text.split("\\t"));
        //Вызов метода вывода
        Output.stringOut(String.join("",result));
    }

    //Метод отсортировывает в каждом предложении все слова по длине.
    private static void doActionTwo(String text){
        text = textFormat(text);
        //Разбиваем текст на массив предложений
        String[] array = text.split("[\\.!\\?]");
        //Регулярное выражения для создания строки, состоящей из символов окончания предложений
        String endSentence = text.replaceAll("[^\\.!\\?]", "");
        //Создание массива окончаний предложений
        String[] endSentenceArray = endSentence.split("");
        //Цикл, в котором мы получаем отсортированную строку
        for(int i = 0; i < array.length; i++){
            //Сортировка строки
            array[i] = String.join(" ", stringArraySort(array[i].split(" ")));
            //Конкатенация строки с её окончанием
            array[i] = array[i].concat(endSentenceArray[i]);
        }
        Output.stringOut(String.join("", array));
    }

    //Метод отсортировывает лексемы в предложении по убыванию количества вхождений заданного символа
    private static void doActionThree(String text, String simbol){
        text = textFormat(text);
        String[] sentenceArray = textFormat(text).split("[\\.!\\?]");
        String[] endSentenceArray = (text.replaceAll("[^\\.!\\?]", "")).split("");
        for(int i = 0; i < sentenceArray.length; i++){
            sentenceArray[i] = sortSentenceSymbol(sentenceArray[i], simbol);
            sentenceArray[i] = sentenceArray[i].concat(endSentenceArray[i] + "\n");
        }
        System.out.println("Ваш результат: \n");
        Output.stringOut(String.join("",sentenceArray));
    }

    //Метод сортирует входящий массив строк по убыванию количества символов элемента
    private static String[] stringArraySort(String[] result){
        //Цикл сортировки через рекурсию
        for(int i = 0; i < result.length-1; i++){
            if(result[i].length() < result[i+1].length()){
                String buf = result[i];
                result[i] = result[i+1];
                result[i+1] = buf;
                stringArraySort(result);
            }
        }
        return result;
    }

    //Метод форматирует строку
    private static String textFormat(String text){
        text = text.trim();
        text = text.replaceAll("\\t" , "");       //Убираем табуляции
        text = text.trim();                                        //Убираем пробелы по краям
        return text;
    }

    private static String[] stringFormatToArray(String sentence){
        sentence = sentence.replaceAll("[,'\"/;]", " ");
        sentence = sentence.replaceAll("\\s{2,}", " ");
        String[] word = sentence.split(" ");
        return word;
    }

    private static String sortSentenceSymbol(String sentence, String simbol){
        sentence = sentence.trim();
        String[] word = stringFormatToArray(sentence);
        for(int i = 0; i < word.length - 1; i++){
            if(simbolCount(word[i], simbol) < simbolCount(word[i+1], simbol)){
                String buf = word[i];
                word[i] = word[i+1];
                word[i+1] = buf;
                i = -1;
            } else if(simbolCount(word[i], simbol) == simbolCount(word[i+1], simbol)){
                word[i] = alphabetSort(word[i],word[i+1]);
                word[i+1] = alphabetSort(word[i],word[i+1]);
                // TODO: 10/18/19 Продолжить здесь! 
            }
        }
        sentence = String.join(" ",word);
        return sentence;
    }

    //Метод принимает два слова в виде массивов и отдает номер первого по алфавиту слова. Номер идет с нуля.
    private static String alphabetSort(String stringOne, String stringTwo){
        System.out.println(stringOne);
        System.out.println(stringTwo);
        char[] arrayOne = stringOne.toCharArray();
        char[] arrayTwo = stringTwo.toCharArray();
        for(int i = 0; i < Math.min(arrayOne.length,arrayTwo.length);i++){
            if((int)Character.toLowerCase(arrayOne[i]) < (int)Character.toLowerCase(arrayTwo[i])){
                return stringOne;
            } else if ((int)Character.toLowerCase(arrayOne[i]) == (int)Character.toLowerCase(arrayTwo[i])){
                continue;
            } else {
                return stringTwo;
            }
        }
        return stringOne;
    }

    //Метод возвращает количество заданных символов в слове(представленном массивом символов)
    private static int simbolCount(String word, String simbol){
        char[] array = word.toCharArray();
        int count = 0;
        for( int i = 0; i < array.length; i++){
            if(array[i] == simbol.charAt(0)){
                count++;
            }
        }
        return count;
    }

    //Чтение одного символа из ввода.
    private static String readSymbol(){
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();
        Pattern pattern = Pattern.compile("[,.?!'\"><@#$%^&*()]");
        Matcher matcher = pattern.matcher(symbol);
        if(symbol.length() != 1 || matcher.find()){
            System.out.println("Введите корректный символ. Спасибо! ");
            readSymbol();
        }
        return symbol;
    }

}
