package one.dimensional.arrays;

/*
    Одномерные массивы.
    Задание №7.
    Даны действительные числа А1, А2,...,Аn. Найти:
            max(A1+A2n,A2+A2n-1,...,An+An+1).
 */


public class TaskSeven {
    public static void main(String[] args) {
    //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки.

//        double[] array = {0,1,-2,10,44,15,0.1,-2.3};
//        System.out.println(arrayMaxNumber(arraySort(array)));
    }

    public static double arrayMaxNumber(double[] a){        //Метод нахождения максимального значения массива.
        double max = a[0];
        for (double i: a) {
            if(i > max)
            {max = i;}
        }
        return max;
    }

    public static double[] arraySort(double[] a){           //Метод сортировки массива по сумме двух крайних элементов,
        double[] resultArray = new double[a.length/2];      //возвращет массив сумм.
        for (int i = 0; i < a.length/2; i++){
            resultArray[i] = a[i]+a[a.length-i-1];
        }
        return resultArray;
    }
}
