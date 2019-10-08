package one.dimensional.arrays;

public class TaskSeven {
    public static void main(String[] args) {
    }

    public static double arrayMaxNumber(double[] a){        //Метод нахождения максимального значения массива
        double max = 0;
        for (int i = 1, j = 1; i < a.length; i++){
            if (a[i] >= a[i-j]){
                max = a[i];
                j = 1;
            } else {
                max = a[i-j];
                j++;
            }
        }
        return max;
    }

    public static double[] arraySort(double[] a){           //Метод сортировки массива по сумме двух крайних элементов
        double[] resultArray = new double[a.length/2];

        for (int i = 0, j = 0; i < a.length/2; i+=1, j++){
            resultArray[j] = a[i]+a[a.length-i];
        }
        return resultArray;
    }
}
