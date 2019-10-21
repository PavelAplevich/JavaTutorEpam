package one.dimensional.arrays;

/*
    Одномерные массивы.
    Задание №10.
    Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент
    (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
*/

public class TaskTen {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки.

//        double[] array = new double[11];
//        for (int i = 0; i<array.length;i++){
//            array[i]=i;
//        }
//        double[] b = zipArray(array);
//        for (double x: b){
//            System.out.print(x + " ");
//        }
    }

    public static double[] zipArray(double[] a){                    //Метод, принимающий массив чисел.
        for(int i = 2,j = 0; i <= (a.length/2+a.length%2); i++){    //Цикл, заменяющий вторые элементы.
            a[i-1] = a[i+j];
            j++;
        }
        for (int i =(a.length/2+a.length%2); i < a.length; i++){     //Цикл, заполняющий хвост массива нулями.
            a[i] = 0;
        }
        return a;
    }
}
