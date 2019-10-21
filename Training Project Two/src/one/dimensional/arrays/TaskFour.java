package one.dimensional.arrays;

/*
    Одномерные массивы.
    Задание №4.
    Даны действительные числа А1...Аn. Поменять местами наибольший и наименьший элементы.
 */

public class TaskFour {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

//        double[] A = {0,2,3,4,5,6,7,8,9,11,5,4,15.1};
//        A = arraysTaskFour(A);
//        for(double x: A){ System.out.print(x + " ");}
    }

    public static double[] arraysTaskFour(double[] a){  // Метод выполняющий задачу по смене мест элементов
        int max = 0;
        int min = 0;
        double buf;
        for(int i = 1, j = 1; i < a.length; i++){   //Нахождение максимального числа в массиве
            if(a[i-j] >= a[i]){
                max = i-j;
                j++;
            } else {
                max = i;
                j = 1;
            }
        }

        for(int i = 1, j = 1; i < a.length; i++){   //Нахождение минимального числа в массиве
            if(a[i-j] <= a[i]){
                min = i-j;
                j++;
            } else {
                min = i;
                j = 1;
            }
        }
        buf = a[max];
        a[max] = a[min];                            //Смена местами максимума и минимума
        a[min] = buf;
        return a;
    }
}
