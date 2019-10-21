package workWith.stringAs.aObject;

/*
    Работа со строкой как с объектом типа String или StringBuilder.
    Задание №3.
    Проверить, является ли заданное слово палиндромом.
 */


public class TaskThree {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закомментированный хардкод, использованный мной для проверки

//        String str = "  А роза упала на лапу Азора";
//        System.out.println(str);
//        System.out.println("Это слово палиндром? " + isPalindrome(str));
    }

    /*
    Метод отвечает, является ли переданная строка палидромом. Метод игнорирует регистр букв, количество пробелов
    между словами и пробелы в начале и конце строки.
     */

    public static boolean isPalindrome(String str){
        str = str.toLowerCase(); //Приводим все буквы к одному регистру
        str = str.replaceAll(" ", "");  //Убираем все пробелы
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length/2;i++){
            if(array[i] != array[array.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
