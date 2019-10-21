package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №4.
    Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):

            1  2   3  ... n
            n n-1 n-2 ... 1
            ...............
            n n-1 n-2 ... 1
     */


public class TaskFour {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

//        int n = 6;
//        printMatrixFour(n);
    }

    public static void printMatrixFour(int n){          //Метод возвращает искомую матрицу
        int[][] array = new int [n][n];
        for(int column = 0; column < array.length; column++){
            for(int line = 0; line < array[column].length;line++){
                if((column+1)%2 != 0) {
                    System.out.print((line+1) + " ");
                } else  {
                    System.out.print((array[column].length-line) + " ");
                }
            }
            System.out.println();
        }
    }
}
