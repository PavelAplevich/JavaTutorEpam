package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №2.
    Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
     */

public class TaskTwo {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки

//        double[][] array ={{1,2,3.3,8},{0.444,0,-2,11},{3,55,612,45},{1.4,2,6,777}};
//        printTaskTwo(array);
    }

    public static void printTaskTwo(double[][] array){              //Метод принимает квадратную матрицу
        for (int column = 0; column < array.length; column++){            //и выводит её диагональ слева направо
            for(int line = 0 ; line < array[column].length; line++){
                if (column == line){
                    System.out.println(array[column][line]);
                    break;
                }
                System.out.print("  ");
            }
        }
    }
}
