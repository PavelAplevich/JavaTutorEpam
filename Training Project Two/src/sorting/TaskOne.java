/*
В этом пакете представлены решения задач из раздела "Одномерные массивы.Сортировки"
В каждом классе представлено решение одной задачи с пояснениями в комментариях.
 */

package sorting;

    /*
    Одномерные массивы. Сортировки.
    Задача №1.
    Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один
    массив, включив второй массив между k-ым и (k+1)-ым элементами первого, при этом не использую дополнительный
    массив.

     */

public class TaskOne {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки

//        int K = 2;
//        double[] arrayOne = {1,3, 666, 999,12,76,-12,-1,-2.2,0.0001};
//        double[] arrayTwo = {0,0.1,-0.2,0.4};
//        if (K >= arrayOne.length){
//            throw new IllegalArgumentException("Incorrect argument K: " + K);
//        }
//        double[] resultArray = combineArrays(arrayOne, arrayTwo, K);
//        for(double x:resultArray){
//            System.out.print(x + " ");
//        }
    }

    private static double[] combineArrays(double[] arrayOne, double[] arrayTwo, int K){ //Метод комбинирования массивов
        double[] resultArray = new double[arrayOne.length+arrayTwo.length];     //Определение длины массива-результата
        for (int i =0; i < arrayOne.length;i++){                //Цикл создания первой части результата
            resultArray[i] = arrayOne[i];
            if(i == K+1){
                break;
            }
        }
        for (int j = 0; j < arrayTwo.length;j++){               //Цикл создания второй части результата
            resultArray[K+1+j] = arrayTwo[j];
        }
        for (int x = K+arrayTwo.length+1, y = 1; x < resultArray.length; x++){  //Цикл создания третьей части результата
            resultArray[x] = arrayOne[K+y];
            y++;
        }
        return resultArray;                             //Возврат результирующего массива вызывающему
    }
}
