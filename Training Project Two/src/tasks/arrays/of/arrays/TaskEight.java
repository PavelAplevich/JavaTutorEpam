package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №8.
    В числовой матрице поменять местами два любых столбца, т.е. все элементы одного столбца поставить на
    соответствующие им позиции другого, а элементы второго переместить в первый. Номера столбцов вводит пользователь
    с клавиатуры.
     */

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstColumn = scanner.nextInt();
        if (firstColumn < 0){
            throw new IllegalArgumentException("Incorrect first column number: " + firstColumn);    //Проверки ввода
        }
        int secondColumn = scanner.nextInt();
        if (secondColumn == firstColumn || secondColumn < 0){
            throw new IllegalArgumentException("Incorrect second column number: " + secondColumn);
        }
        double[][] array ={{1,2,3.3,8,1},{0.444,0,-2,11,1},{3,55,612,45,2},{1.4,2,6,777,0}};
        printMatrixEight(changeColumn(array,firstColumn,secondColumn));
    }

    public static double[][] changeColumn(double[][] array, int first, int second){ //Метод возвращает итоговый массив
        double[] buf = new double[array[first].length];
        for (int line = 0; line < array[first].length;line++) {
            buf[line] = array[first][line];
            array[first][line] = array[second][line];
            array[second][line] = buf[line];
        }
        return array;
    }

    public static void printMatrixEight(double[][] array){          //Метод печатает итоговый массив
        for(int column = 0; column < array.length; column++){
            for(int line = 0; line < array[column].length;line++){
                System.out.print(array[column][line] + " ");
            }
            System.out.println();
        }
    }
}
