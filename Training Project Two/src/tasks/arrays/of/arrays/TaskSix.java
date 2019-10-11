package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №6.
    Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)

            1   1   1 ... 1   1   1
            0   1   1 ... 1   1   0
            0   0   1 ... 1   0   0
            .......................
            0   1   1 ... 1   1   0
            1   1   1 ... 1   1   1

     */

public class TaskSix {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки

//        int n = 8;
//        printMatrixSix(n);

    }

    public static void printMatrixSix(int n){          //Метод возвращает искомую матрицу
        int[][] array = new int [n][n];
        for(int column = 0; column < array.length/2; column++) {      //Цикл создания верхней части матрицы
            for (int line = 0; line < column; line++) {
                    System.out.print(0 + " ");
            }
            for (int line = 0; line < array[column].length-column*2; line++) {
                    System.out.print(1 + " ");
            }
            for (int line = 0; line < column; line++) {
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
        for(int column = 0; column < array.length/2; column++) {      //Цикл создания нижней части матрицы
            for (int line = 0; line < array.length/2-1-column; line++) {
                System.out.print(0 + " ");
            }
            for (int line = 0; line < column*2+2; line++) {
                System.out.print(1 + " ");
            }
            for (int line = 0; line < array.length/2-1-column; line++) {
                System.out.print(0 + " ");
            }
            System.out.println();
        }

    }
}
