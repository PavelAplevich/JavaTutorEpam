package workWith.stringAs.aObject;

/*
    Работа со строкой как с объектом типа String или StringBuilder.
    Задание №4.
    С помощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт".
 */

public class TaskFour {
    public static void main(String[] args) {
        //В main решается задача, без дополнительных методов.

        String str = "информатика";
        char[] array = new char[2];
        str.getChars(3,5,array,0);
        char t = str.charAt(7);
        System.out.println(t + (new String(array)) + t);
    }
}
