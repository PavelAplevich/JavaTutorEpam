package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №5.
    Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)

            1   1   1 ... 1
            2   2   2 ... 0
            3   3   ... 0 0
            ...............
            n-1 n-1 0 ... 0
            n   0   0 ... 0
     */

public class TaskFive {
    public static void main(String[] args){
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки

//        int n = 6;
//        printMatrixFive(n);
    }

    public static void printMatrixFive(int n){          //Метод возвращает искомую матрицу
        int[][] array = new int [n][n];
        for(int column = 0; column < array.length; column++){
            for(int line = 0; line < array[column].length-column;line++){
                System.out.print((column+1) + " ");
            }
            for(int zero = array[column].length-column; zero < array[column].length;zero++){
                System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
