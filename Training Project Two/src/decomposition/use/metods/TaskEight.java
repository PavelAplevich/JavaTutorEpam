package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №8.
    Задан массив D. Определить следующие суммы: D1 + D2 + D3; D2 + D3 + D4; Di-2 + Di-1 + Di. Пояснение.
    Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
    с номерами от k до m.
    */

public class TaskEight {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки.

        double[] array = {0.1, -2, -4, 15, 675, 91965, 12, -5166, -0.245, 2566};
        int K = 7;
        int M = 1;
        printSum(array, K, M);
    }

    /*  Метод принимает массив и два индекса элементов этого массива с разницей более чем в 3 позиции, которые
        обозначают границы внутреннего массива, и выводит сумму каждой последовательной тройки элементов в
        этом внутреннем массиве.
     */

    public static void printSum(double[] array, int left, int right){
        if(Math.max(left,right) > array.length || Math.abs(left - right) < 3){ //Проверка передаваемых значений
            throw new IllegalArgumentException("Illegal argument in " + Thread.currentThread().getStackTrace()[1]);
        }
        if (left > right){
            printSum(array, right, left);       // Работа с значениями границ, перепутанными местами
            return;
        }
        for(int i = left; i < right-2; i++){
            System.out.println(array[i]+array[i+1]+array[i+2]); //Вывод сумм троек элементов
        }
    }
}
