package one.dimensional.arrays;

public class TaskEight {
    public static void main(String[] args) {
    }

    public static double arrayMin(double[] a){          //Метод нахождения минимального значения массива
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

    public static int arrayEqualMinCount(double[] a, double min){   //Количество элементов эквивалентных минимальному
        int count = 0;
        for(double x: a){
            if( x == min){
                count++;
            }
        }
        return count;
    }

    public static double[] arrayResult(double[] a, int count, double min){    //Возврат массива без элементов эквивалентных минимальному
        double[] resultArray = new double[(a.length)-count];
        for (int i = 0, j = 0; i < a.length; i++){
            if(a[i]!=min){
                resultArray[j] = a[i];
                j++;
            }
        }
        return resultArray;
    }

}
