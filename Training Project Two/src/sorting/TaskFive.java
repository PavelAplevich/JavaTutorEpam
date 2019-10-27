package sorting;

    /*
    Одномерные массивы. Сортировки.
    Задача №5.
    Сортировка вставками. Дана последовательность чисел A1, A2, A3 ... An. Требуется переставить числа в порядке
    возрастания. Делается это следующим образом. Пусть A1, A2, ... Ai - упорядоченная последовательность, т.е.
    A1 <= A2 <= A3 ... An. Берется следующее число Ai+1 и вставляется в последовательность так, чтобы новая
    последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
    не будут перебраны. Примечание. Место помещения очередного элемента в осортированную часть производить
    с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

     */

import java.util.Arrays;

public class TaskFive {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

//        double[] array = { 3.3, -0.1, -1, 0, 0, 2, 4, 78, 111, 8923, -2, 44, -18.18, -777.7, 111, 11.1234};
//        System.out.println(Arrays.toString(insertionSortArray(array)));
    }

    //Метод сортировки вставками.
    private static double[] insertionSortArray(double[] array){
        for (int i = 1; i < array.length; i++) {
            double key = array[i];
            int index = binarySearch(array,0, i, key);
            for(int j = i; j!=index;j--){
                array[j] = array[j-1];
            }
            array[index] = key;
        }
        return array;
    }

    //Метод бинарного поиска индекса вставки.
    private static int binarySearch(double[] array, int left, int right, double key) {
        int middle =left + (right - left) / 2;
        if(array[middle] == key){return middle+1;}  //Условие обработки повторений.
        if(middle==0){                              //Условия для предотвращения попытки доступа к -1 элементу массива.
            if(key < array[middle]){
                return middle;
            } else{
                return middle + 1;
            }
        }
        if(key < array[middle] && key > array[middle - 1]){
            return middle;
        } else if(key < array[middle]){
            return binarySearch(array, left, middle, key);
        } else if(key > array[middle] && key <= array[middle + 1]){
            return middle+1;
        } else {
            return binarySearch(array,middle,right,key);
        }
    }
}
