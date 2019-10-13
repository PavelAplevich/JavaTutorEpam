package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №5.
    Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое
    меньше максимального элемента массива, но больше всех других элементов).
    */

public class TaskFive {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки.

//        double[] array = {0.1, 0, 2, 44, -4, -10.1, 985, 14124, -1};
//        System.out.println(array[arrayMaxTwo(array)]);
    }

    //Метод возврата индекса максимального значения элемента массива
    public static int arrayMax(double[] array){
        int maxIndex = 0;
        for ( int i = 0; i < array.length; i++){
            if(array[maxIndex] < array[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    //Метод возврата индекса второго числа по величине после максимального элемента массива
    public static int arrayMaxTwo(double[] array){
        int maxIndex = arrayMax(array);
        array[maxIndex] = maxIndex > 0 ? array[maxIndex-1]:array[maxIndex+1];
        int maxIndexTwo = 0;
        for( int i = 0; i < array.length; i++){
            if(maxIndexTwo < array[i]){
                maxIndexTwo = i;
            }
        }
        return maxIndexTwo;
    }
}
