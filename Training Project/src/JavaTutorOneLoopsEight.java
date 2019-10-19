import java.util.Scanner;

    /*
    Циклы.
    Задание №8.
    Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа
    */

public class JavaTutorOneLoopsEight {
    public static void main(String[] args) {
        /*
        Т.к. не определен метод ввода данных, я оставил заккоментированный код для проверки результата
        через консольный ввод.
         */


//        Scanner scanner = new Scanner(System.in);
//        double first = scanner.nextDouble();
//        double second = scanner.nextDouble();
//        int[] firstArray = createArrays(doubleToInteger(first));    // Создание массивов integer из double
//        int[] secondArray = createArrays(doubleToInteger(second));
//        int[] resultArray = compareArray(firstArray,secondArray);   // Создание массива повторяющихся чисел
//        sortArray(resultArray);                                     // Вывод окончательного результата
    }

    public static void sortArray(int[] resultArray){                // Мето сортировки и вывода конечного результата
        int n = resultArray.length;

        for ( int i = 0, m = 0; i != n; i++, n = m ) {              //Цикл поиска повторений в массиве
            for ( int j = m = i + 1; j != n; j++ ) {
                if ( resultArray[j] != resultArray[i] ) {
                    if ( m != j ) resultArray[m] = resultArray[j];
                    m++;
                }
            }
        }
        if ( n != resultArray.length ) {                            //Получение отсортированного массива
            int[] b = new int[n];
            for ( int i = 0; i < n; i++ ) b[i] = resultArray[i];
            resultArray = b;
        }
        for ( int x : resultArray ) System.out.print( x + " " );    //Вывод результата на печать
        System.out.println();
    }

    public static int[] compareArray(int[] firstArray, int[] secondArray){ //Получение массива совпадающих чисел
        int count = 0;
        int[] resultArray;
        for(int i = 0; i < firstArray.length; i++){                        //Цикл, определяющий размерность
            for (int a = 0; a < secondArray.length; a++){                  //результирующего массива
                if (secondArray[a] == firstArray[i]){
                    count += 1;
                }
            }
        }
        resultArray = new int[count];
        for(int i = 0, num = 0; i < firstArray.length; i++){                //Цикл наполнения результирующего массива
            for (int a = 0; a < secondArray.length; a++){                   //совпадающими числами
                if (secondArray[a] == firstArray[i]){
                    resultArray[num] = firstArray[i];
                    num++;
                }
            }
        }
        return resultArray;
    }

    public static int[] createArrays(int number){           //Создание массива из целых чисел
                int[] array;
                int copyNumber = number;

                for(int i = 0;;i++){
                    if((number/=10) == 0){                  //Цикл определения длины числа
                        array = new int[i+1];
                        break;
                    }
                }

                for (int i = 0; i < array.length; i++){
                    array[i] = copyNumber%10;               //Цикл создания массива из числа
                    copyNumber/=10;
                }
                return array;
    }

    public static int doubleToInteger(double number){       //Метод перевода дробных чисел в целые числа
        for(long i = 10;;){
            if (number == (int)number){
                break;
            }
            number*=i;
        }
        return (int)number;
    }
}
