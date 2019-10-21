package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №4.
    На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар
    точек самое большое расстояние. Указание. Координаты точек занести в массив.
    */

public class TaskFour {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки.

        int[][] pointArray = {{1,2} ,{1,4} ,{-1,6} ,{-2, -7} ,{-13, 9}};
        printPairPoint(pointArray);
    }

    public static void printPairPoint(int[][] pointArray){
        int[][] array = new int[2][2];
        array = maxPairPoint(pointArray);
        System.out.print("Наибольшее расстояние между точками ");
        System.out.printf("%d,%d и %d,%d", array[0][0], array[0][1], array[1][0], array[1][1]);

    }

    public static int[][] maxPairPoint(int[][] pointArray){
        // TODO: 10/14/19 Продолжить здесь
    }
}
