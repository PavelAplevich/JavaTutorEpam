package workWith.stringAs.arrayOf.characters;
// TODO: 15.10.2019 Делать здесь
/*
    Работа со строкой как с массивом символов.
    Задание №4.
    В строке найти количество чисел.
 */

public class TaskFour {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закомментированный хардкод, использованный мной для проверки

        String str = "12.3//a..3 4..wase.t56hdfh5..qwq//.j.fj./.....,,wte4";
        System.out.println("Количество чисел в строке: " + countNumberInString(str));
    }

    //Метод возвращает количество чисел в сроке
    public static int countNumberInString(String str){
        int count = 0;
        char[] array = str.toCharArray();
        for(int i = 0; i < array.length;i++){
            if(isNumeral(array[i])){
                for(int j)
            }
        }
        return count;
    }

    public static boolean isNumeral(char numeral){
        return numeral >= 48 && numeral <= 57;
    }

}
