package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №14.
    Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце
    число единиц равно номеру столбца.
     */

public class TaskFourteen {

    final static int ONE = 1;       //Константы. Для быстрого заполнения матрицы другими значениями, если необходимо,
    final static int ZERO = 0;      //или изменения максимального случайного числа для генерации.
    final static int RANDOM = 20;

    public static void main(String[] args) {
        int m = (int)(Math.random()*RANDOM);    //
        int n = (int)(Math.random()*RANDOM);
        int [][] array = new int[m][n];
        printMyMatrix(array);
    }

    private static void printMyMatrix(int[][] array){       //Метод, принимает сгенерированную матрицу и выводит её.
        for (int column = 0; column < array.length;column++){
            for(int line = 0; line < array[column].length;line++){
                if(line < column){
                System.out.print(ONE + " ");
                } else {
                    System.out.print(ZERO + " ");
                }
            }
            System.out.println();
        }
    }
}

