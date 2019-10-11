package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №9.
    Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить какой столбец содержит
    максимальную сумм.
     */


public class TaskNine {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки

//        double[][] array ={{1,2,3.3},{0.444,0,2},{3,55,612,45,2,1},{1.4,2,5,6,7,888,0,3}};
//        printTaskNine(array);
    }

    public  static void printTaskNine(double[][] array){    //Метод выводит номер максимального столбца
        double max = 0;                                     //начиная с единицы.
        int maxColumn = -1;
        for(int column = 0; column < array.length; column++){
            double sum = 0;
            for (int line = 0; line < array[column].length; line++){
                sum +=array[column][line];
            }
            if(sum > max) {
                max = sum;
                maxColumn = column;
            }
        }
        System.out.println("Столбец с максимальной суммой №: " + (maxColumn+1));
    }
}
