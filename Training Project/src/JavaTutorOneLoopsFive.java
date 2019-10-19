public class JavaTutorOneLoopsFive {

    /*
    Циклы.
    Задание №5.
    Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    заданному е. Общий член ряда имеет вид: An = 1/2^n + 1/3^n
    */

    public static void main(String[] args) {
        // Т.к. не указан метод ввода данных, то я оставил заккоментированый код для проверки задания

//     System.out.println(loopsTaskFive(10, 0.5));
    }

    public static double loopsTaskFive(int n , double e){       //Метод, принимающий число-шаблон е и количество
        double result = 0;                                      //членов числового ряда n
        for (int i = 0; i < n ; i++){
            double a = 1/Math.pow(2,i)+1/Math.pow(3,i);
            if (a >= e){
                result += a;
            }
        }
        return result;
    }
}
