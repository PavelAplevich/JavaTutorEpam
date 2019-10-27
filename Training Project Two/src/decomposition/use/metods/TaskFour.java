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

//        int[][] pointArray = {{1,2} ,{1,4} ,{-1,6} ,{-2, -7} ,{-13, 9}};
//        printPairPoint(pointArray);
    }
    
    //Метод вывода максимальной пары.
    public static void printPairPoint(int[][] pointArray){
        int[][] array = new int[2][2];
        array = maxPairPoint(pointArray);
        System.out.print("Наибольшее расстояние между точками ");
        System.out.printf("%d,%d и %d,%d", array[0][0], array[0][1], array[1][0], array[1][1]);

    }
    
    //Метод вычисления максимальной пары.
    public static int[][] maxPairPoint(int[][] pointArray){
        int maxA = 0;
        int maxB = 0;
        double maxPair = 0;
        for(int i = 0; i < pointArray.length-1; i++){
            for(int j = 0; j < pointArray.length; j++){
                if(distanceFormula(pointArray[i][0], pointArray[i][1], pointArray[j][0], pointArray[j][1]) > maxPair){
                    maxPair = distanceFormula(pointArray[i][0], pointArray[i][1], pointArray[j][0], pointArray[j][1]);
                    maxA = i;
                    maxB = j;
                }
            }
        }
        int[][] resultArray = new int[2][2];
        resultArray[0][0] = pointArray[maxA][0];
        resultArray[0][1] = pointArray[maxA][1];
        resultArray[1][0] = pointArray[maxB][0];
        resultArray[1][1] = pointArray[maxB][1];
        return resultArray;
    }
    
    //Метод вычисления расстояния между точками.
    public static double distanceFormula(int x1, int y1, int x2, int y2){
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

}
