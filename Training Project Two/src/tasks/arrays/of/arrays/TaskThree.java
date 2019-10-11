package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №3.
    Дана матрица. Вывести К-ю строку и Р-й столбец матрицы.
     */

public class TaskThree {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки

//        double[][] array ={{1,2,3.3,8},{0.444,0,-2,11},{3,55,612,45},{1.4,2,6,777}};
//        int K = 0;
//        int P = 2;
//        printLine(array, K);
//        System.out.println();
//        printColumn(array, P);
    }

    public static void printLine(double [][] array, int K){     //Метод возвращает заданную строку
        for (int column = 0; column < array.length; column++ ){
            System.out.print(array[column][K] + " ");
        }
    }

    public static void printColumn(double[][] array, int P){    //Метод возвращает заданный столбец
        for (int line = 0; line < array[P].length; line++){
            System.out.print(array[P][line] + " ");
        }
    }
}
