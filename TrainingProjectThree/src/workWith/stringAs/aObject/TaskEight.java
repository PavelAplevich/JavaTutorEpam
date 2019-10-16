package workWith.stringAs.aObject;

/*
    Работа со строкой как с объектом типа String или StringBuilder.
    Задание №8.
    Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда
    самых длинных слов может быть несколько, не обработывать.
*/

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(theLongestWord(str));
    }

    //Метод возвращает самое длинное слово из заданной строки игнорируя множественные пробелы
    public static String theLongestWord(String str){
        String max = "";
        str = str.replaceAll(" {2,}", " "); //Убираем лишние пробелы
        String[] array = str.split(" ");                //Создаем массив слов
        for(int i = 0; i < array.length; i++){                //Циклом находим самое длинное слово
            if(array[i].length() > max.length()){
                max = array[i];
            }
        }
        return max;
    }
}
