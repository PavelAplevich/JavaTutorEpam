/*
    В этом классе представлены решения раздела ветвлений.
 */


public class JavaTutorBranch {
    public static void main(String[] args) {
        //Заккоментированный хард-код, использованный мной для проверки работоспособности методов.

//        branchTaskOne(90,60);
//        System.out.println(branchTaskTwo(1,-2,-0.1,4));
//        System.out.println("Эти три точки расположены на одной прямой?: "
//                            + branchTaskThree(2,2,4,4,8,8));
//        System.out.println("Пройдет ли кирпич через отверстие? " + branchTaskFour(3,4,5,3.1,4.1));
//        System.out.println(branchTaskFive(-4.5));
    }
     /*
    Ветвления.
    Задание №1.
    Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    он прямоугольным.
     */

    public static void branchTaskOne(double a, double b){      //Метод выводит результат
        double c = 180-(a+b);
        if (c > 0){
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("This is rectangular triangle");
            } else {
                System.out.println("This is non-rectangular triangle");
            }
        } else {
            System.out.println("This is not triangle");
        }
    }

        /*
    Ветвления.
    Задание №2.
    Найти max{min(a,b),min(c,d)}.
     */

    public static double branchTaskTwo(double a, double b, double c, double d){ //Метод возвращает результат
        return Math.max(Math.min(a,b), Math.min(c,d));
    }

    /*
    Ветвления.
    Задание №3.
    Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3). Определить, будут ли они расположены на одной прямой.
     */

    public static boolean branchTaskThree(double x1, double y1, double x2, double y2, double x3, double y3){
        return (x1-x3)/(x2-x3) == (y1-y3)/(y2-y3);      //метод возвращает true или false, как результат
    }

    /*
    Ветвления.
    Задание №4.
    Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич
    через отверстие.
     */

    //Метод возвращает true или false как результат
    public static boolean branchTaskFour(double x, double y, double z, double A, double B){
        double length = Math.max(Math.max(x,y),z); //Определение, какой из параметров
        if (x == length){                           //Является длиной кирпича
            return  (y < A && z < B) || (y < B && z < A);
        } else if (y == length){
            return  (x < A && z < B) || (x < B && z < A);
        } else {
            return  (x < A && y < B) || (x < B && y < A);
        }
    }

    /*
    Ветвления.
    Задание №5.
    Вычисли значение функции F(x) = {x^2 - 3*x + 9, если x <= 3;
                                  = {1/(x^3 + 6),   если x > 3.
     */

    public static double branchTaskFive(double x){      //Метод возвращает результат вычислений
        if(x<=3) {
            return (x * (x - 3) + 9);
        } else {
            return 1/(Math.pow(x,3)+6);
        }
    }

}

