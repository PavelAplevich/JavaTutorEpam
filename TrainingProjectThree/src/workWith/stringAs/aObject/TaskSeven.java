package workWith.stringAs.aObject;

/*
    Работа со строкой как с объектом типа String или StringBuilder.
    Задание №7.
    Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
    "abc cde def", то должно быть "abcdef".
 */

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(deletePairAndSpace(str));
    }


    //Метод убирает из строки все пробелы и все повторяющиеся символы, оставляя последний из повторения.
    //Метод чувствителен к регистру.
    public static String deletePairAndSpace(String str){
        str = str.replaceAll(" ", "");
        String[] array = str.split("");
        str = "";
        for(int i = 0; i < array.length; i++){
            int count = 0;
            for(int j = i+1; j < array.length;j++){
                if(array[j].equals(array[i])){
                    count+=1;
                    break;
                }
            }
            if(count == 0){
            str+="" + array[i];
            }
        }
        return str;
    }
}
