package one.dimensional.arrays;

/*
    Одномерные массивы.
    Задание №2.
    Дана последовательность действительных чисел A1...An. Заменить все её члены, большие данного Z, этим число.
    Подсчитать количество замен.
 */

public class TaskTwo {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

//        double[] A = {0,2,3,4,5,6,7,8,9,11,5,4,15.1};
//        double Z = 5.1;
//        A = arraysTaskTwo(A,Z);
//        for(double x: A){ System.out.print(x + " ");}
    }

    public static double[] arraysTaskTwo(double[] a, double Z){     //Основной метод выводящий количество замен
        int count = 0;                                              //и итоговый массив
        for(int i = 0; i < a.length; i++){
            if (a[i] > Z){
                a[i] = Z;
                count++;
            }
        }
        displayCount(count);
        return a;
    }

    public static void displayCount(int count){                     //Метод подсчета замен
        System.out.println("Число произведенных замен :" + count);
    }
}
