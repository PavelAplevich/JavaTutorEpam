package sorting;

    /*
    Одномерные массивы. Сортировки.
    Задача №7.
    Пусть даны две неубывающие последовательности действительных чисел A1 <= A2 <= ... An и B1 <= B2 <= ... Bm.
    Требуется указать те места, на которые нужно вставлять элементы последовательности B1 <= B2 <= ... Bm в первую
    последовательность так, чтобы новая последовательность оставалась возрастающей.

     */

import java.util.Arrays;

public class TaskSeven {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

//        double[] arrayOne = {-777.7, -18.18, -2.0, -1.0, -0.1, 0.0, 0.0, 2.0, 3.3, 4.0, 11.1234, 44.0, 78.0, 111.0, 111.0, 8923.0};
//        double[] arrayTwo = {-666.6, -17.17, -3.0, -1.0, -0.2, 0.0, 1.0, 2.0, 3.3, 4.0, 11.0, 44.1, 78.2, 111.111, 8923.777, 11111};
//        System.out.println(Arrays.toString(mySortArray(arrayOne, arrayTwo)));
    }

    /*
    Метод превращает два неубывающих массива в один неубывающий. Попарно сравниваются элементы массивов и вставляется
    минимальный в результат. Максимальный результ сравнивается со следующим элементом и так до конца одного из
    массивов. Затем результат заполняется числами оставшегося массива.
     */
    public static double[] mySortArray(double[] arrayOne, double[] arrayTwo){
        double[] resultArray = new double[arrayOne.length + arrayTwo.length];
        for(int i = 0, j = 0, k = 0; k < resultArray.length; k++){
            resultArray[k] = Math.min(arrayOne[i],arrayTwo[j]);
            if(Math.min(arrayOne[i],arrayTwo[j]) == arrayOne[i]){
                if(i < arrayOne.length-1){
                    i++;
                } else {
                    for(int x = k+1; x < resultArray.length;x++){
                        resultArray[x] = arrayTwo[j];
                        j++;
                    }
                    break;
                }
            } else{
                if(j < arrayTwo.length-1){
                    j++;
                } else{
                    for(int x = k+1; x < resultArray.length;x++){
                        resultArray[x] = arrayOne[i];
                        i++;
                    }
                    break;
                }

            }
        }
        return resultArray;
    }
}
