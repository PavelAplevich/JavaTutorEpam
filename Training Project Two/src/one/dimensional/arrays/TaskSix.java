package one.dimensional.arrays;

public class TaskSix {
    public static void main(String[] args) {
    }

    public static void ArraysTaskSix(double[] a){       //Метод вывода суммы элементов под простыми порядковыми числами
        double summary = 0;
        for(int i = 2; i < a.length; i++){
            if(primeNumber(i)){
                summary+=a[i];
            }
        }
        System.out.println(summary);
    }
    public static boolean primeNumber( int number){     //метод для определения простоты числа
        for (int i = 2; i < Math.sqrt(number); i++ ){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }
}
