/*
В пакете представлены решения задач по алгомитризации. Раздел №2 - Задачи. Массивы массивов.
В каждом классе прдеставлено решение одного задания с пояснениями в комментариях.
 */
package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №1.
    Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
    больше последнего.
     */

public class TaskOne{
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки

//        double[] [] array ={{1,2,3.3},{0.444,0,-2},{3,55,612,45,2,1},{1.4,2,5,6,7,888,0,-13}};
//        printTaskOne(array);
    }

    public static void printTaskOne (double[][] array){                //Метод принимает массив массивов и выводит
      for (int column = 1; column < array.length; column++){              //результат
          if(column%2 != 0){
              if(array[column][0] > array[column][array[column].length-1]){
                  for ( int line = 0; line < array[column].length;line++){
                      System.out.print(array[column][line] + " ");
                  }
                  System.out.println();
              }
          }
      }
    }
}
