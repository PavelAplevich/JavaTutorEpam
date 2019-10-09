/*
    В этом классе представлены решения линейного раздела и раздела ветвлений в виде методов.
    Раздел циклов представлен в классах JavaTutorOneLoops ... .java
 */


public class JavaTutorOne {
    public static void main(String[] args) {
    }

    /*
    Линейные программы.
    Задание №1.
    Найдите значение функции: z=((a-3)*b/2)+c.
     */
    public static double LinearTaskOne (double a, double b, double c){  //Метод, возвращает значение заданной функции
        return  (a-3)*b/2+c;
    }
    /*
    Линейные программы.
    Задание №2.
    Вычислить значение выражения по формуле(все переменные принимают действительные значения):
                    (b + sqrt(b^2 + 4*a*c))/2*a - a^3*c+b^(-2).
     */

    public static double LinearTaskTwo (double a, double b, double c){  //Метод, возвращает значение заданной формулы
        double numerator = b + Math.sqrt(Math.pow(b,2)+4*a*c);
        double denominator = 2*a;
        return numerator/denominator - Math.pow(a,3)*c+Math.pow(b,-2);
    }

    /*
    Линейные программы.
    Задание №3.
    Найдите значение функции: z=((a-3)*b/2)+c.
     */

    public static double LinearTaskTree (double x, double y){
        return (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
    }

    /*
    Линейные программы.
    Задание №4.
    Дано действительное числа R вида nnn.ddd(три цифровых разряда в дробной и целой частях). Поменять местами
    дробную и целую части числа и вывести полученное значение числа
     */

    public static double LinearTaskFour(double R){      //Метод возвращает число-результат
        int x = (int)R;
        double y = ((R-x)*1000);
        return y + x/1000d;
    }

    /*
    Линейные программы.
    Задание №5.
    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
    значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSс.
     */

    public static void LinearTaskFive(int T){      //Метод принимает время в секундах и выводит его в требуемом формате
            int hour = T / 3600;
            int minute = (T - hour * 3600) / 60;
            int second = T - hour * 3600 - minute * 60;
            System.out.printf("%02dч %02dмин %02dс.", hour, minute, second);
    }

    /*
    Линейные программы.
    Задание №6.
    Для данной области составить линейную программу, которая печатает true, если точка с координатами (x, y)
    принадлежит данной области, и false - в противном случае.
            Заданная область:   -4 <= x <= 4
                                -3 <= y <= 3
     */

    public static void LinearTaskSix(double x, double y){        //Метод принимает координаты точки и выводит результат
        boolean a = ((x >= -2) && (x <= 2)) && ((y >= -3) && (y <= 4));
        boolean b = ((x >= -4) && (x <= 4)) && ((y >= -3) && (y <= 0));
        System.out.println(a||b);
    }

    /*
    Ветвления.
    Задание №1.
    Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    он прямоугольным.
     */

    public static void BranchTaskOne(double a, double b){      //Метод выводит результат
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

    public static double BranchTaskTwo(double a, double b, double c, double d){ //Метод возвращает результат
        return Math.max(Math.min(a,b), Math.min(c,d));
    }

    /*
    Ветвления.
    Задание №3.
    Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3). Определить, будут ли они расположены на одной прямой.
     */

    public static boolean BranchTaskThree(double x1, double y1, double x2, double y2, double x3, double y3){
        return (x1-x3)/(x2-x3) == (y1-y3)/(y2-y3);      //метод возвращает true или false, как результат
    }

    /*
    Ветвления.
    Задание №4.
    Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич
    через отверстие.
     */

    public static boolean BranchTaskFour(double x, double y, double z, double A, double B){ //Метод возвращает
        double length = Math.max(Math.max(x,y),z); //Определение, какой из параметров       //true или false
        boolean result;                            //Является длиной кирпича                //как результат
        if (x == length){
            result = (y < A && z < B) || (y < B && z < A);
        } else if (y == length){
            result = (x < A && z < B) || (x < B && z < A);
        } else {
            result = (x < A && y < B) || (x < B && y < A);
        }
        return result;
    }

    /*
    Ветвления.
    Задание №5.
    Вычисли значение функции F(x) = {x^2 - 3*x + 9, если x <= 3;
                                  = {1/(x^3 + 6),   если x > 3.
     */

    public static double BranchTaskFive(double x){      //Метод возвращает результат вычислений
        if(x<=3) {
            return (x * (x - 3) + 9);
        } else {
            return 1/(Math.pow(x,3)+6);
        }
    }

}
    // Решения задач из раздела Циклы разбито по нумерованным классам JavaTutorOneLoops... .java