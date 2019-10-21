package workWith.stringAs.aObject;

/*
    Работа со строкой как с объектом типа String или StringBuilder.
    Задание №5.
    Подсчитать, сколько раз среди символов заданной строки встречается буква "а".
 */

public class TaskFive {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закомментированный хардкод, использованный мной для проверки

//        String str = "  А роза упала на лапу Азора";
//        System.out.println("Количество букв " + "А" +  " в строке: " + countA(str));
    }

    //Метод возвращает количество русских букв "А" в строке.
    public static int countA(String str){
        str = str.toLowerCase();
        str = str.replaceAll("[^а]", "");
        return str.length();
    }
}
