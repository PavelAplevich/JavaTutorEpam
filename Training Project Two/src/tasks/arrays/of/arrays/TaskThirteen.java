package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №13.
    Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
     */

public class TaskThirteen {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

        double[][] array ={{1,2,3.3,8},{0.444,0,-2,11},{3,55,-612,45},{1.4,2,6,777}};
        printSortArray(sortIncArray(array));
        System.out.println();
        printSortArray(sortDecArray(array));
    }

    private static double[][] sortIncArray(double[][] array){            //Метод сортировки массива по возрастанию
        for(int column = 1; column < array.length; column++){           //с помощью рекурсии
            for(int line = 0;line < array[column].length;line++){
                if (array[column-1][line] > array[column][line]){
                    double buf = array[column-1][line];
                    array[column-1][line] = array[column][line];
                    array[column][line] = buf;
                    sortIncArray(array);
                }
            }
        }
        return array;
    }

    private static double[][] sortDecArray(double[][] array){            //Метод сортировки массива по убыванию
        for(int column = 1; column < array.length; column++){           //с помощью рекурсии
            for(int line = 0;line < array[column].length;line++){
                if (array[column-1][line] < array[column][line]){
                    double buf = array[column-1][line];
                    array[column-1][line] = array[column][line];
                    array[column][line] = buf;
                    sortDecArray(array);
                }
            }
        }
        return array;
    }

    private static void printSortArray(double[][] array){                //Вывод массива массивов
        for(int column = 0; column < array.length; column++){
            for(int line = 0; line < array[column].length;line++){
                System.out.print(array[column][line] + " ");
            }
            System.out.println();
        }
    }

}

