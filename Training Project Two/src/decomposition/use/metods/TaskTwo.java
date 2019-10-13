package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №2.
    Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
    */

import static decomposition.use.metods.TaskOne.greatestCommonDivisor;

public class TaskTwo {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки.

//        System.out.println(greatestCommonDivisorFour(12, 48, 64, 256));
    }

    public static int greatestCommonDivisorFour(int a, int b, int c, int d){ // Метод нахождения НОД четырех чисел с проверкой
        if(a < 1 || b < 1 || c < 1 || d < 1){
            throw  new IllegalArgumentException("Illegal argument in : " + Thread.currentThread().getStackTrace()[1]);
        }
        //Метод возвращает НОД от НОД попарно взятых чисел. Метод для НОД двух чисел взят из первого задания
        return greatestCommonDivisor(greatestCommonDivisor(a, b), greatestCommonDivisor(c, d));
    }
}
