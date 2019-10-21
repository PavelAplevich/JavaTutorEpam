package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №10.
    Найти положительные элементы главной диагонали квадратной матрицы.
     */

public class TaskTen {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

//        double[][] array ={{1,2,3.3,8},{0.444,0,-2,11},{3,55,-612,45},{1.4,2,6,777}};
//        printPosDiag(getPosDiag(array));
    }

    public static double[] getPosDiag(double[][] array){        //Метод возвращает массив положительных
        int count = 0;                                          //элементов диагонали матрицы
        for (int column = 0; column < array.length; column++){
            for(int line = 0; line < array[column].length;line++){
                if(column == line && array[column][line] > 0){
                    count++;
                }
            }
        }
        double[] resultArray = new double[count];
        for (int column = 0, j = 0; column < array.length; column++){
            for(int line = 0; line < array[column].length;line++){
                if(column == line && array[column][line] > 0){
                    resultArray[j] = array[column][line];
                    j++;
                }
            }
        }
        return resultArray;
    }

    public static void printPosDiag(double[] array){            //Метод выводит результат
        for (double x:array){
            System.out.print(x + " ");
        }
    }
}
