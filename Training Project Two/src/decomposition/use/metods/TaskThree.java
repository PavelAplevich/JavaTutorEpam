package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №3.
    Вычислить площадь правильного шестиугольника со стороной a, используя метод вычисления площади треугольника.
    */

public class TaskThree {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки.

//        System.out.printf("%.4f",hexagonArea(10));
    }

    //Метод вычисления площади гексагона через 6 треугольников
    public static double hexagonArea(double side){
        return triangleArea(side,side,side)*6;
    }

    //Метод вычисления площади треугольника через формулу Герона
    public static double triangleArea (double sideOne, double sideTwo, double sideThree){
        double halfPerimeter = (sideOne + sideTwo + sideThree)/2;
        double geronFormula = Math.sqrt(halfPerimeter * (halfPerimeter - sideOne)
                * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree));
        return geronFormula;
    }
}
