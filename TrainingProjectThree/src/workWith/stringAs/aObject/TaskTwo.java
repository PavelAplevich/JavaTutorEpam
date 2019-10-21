package workWith.stringAs.aObject;

/*
    Работа со строкой как с объектом типа String или StringBuilder.
    Задание №2.
    В строке вставить после каждого символа 'a' символ 'b'.
 */

public class TaskTwo {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закомментированный хардкод, использованный мной для проверки

//        String str = "aa This is very aaaa long string with aaa in aaaa random place a ";
//        System.out.println(str);
//        System.out.println(insertB(str));
    }

    //Метод вставляет в строку 'b' после каждого 'a'.
    public static String insertB(String str){
        return str.replaceAll("a", "ab");
    }
}
