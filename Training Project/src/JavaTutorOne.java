/*
    В этом классе представлены решения линейного раздела виде методов.
    Раздел ветвлений находится в классе JavaTutorBranch.
    Раздел циклов представлен в классах JavaTutorOneLoops ... .java.
 */


public class JavaTutorOne {
    public static void main(String[] args) {
        //Заккоментированный хард-код, использованный мной для проверки работоспособности методов.

//        System.out.println(linearTaskOne(0.1,0.2,3));
//        System.out.println(linearTaskTwo(2.2, 4, 5.3));
//        System.out.println(linearTaskTree(1, 0.24));
//        linearTaskFour(333.555);
//        linearTaskFive(1566171);
//        linearTaskSix(-4,3.1);
    }

    /*
    Линейные программы.
    Задание №1.
    Найдите значение функции: z=((a-3)*b/2)+c.
     */
    public static double linearTaskOne (double a, double b, double c){  //Метод, возвращает значение заданной функции
        return  (a-3)*b/2+c;
    }

    /*
    Линейные программы.
    Задание №2.
    Вычислить значение выражения по формуле(все переменные принимают действительные значения):
                    (b + sqrt(b^2 + 4*a*c))/2*a - a^3*c+b^(-2).
     */

    public static double linearTaskTwo (double a, double b, double c){  //Метод, возвращает значение заданной формулы
        double numerator = b + Math.sqrt(Math.pow(b,2)+4*a*c);
        double denominator = 2*a;
        return numerator/denominator - Math.pow(a,3)*c+Math.pow(b,-2);
    }

    /*
    Линейные программы.
    Задание №3.
    Найдите значение функции: z=((a-3)*b/2)+c.
     */

    public static double linearTaskTree (double x, double y){
        return (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
    }

    /*
    Линейные программы.
    Задание №4.
    Дано действительное числа R вида nnn.ddd(три цифровых разряда в дробной и целой частях). Поменять местами
    дробную и целую части числа и вывести полученное значение числа
     */

    public static void linearTaskFour(double R){      //Метод возвращает число-результат
        int x = (int)R;
        int y = (int)((R-x)*1000);
        System.out.printf("%3.3f\n", (y + x/1000d));
    }

    /*
    Линейные программы.
    Задание №5.
    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
    значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSс.
     */

    public static void linearTaskFive(int T){      //Метод принимает время в секундах и выводит его в требуемом формате
            int hour = T / 3600;
            int minute = (T - hour * 3600) / 60;
            int second = T - hour * 3600 - minute * 60;
            System.out.printf("%02dч %02dмин %02dс.\n", hour, minute, second);
    }

    /*
    Линейные программы.
    Задание №6.
    Для данной области составить линейную программу, которая печатает true, если точка с координатами (x, y)
    принадлежит данной области, и false - в противном случае.
            Заданная область:   -4 <= x <= 4
                                -3 <= y <= 3
     */

    public static void linearTaskSix(double x, double y){        //Метод принимает координаты точки и выводит результат
        boolean a = ((x >= -2) && (x <= 2)) && ((y >= -3) && (y <= 4));
        boolean b = ((x >= -4) && (x <= 4)) && ((y >= -3) && (y <= 0));
        System.out.println(a||b);
    }

}
