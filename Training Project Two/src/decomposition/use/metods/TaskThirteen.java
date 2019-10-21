package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №13.
    Два простых числа называются "близнецами", если они отличаются друг от друга на 2 (например, 41 и 43).
    Найти и напечатать все пары "близнецов" из отрезка [n, 2n], где n - заданное натуральное число больше 2. Для решения
    задачи использовать декомпозицию.
    */

public class TaskThirteen {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки.

//        int n = 5;
//        doTask(n);
    }

    //Метод выполнения задания
    public static void doTask(int n){
        int[] array = formArray(n); //Вызов метода формирования массива
        printAllTwo(array);         //Вызов метода печати "близнецов" массива

    }

    public static int[] formArray(int n){
        int[] array = new int[n+1];
        for(int i = 0; i < array.length; i++){
            array[i] = n + i;
        }
        return array;
    }

    public static void printAllTwo(int[] array){
        for(int i = 0; i < array.length-2; i++){
            System.out.printf("%d %d", array[i], array[i+2]);
            System.out.println();
        }
    }
}
