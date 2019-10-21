package one.dimensional.arrays;

/*
    Одномерные массивы.
    Задание №8.
    Дана последовательность целых чисел A1,A2,...,An. Образовать новую последовательность, выбросив из
    исходной те члены, которые равны min(A1,A2,...,An).
 */

public class TaskEight {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки.

//        double[] array = {0, -1, 1, 2, -3, 4, 111, -11.345, 16, 9888, -11.345, 15, -11.345};
//        double[] result = arrayResult(array,arrayEqualMinCount(array,arrayMin(array)),arrayMin(array));
//        for (double x:result){ System.out.print(x + " ");}
    }

    public static double arrayMin(double[] a){          //Метод нахождения минимального значения массива.
        double min = 0;
        for (int i = 1, j = 1; i < a.length; i++){
            if(a[i] <= a[i-j]){
                min = a[i];
                j=1;
            } else {
                min = a[i-j];
                j++;
            }
        }
        return min;
    }

    public static int arrayEqualMinCount(double[] a, double min){   //Количество элементов эквивалентных минимальному.
        int count = 0;
        for(double x: a){
            if( x == min){
                count++;
            }
        }
        return count;
    }

    public static double[] arrayResult(double[] a, int count, double min){    //Возврат массива без
        double[] resultArray = new double[(a.length)-count];                  //элементов эквивалентных минимальному.
        for (int i = 0, j = 0; i < a.length; i++){
            if(a[i]!=min){
                resultArray[j] = a[i];
                j++;
            }
        }
        return resultArray;
    }

}
