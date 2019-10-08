package one.dimensional.arrays;
/*
    Одномерные массивы
    Задание №5
    Даны целые числа  A1...An. Вывести на печать только те числа, для который Ai > i.
 */

public class TaskFive {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил заккоментированный хард-код, использованный мной для проверки

//        double[] A = {0,2,2,-4,35,0,7,8,9,11,5,4,15.1};
//        arraysTaskFive(A);
    }

    public static void arraysTaskFive(double[] a){  //Метод, выполняющий задание.
        for(int i = 0; i < a.length; i++){
          if (a[i] > i){
              System.out.print(a[i] + " ");
          }
        }
    }
}
