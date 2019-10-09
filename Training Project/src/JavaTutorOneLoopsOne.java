import java.util.Scanner;

    /*
    Циклы.
    Задание №1.
    Напишите программу, где пользователь вводит любое целое положительно число. А программа суммирует все
    числа от 1 до введенного пользователем числа.
     */

public class JavaTutorOneLoopsOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //Считывание ввода пользователя
        int input = scanner.nextInt();
        long result = 0;
        if (input <= 0){
            throw  new IllegalArgumentException("Incorrect number! : " + input); //Вывод исключения при некорректном
        }                                                                        //вводе
        for (int i=1; i <= input; i++){
            result += i;
        }
        System.out.println("Summary result = " + result);       //Вывод результата
    }
}
