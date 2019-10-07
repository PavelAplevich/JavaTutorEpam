import java.util.Scanner;

public class JavaTutorOneLoopsEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
//        System.out.println(doubleToInteger(first));
//        System.out.println(doubleToInteger(second));
        int[] firstArray = createArrays(doubleToInteger(first));
        int[] secondArray = createArrays(doubleToInteger(second));
//        for (int i = 0; i<firstArray.length;i++) {
//            System.out.print(firstArray[i]+" ");
//        }
        compareArray(firstArray,secondArray);
    }

    public static void compareArray(int[] firstArray, int[] secondArray){
        for(int i = 0; i < firstArray.length; i++){
            for (int a = 0; a < secondArray.length; a++){
                if (secondArray[a] == firstArray[i]){
                    System.out.print(secondArray[a] + " ");
                }
            }
        }
    }

    public static int[] createArrays(int number){
                int[] array;
                int copyNumber = number;

                for(int i = 0;;i++){
                    if((number/=10) == 0){      //Цикл определения длины числа
                        array = new int[i];
                        break;
                    }
                }

                for (int i = 0; i < array.length; i++){
                    array[i] = copyNumber%10;               //Цикл создания массива из числа
                    copyNumber/=10;
                }
                return array;
    }

    public static int doubleToInteger(double number){
        for(long i = 10;;i*=10){
            if (number == (int)number){
                break;
            }
            number*=i;
        }
        return (int)number;
    }
}
