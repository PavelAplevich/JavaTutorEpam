package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №15.
    Найдите наибольший элемент матрицы и замените все нечетные элементы на него.
     */

public class TaskFifteen {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки

        double[][] array ={{1,2,3.3,8},{0.444,0,-2,11},{3,55,-612,45},{1.4,2,6,777}};
        printMyArray(sortArray(array,maxElement(array)));

    }

    private static double maxElement(double[][] array) {            //Метод возвращает максимальный элемент массива
        double max = array[0][0];
        for (int column = 0; column < array.length; column++) {
            for (int line = 0; line < array[column].length; line++) {
                if (array[column][line] > max) {
                    max = array[column][line];
                }
            }
        }
        return max;
    }

    private static double[][] sortArray(double[][] array, double max) { //Метод замены нечетных элементов
        for (int column = 0; column < array.length; column++) {         //на максимальный
            for (int line = 0; line < array[column].length; line++) {
                if (line % 2 == 0 ) {
                    array[column][line] = max;
                }
            }
        }
        return array;
    }

    private static void printMyArray(double[][] array){                 //Метод выводит результат
        for (int column = 0; column < array.length; column++) {
            for (int line = 0; line < array[column].length; line++) {
                System.out.print(array[column][line] + " ");
            }
            System.out.println();
        }
    }
}