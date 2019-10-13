package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №9.
    Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если
    угол между сторонами длиной X и Y - прямой.
    */

import static decomposition.use.metods.TaskThree.triangleArea;

public class TaskNine {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки.

//        double X = 3;
//        double Y = 4;
//        double Z = 8;
//        double T = 10;
//        System.out.printf("%.3f",quadrangleArea(X, Y, Z, T));
    }

    /*  Метод возвращает площадь четырехугольника с прямым углом между x и y
        как сумму площадей двух прямоугольных треугольников. Для подсчета площали
        прямоугольного треугольника взят метод из третьего задания.
     */
    public static double quadrangleArea(double x, double y, double z, double t){
        double hypotenuse = Math.sqrt(x*x + y*y);
        return triangleArea(x, y, hypotenuse)+triangleArea(z, t, hypotenuse);
    }
}
