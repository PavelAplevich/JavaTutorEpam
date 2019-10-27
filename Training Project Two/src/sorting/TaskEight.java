package sorting;

    /*
    Одномерные массивы. Сортировки.
    Задача №8.
    Даны дроби P1/Q1 , P2/Q2 , ... , Pn/Qn (Pi, Qi - натуральные). Составить программу, которая приводит эти дроби
    к общему знаменателю и упорядочивает их в порядке возрастания.

     */

import java.util.Arrays;

public class TaskEight {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода и не указано в каком виде должны быть представлены дроби
        //оставил закомментированный хард-код, использованный мной для проверки.

//        int[][] array = {{1,2},{3,4},{1,4},{3,5},{3,6},{2,4}};
//        array = sortArray(array);
//        for(int[] i:array){
//            System.out.println(Arrays.toString(i));
//        }
    }

    //Метод сортирует числители по возрастанию а знаменатели приводит к общему значению.
    public static int[][] sortArray(int[][] array){
        int[] denominators = new int[array.length];
        int[] numerators = new int[array.length];
        for(int i = 0; i < array.length; i++){
            numerators[i] = array[i][0];
            denominators[i] = array[i][1];
        }
        int lcm = commonMultiple(denominators);
        for(int i = 0; i < array.length; i++){
            numerators[i] = numerators[i] * (lcm/denominators[i]);
            denominators[i] = lcm;
        }
        numerators = shellSortArray(numerators);
        for(int i = 0; i < array.length; i++){
            array[i][0] = numerators[i];
            array[i][1] = denominators[i];
        }
        return array;
    }

    //Метод сортировки числителей. Взят из задания №6.
    public static int[] shellSortArray(int[] array){
        for(int i = 0; i < array.length - 1;){
            if(array[i] <= array[i+1]){
                i++;
            } else{
                int buf = array[i];
                array[i] = array[i+1];
                array[i+1] = buf;
                if(i!=0){
                    i--;}
            }
        }
        return array;
    }

    //Метод нахождения общего знаменателя.
    public static int commonMultiple(int[] array){
        int lcm = 1;
        for (int value : array) {
            if (lcm % value != 0) {
                lcm *= value;
            }
        }
        return lcm;
    }

}
