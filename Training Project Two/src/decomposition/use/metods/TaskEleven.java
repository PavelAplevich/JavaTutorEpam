package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №11.
    Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
    */

import java.math.BigDecimal;
import java.math.BigInteger;

public class TaskEleven {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки.

//        BigDecimal first = new BigDecimal(Math.random());
//        BigDecimal second = new BigDecimal(Math.random());
//
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(maxNumberCount(first,second));

//        double first = 0.0142;
//        double second  = Math.random()*10;
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(maxNumberCount(first,second));

    }

    public static BigDecimal maxNumberCount (BigDecimal first, BigDecimal second){
        if (((first + " ").length()) > ((second + " ").length())){
            return first;
        } else {
            return second;
        }

    }

    public static double maxNumberCount (double first, double second){
        if (((first + " ").length()) > ((second + " ").length())){
            return first;
        } else {
            return second;
        }
    }

    public static int maxNumberCount (int first, int second){
        if (((first + " ").length()) > ((second + " ").length())){
            return first;
        } else {
            return second;
        }
    }

    public static BigInteger maxNumberCount (BigInteger first, BigInteger second){
        if (((first + " ").length()) > ((second + " ").length())){
            return first;
        } else {
            return second;
        }
    }

    public static float maxNumberCount (float first, float second){
        if (((first + " ").length()) > ((second + " ").length())){
            return first;
        } else {
            return second;
        }
    }
}
