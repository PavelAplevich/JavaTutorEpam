package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №16.
    Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также,
    сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
    */

import static decomposition.use.metods.TaskFourTeen.numberInNumber;

public class TaskSixteen {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки.

//        int n = 3;
//        printSumOdd(n);
//        printEvenCount(sumOdd(n));
    }

    //Метод возвращает итоговую сумму
    public static int sumOdd(int n){
        int sum = 0;
        for(int i = (int)(Math.pow(10,n-1)); i < (int)(Math.pow(10,n)); i++){
            if(isOnlyOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    //Метод проверки чисел на соответствие условию. Используется метод из задания №14, для получения числа-составляющей
    public static boolean isOnlyOdd(int number){
        int count = (number + "").length();
        for(int i = 0; i < count; i++){
            if((numberInNumber(number, i)%2) != 0){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    //Метод печати итоговой суммы
    public static void printSumOdd(int n){
        System.out.println("Итоговая сумма: " + sumOdd(n));
    }

    //Метод печати количества четных чисел в итоговой сумме.Используется метод из задания №14,
    // для получения числа-составляющей.
    public static void printEvenCount(int n){
        int count = (n + "").length();
        int countEven = 0;
        for ( int i = 0; i < count; i++){
            if(numberInNumber(n, i)%2 == 0){
                countEven++;
            }
        }
        System.out.println("Количество четных чисел в сумме: " + countEven);
    }
}
