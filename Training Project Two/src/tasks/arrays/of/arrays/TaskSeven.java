package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №7.
    Сформировать квадратную матрицу порядка N по правилу A[I,J] = sin((I^2-J^2)/N)
    и подсчитать количество положительных элементов в ней.
     */

public class TaskSeven {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

//        int n = 4;
//        printMatrixSeven(createMatrixSeven(n));
//        printPosCount(createMatrixSeven(n));
    }

    public static double[][] createMatrixSeven(int n){          //Метод возвращает искомую матрицу
        double[][] array = new double [n][n];
        for(int column = 0; column < array.length; column++){
            for(int line = 0; line < array[column].length;line++){
                array[column][line] = Math.sin((column*column-line*line)/n);
            }
        }
        return array;
    }

    public static void printMatrixSeven(double[][] array){      //Метод выводит матрицу пользователю
        for(int column = 0; column < array.length; column++){
            for(int line = 0; line < array[column].length;line++){
                System.out.printf("%.3f ",array[column][line]);
            }
            System.out.println();
        }
    }

    public static void printPosCount(double[][] array){         //Метод выводит количество положительных элементов
        int count = 0;
        for(int column = 0; column < array.length; column++){
            for(int line = 0; line < array[column].length;line++){
                if (array[column][line] > 0){
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Количество положительных элементов: " + count);
    }
}
