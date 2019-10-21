package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №10.
    Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры
    числа N.
    */

public class TaskTen {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки.

//        int length = 6;
//        for (int x: createArray(N, length)){
//            System.out.print(x + " ");
//        }
    }

    final static int N = 2;     //Заполнитель массива

    //Метод возвращает массив размера m заполненный элементами N
    public static int[] createArray(int n, int m){
        int[] array = new int[m];
        for(int i = 0; i < m; i++){
            array[i] = N;
        }
        return array;
    }
}
