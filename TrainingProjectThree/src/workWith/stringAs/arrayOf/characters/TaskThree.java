package workWith.stringAs.arrayOf.characters;

/*
    Работа со строкой как с массивом символов.
    Задание №3.
    В строке найти количество цифр.
 */

public class TaskThree {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закоментированный хардкод, использованный мной для проверки

        String str = "12.34 awwy 5 je 67Ah";
        System.out.println("Количество цифр в строке: " + countNumeralInString(str));
    }

//    //Метод возвращает количество цифр в строке
//    public static int countNumeralInString(String str){
//        str = str.replaceAll("\\D","");
//        return str.length();
//    }

    //Метод возвращает количество цифр в сроке
    public static int countNumeralInString(String str){
        int count = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++){
            if(isNumeral(array[i])){
                count++;
            }
        }
        return count;
    }

    //Метод отвечает является ли переданный символ цифрой
    public static boolean isNumeral(char numeral){
        return  numeral >=48 && numeral < 57;
    }
}
