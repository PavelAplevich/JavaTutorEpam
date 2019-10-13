package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №12.
    Даны натуральные числа K и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
    сумма цифр которых равна K и которые не больше N.
    */

public class TaskTwelve {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки.

//        int K = 26;
//        int N = 5;
//        for(int x:createThisArray(K, N)){
//            System.out.print(x + " ");
//        }
    }

    //Метод принимает значения чисел K и N. Возвращает массив - результат
    public static int[] createThisArray(int sum, int max){
        if ( sum < max || (max < 0 || sum < 0)){
            throw new IllegalArgumentException("Illegal statement in " + Thread.currentThread().getStackTrace()[1]);
        }
        int buf = 0;
        int count = 0;
        while( buf < sum){
            buf+=max;
            count++;
        }
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++){
            array[i] = max;
        }
        if(sum%max != 0){
        array[array.length-1] = sum%max;
        }
        return array;
    }
}
