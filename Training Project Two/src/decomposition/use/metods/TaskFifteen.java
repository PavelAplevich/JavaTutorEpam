package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №15.
    Найти все натуральные n - значные числа, цифры в которых образуют строго возрастающую последовательность
    (например, 1234, 5789). Для решения задачи использовать декомпозицию
    */

import static decomposition.use.metods.TaskFourTeen.numberInNumber;

public class TaskFifteen {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки.

        int n = 3;
        printLine(n);
    }

    // Метод печатает число - возрастающую последовательность
    public static void printLine(int n){
        for( int i = 0; i < (int)Math.pow(10,n); i++){
            if(isLine(i)){
                System.out.print(i + " ");
            }
        }
    }

    // Метод проверяет, является ли число возрастающей последовательностью чисел-составляющих
    public static boolean isLine(int x){
        int count = (x + "").length();
        for(int i = 0; i < count - 1; i++){
            //Использование метода из задания №14 для нахождения числа-составляющей(сотня, десяток и т.д.)
            if(numberInNumber(x,i) > numberInNumber(x, i+1)){  //и сравнение этих чисел между собой
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

}
