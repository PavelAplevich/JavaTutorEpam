import java.util.Scanner;

public class JavaTutorOneLoopsEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        int[] firstArray = createArrays(doubleToInteger(first));    // Создание массивов integer из double
        int[] secondArray = createArrays(doubleToInteger(second));
        int[] resultArray = compareArray(firstArray,secondArray);   // Создание массива повторяющихся чисел
        sortArray(resultArray);                                     // Вывод окончательного результата
    }

    public static void sortArray(int[] resultArray){                // Сортировка и вывод конечного результата
        int n = resultArray.length;

        for ( int i = 0, m = 0; i != n; i++, n = m ) {
            for ( int j = m = i + 1; j != n; j++ ) {
                if ( resultArray[j] != resultArray[i] ) {
                    if ( m != j ) resultArray[m] = resultArray[j];
                    m++;
                }
            }
        }

        if ( n != resultArray.length ) {
            int[] b = new int[n];
            for ( int i = 0; i < n; i++ ) b[i] = resultArray[i];
            resultArray = b;
        }

        for ( int x : resultArray ) System.out.print( x + " " );
        System.out.println();
    }

    public static int[] compareArray(int[] firstArray, int[] secondArray){ //Получение массива совпадающих чисел
        int x = 0;
        int[] resultArray;
        for(int i = 0; i < firstArray.length; i++){
            for (int a = 0; a < secondArray.length; a++){
                if (secondArray[a] == firstArray[i]){
                    x += 1;
                }
            }
        }

        resultArray = new int[x];

        for(int i = 0, count = 0; i < firstArray.length; i++){
            for (int a = 0; a < secondArray.length; a++){
                if (secondArray[a] == firstArray[i]){
                    resultArray[count] = firstArray[i];
                    count++;
                }
            }
        }
        return resultArray;
    }

    public static int[] createArrays(int number){   //Создание массивов из целых чисел
                int[] array;
                int copyNumber = number;

                for(int i = 0;;i++){
                    if((number/=10) == 0){      //Цикл определения длины числа
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

    public static int doubleToInteger(double number){   // Перевод дробных в целые
        for(long i = 10;;){
            if (number == (int)number){
                break;
            }
            number*=i;
        }
        return (int)number;
    }
}
