package sorting;

    /*
    Одномерные массивы. Сортировки.
    Задача №4.
    Сортировка обменами. Дана последовательность чисел A1 <= A2 <= A3 ... An.
    (Я так понимаю, тут опечатка, и последовательность чисел не отсортирована)
    Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа Ai и Ai+1. Если
    Ai > Ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены
    в порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом количество перестановок.

     */

public class TaskFour {

    public static int count = 0;

    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки

//        double[] array = {3.3, -1, 0, 2, 4, 78, 111, 8923, -2, 44, -18.18, -777.7, 11.1234};
//        print(bubbleSortArray(array));
    }

    private static double[] bubbleSortArray(double[] array){        //Метод пузырьковой(обменами) сортировки
        for(int i = 0; i < array.length-1;i++){                     //выполненный с помощью рекурсии
            if(array[i+1] < array[i]){
                double buf = array[i];
                array[i] = array[i+1];
                array[i+1] = buf;
                count++;
                bubbleSortArray(array);
            }
        }
        return array;
    }

    private static void print(double[] array){             //Метод вывода результата
        System.out.println("Количество перестановок: " + count);
        System.out.println("Результат сортировки: ");
        for(double x:array){
            System.out.print(x + " ");
        }
    }
}
