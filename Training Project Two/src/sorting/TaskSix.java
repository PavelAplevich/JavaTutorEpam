package sorting;

    /*
    Одномерные массивы. Сортировки.
    Задача №6.
    Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это
    следующим образом: сравниваются два соседних элемента Ai и Ai+1. Если Ai <= Ai+1, то продвигаются на один элемент
    вперед. Если Ai > Ai+1, то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой
    сортировки.

     */

import java.util.Arrays;

public class TaskSix {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

//        double[] array = { 3.3, -0.1, -1, 0, 0, 2, 4, 78, 111, 8923, -2, 44, -18.18, -777.7, 111, 11.1234};
//        System.out.println(Arrays.toString(shellSortArray(array)));
    }

    //Метод выполняющий заданную сортировку.
    public static double[] shellSortArray(double[] array){
        for(int i = 0; i < array.length - 1;){
            if(array[i] <= array[i+1]){
                i++;
            } else{
                double buf = array[i];
                array[i] = array[i+1];
                array[i+1] = buf;
                if(i!=0){
                i--;}
            }
        }
        return array;
    }
}
