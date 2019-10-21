package sorting;
// TODO: 13.10.2019  DODELAT'!

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

public class TaskFive {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

//        double[] array = { 3.3, -0.1, -1, 0, 2, 4, 78, 111, 8923, -2, 44, -18.18, -777.7, 11.1234};
//        insertionSortArray(array);
    }
//
//    private static int binarySearch(double[] array,double key,int left, int right){
//        int middle = left+(right-left)/2;
//        if (key < array[middle]){
//            binarySearch(array,key,left,middle);
//        } else if(key > array[middle]){
//            binarySearch(array,key,middle,right);
//        } else {
//            return middle;
//        }
//    }
//
//    private static void insertionSortArray(double[] array){
//        double[] resultArray = new double[array.length];
//        for(int j = 1; j < array.length; j++){
//            double key = array[j];
//             int i = j-1;
////             binarySearch(array, key, 0, j );
//             while (i >= 0 && array[i] > key){
//                 resultArray[i+1] = resultArray[i];
//                 i--;
//             }
//             resultArray[i+1] = key;
//        }
//        for(double x: resultArray){
//            System.out.print(x + " ");
//        }
//    }
}
