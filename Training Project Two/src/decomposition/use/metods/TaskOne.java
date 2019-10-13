/*
В этом пакете представлены решения задач из раздела "Декомпозиция с использованием методов(подпрограммы)"
В каждом классе представлено решение одной задачи с пояснениями в комментариях. Методы из некоторых заданий использованы
для решения других заданий.
 */
package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №1.
    Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных
    чисел.

     */


public class TaskOne {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки.

//        System.out.println(greatestCommonFactor(22365, 125));
//        System.out.printf("%,d",leastCommonMultiple(2147483646, 214748364));

    }

    public static int greatestCommonDivisor(int a, int b){  //Метод вычисления НОД с проверкой ввода
        if(a < 1 || b < 1){
            throw  new IllegalArgumentException("Illegal argument in : " + Thread.currentThread().getStackTrace()[1]);
        }
        if ( a >= b){
            while ( b != 0){
                int tmp = a%b;
                a = b;
                b = tmp;
            }
            return a;
        } else {
            while ( a != 0){
                int tmp = b%a;
                b = a;
                a = tmp;
            }
            return b;
        }

    }

    public static long leastCommonMultiple(int a, int b){     //Метод вычисления НОК с проверкой ввода
        if(a < 1 || b < 1){
            throw  new IllegalArgumentException("Illegal argument in : " + Thread.currentThread().getStackTrace()[1]);
        }
        long y = Math.multiplyFull(a,b);
        long x = y/ greatestCommonDivisor(a,b);
        return x;
    }
}
