package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №6.
    Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    */

    /*
    Т.к. не указано, должны ли быть они простыми в совокупности или попарно, я сделал
    задания для простых в совокупности, как более сложное.
     */

public class TaskSix {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки.

//        int a = 15;
//        int b = 3;
//        int c = 45;
//        System.out.printf("Числа %d, %d, %d являются взаимно простыми по совокупности? - "
//                + "%s", a, b, c, isPrimeNumbersThree(a, b, c));
    }

    //Метод проверяет три числа на взаимную простоту в совокупности
    public static boolean isPrimeNumbersThree(int a, int b, int c){
      return isPrimeNumbers(a, b) == isPrimeNumbers(a, c) == isPrimeNumbers(b, c);
    }

    //Метод проверяет два числа на взаимную простоту
    public static boolean isPrimeNumbers(int a, int b){
        if(a >= b){
            while (b > 0){
            int tmp = a%b;
            a = b;
            b = tmp;
            }
            return a == 1;
        } else {
            return isPrimeNumbers(b, a);
        }
    }
}


