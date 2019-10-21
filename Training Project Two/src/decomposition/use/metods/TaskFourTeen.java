package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №14.
    Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведеная в степень
    n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
    */
    /*
    Согласно Википедии я так понял тут опечатка, и в степень нужно возводить не сумму, а каждое число. Задания
    будет выполнятся для такого условия.
     */

public class TaskFourTeen {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки.
//
//        int k = 548834;
//        printArmstrong(k);
    }

    //Метод печати чисел Армстронга
    public static void printArmstrong(int k){
        for (int i = 1; i <= k; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    //Метод проверки числа на то, является ли оно числом Армстронга
    public static boolean isArmstrong(int x){
        int count = (x + "").length();
        int result = 0;
        for (int i = 0; i < count;i++){
            result += Math.pow(numberInNumber(x , i), count);
        }
        return result == x;
    }

    //Метод принимает число и индекс того числа - составляющей, которое необходимо вызывающему
    public static int numberInNumber(int x, int index){
        for(int i = 0; i < index; i++){
            x/=10;
        }
        return  x%10;
    }
}
