package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №7.
    Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
    */

public class TaskSeven {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки.

        System.out.println(sumOddFactorial());
    }

    //Метод возвращает сумму факторилов нечетных чисел от 1 до 9.
    public static int sumOddFactorial(){
        int sum = 0;
        for (int i = 1; i < 10; i++){
            if(i%2 != 0){
                int count = 1;
                for(int x = i; x > 1; x-- ){
                    count*=x;
                }
                sum+=count;
            }
        }
        return sum;
    }
}
