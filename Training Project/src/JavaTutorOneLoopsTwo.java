public class JavaTutorOneLoopsTwo {

    /*
    Циклы.
    Задание №2.
    Вычислить значения функции на отрезке [a, b] с шагом h:
            y = { x, x > 2;
              = {-x, x <=2.
    */

    public static void main(String[] args) {
        //Заккоментированный хард-код, использованный мной для проверки работоспособности метода.

//        loopsTaskTwo(2,4,0.2);
    }

    public static void loopsTaskTwo (double a, double b, double h){ //Метод выводит значения функции на данном отрезке
        for(double i = a; i <= b; i=i+h){                           //с заданным шагом
            if (i > 2){
                System.out.printf("y = %3.3f\n",i);
            } else {
                System.out.printf("y = %3.3f\n",(-i));
            }
        }
    }
}