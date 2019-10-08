package one.dimensional.arrays;

/*
    Одномерные массивы
    Задание №3
    Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
    положительных и нулевых элементов.
 */

public class TaskThree {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки

//        double[] A = {0,2,-3,4,5,6,7,8,9,11,5,4,-15.1};
//        arraysTaskThree(A);
    }

    public static void arraysTaskThree(double[] a){ //Метод выполняющий задачу
        int zeroCount = 0;
        int posCount = 0;
        int negCount = 0;
        for(double x: a){
            if (x > 0){
                posCount++;
            } else if (x < 0){
                negCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.printf("Количество введенных положительных элементов: %d \n" +
                        "Количество введенных отрицательных элементов: %d \n" +
                        "Количество нулей: %d",posCount,negCount,zeroCount);
    }
}
