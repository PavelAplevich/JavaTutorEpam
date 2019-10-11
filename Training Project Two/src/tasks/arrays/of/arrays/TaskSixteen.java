package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №16.
    Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из чисел
    1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны
    между собой. Построить такой квадрат. Пример магического квадрата порядка 3:

                            6  1  8
                            7  5  3
                            2  9  4
     */

public class TaskSixteen {

    final static int N = 3;
    public static int randomazer = (int)(Math.random()*(N+1));

    public static void main(String[] args) {
        int[][] array = new int[N][N];
        magicSquare(array);
    }

    private static void magicSquare(int[][] array){
        int ruleLine = N*(N*N+1)/2;

        for(int column = 0;column < array.length;column++){
            for(int line = 0;line < array[column].length;line++){
                   array[column][line] = line+column*N+1;
            }
        }
        int sumLine = 0;
        int sumColumn = 0;
        int sumMainDiag = 0;
        int sumDiag = 0;
        for(int column = 0;column < array.length;column++){
            for(int line = 0;line < array.length;line++){
                sumLine+=array[column][line];
                sumColumn+=array[line][column];
                sumMainDiag+=array[line][line];
                sumDiag+=array[array.length-line][array.length-line];
            }
        }
    }
}

