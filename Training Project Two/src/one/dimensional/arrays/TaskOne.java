/*
    Все задания по одномерным массивам представлены в виде отдельных классов в пакете one.dimensional.arrays.
    Остальные задания из второй части заданий также буду представлены в отдельных пакетах.
 */
package one.dimensional.arrays;
/*
    Одномерные массивы.
    Задание №1.
    В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class TaskOne {

    public static void main(String[] args) {

        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

//        int[] A = {0,2,3,4,5,6,7,8,9,11,4,15};
//        double K = 1;
//        System.out.println(arraysTaskOne(K,A));
    }

    public static double arraysTaskOne(double K, int[] A){ //Метод принимающий массив и аргумент, возвращает результат
        double result = 0;                                 //сложения кратных К элементов.
        for (int i = 0 ; i < A.length; i++){
            if((A[i]%K) == 0){
                result += A[i];
            }
        }
        return result;
    }
}
