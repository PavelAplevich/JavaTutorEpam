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

import java.util.Random;

public class TaskSixteen {

    final static int N = 4;         //Размерность матрицы
    final static int RULE = N*(N*N+1)/2;        //Правило магического квадрата для матрицы N x N
    public static Random random = new Random(System.nanoTime()); //Генератор случайного числа

    public static void main(String[] args) {
        int[][] array = new int[N][N];
        for(int column = 0;column < array.length;column++){      //Наполнение массива
            for(int line = 0;line < array[column].length;line++){
                array[column][line] = line+column*N+1;
            }
        }

        array = magicSquare(array);

        for (int column = 0; column < array.length; column++){  //Вывод массива
            for(int line = 0;line < array.length;line++){
                System.out.print(array[column][line] + " ");
            }
            System.out.println();
        }
    }

    /*
    Мой метод генерации магического квадрата заключается в том, что пока не выполнится правило магического квадрата
    для всех линий, столбцов и диагоналей, метод будет переставлять два случайных числа в массиве и рекурсивно вызывать
    себя. Получив таким образом магический квадрат, метод возвращает его. В теории на мощных машинах с
    большим запасом времени можно составить таким образом магический квадрат любой размерности.
     */

    private static int[][] magicSquare(int[][] array){      //Метод генерации магического квадрата
        for(int column = 0;column < array.length;column++){
            int sumLine = 0;
            int sumColumn = 0;
            int sumMainDiag = 0;
            int sumDiag = 0;
            for(int line = 0;line < array.length;line++){
                sumLine+=array[column][line];
                sumColumn+=array[line][column];
                sumMainDiag+=array[line][line];
                sumDiag+=array[array.length-line-1][array.length-line-1];
            }                                           //Проверка сумм линий, столбцов и диагоналей на правило
            if((sumLine != RULE) || (sumColumn != RULE) || (sumDiag != RULE) || (sumMainDiag != RULE)){
                array = swap(array,random.nextInt(N),random.nextInt(N),random.nextInt(N),random.nextInt(N));
                column = 0;
            }
        }
        return array;
    }

    public static int[][] swap(int[][] array, int i, int j,int a, int b) {  //Метод перестановки случайных элементов
        if((i == a) && (j == b)){           //Проверка на одинаковые элементы в методе
            i = random.nextInt(N);
            j = random.nextInt(N);
            swap(array,i,j,a,b);
        }
        int tmp = array[i][j];              //Перестановка случайных элементов
        array[i][j] = array[a][b];
        array[a][b] = tmp;
        return array;
    }
}

