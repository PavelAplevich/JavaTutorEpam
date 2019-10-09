package one.dimensional.arrays;

/*
    Одномерные массивы.
    Задание №6.
    Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковы номера которых являются
    простыми числами.
 */

public class TaskSix {
    public static void main(String[] args) {
        double[] array = {0, 2, 0.1, 2561.1, 11,  3, 10, 1};
        arraysTaskSix(array);
    }

    public static void arraysTaskSix(double[] a){       //Метод вывода суммы элементов под простыми порядковыми числами
        double summary = 0;
        for(int i = 2; i < a.length; i++){
            if(primeNumber(i)){
                summary+=a[i];
            }
        }
        System.out.println(summary);
    }
    public static boolean primeNumber( int number){     //метод для определения простоты числа перебором
        for (int i = 2; i < number; i++ ){              //(не подходит для больших чисел)
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }
}
