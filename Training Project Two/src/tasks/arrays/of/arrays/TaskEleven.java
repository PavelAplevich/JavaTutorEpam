package tasks.arrays.of.arrays;

    /*
    Задачи. Массивы массивов.
    Задача №11.
    Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
    в которох число 5 встречается три и более раз.
     */

public class TaskEleven {
    public static void main(String[] args) {
        int[][] array = new int[10][20];
        taskEleven(fillMatrix(array));
    }

    public static int[][] fillMatrix(int[][] array){        //Метод наполнения матрицы случайными значениями
        for (int column = 0; column < array.length;column++){
            for(int line = 0; line < array[column].length;line++){
                array[column][line] = (int)(Math.random()*16);
            }
        }
        return array;
    }

    public static void taskEleven(int[][] array){           //Метод выводящий матрицу и номера строк
        int globCount = 0;
        for (int column = 0, count = 0; column < array.length;column++){    //Цикл определяет количество нужных строк
            for(int line = 0; line < array[column].length;line++){
                System.out.print(array[column][line] + " ");
                if(array[column][line] == 5){
                    count++;
                }
            }
            if (count >= 3){
                globCount++;
            }
            System.out.println();
        }
        int[] result = new int[globCount];                                  //Массив для номеров строк
        for (int column = 0, count = 0, j= 0; column < array.length;column++){  //Цикл заполнения массива номерами строк
            for(int line = 0; line < array[column].length;line++){
                if(array[column][line] == 5){
                    count++;
                }
            }
            if (count >= 3){
                result[j] = column;
                j++;
            }
        }
        System.out.print("Номера столбцов с заданным количеством повторений цифры 5: "); //Вывод результата
        for (int i : result){
            System.out.print(i + " ");
        }

    }
}
