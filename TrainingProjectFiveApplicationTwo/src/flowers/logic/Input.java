package flowers.logic;

import composition.FlowerComposition;
import enums.Flowers;
import enums.FlowersPackage;
import java.util.Scanner;

//Класс обрабатывающий вхождения от пользователя.
public class Input {

    //Реализация выбора цветка из списка пользователем, с проверкой ввода.
    public static void chooseFlower(FlowerComposition composition){
        for(int i = 1; i < Flowers.values().length+1; i++){
            Output.printOutPurple(i + ". " + Flowers.values()[i - 1]);
        }
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        if(scanner.hasNextInt()){
            choice = scanner.nextInt();
            if(choice < 1 || choice > Flowers.values().length){
                Output.printOutRed("Неккоректный ввод. Повторите ещё раз, пожалуйста!");
                chooseFlower(composition);
            } else {
                Logic.doAction(composition, choice -1);
                Output.printOutCyan("Желаете добавить ещё цветок?");
                resumeFlower(composition);
            }
        } else {
            Output.printOutRed("Неккоректный ввод. Повторите ещё раз, пожалуйста!");
            chooseFlower(composition);
        }
    }

    //Реализация выбора упаковки пользователем, с проверкой ввода.
    public static void choosePackage(FlowerComposition composition){
        for(int i = 1; i < FlowersPackage.values().length+1; i++){
            Output.printOutPurple(i + ". " + FlowersPackage.values()[i - 1]);
        }
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        if(scanner.hasNextInt()){
            choice = scanner.nextInt();
            if(choice < 1 || choice > FlowersPackage.values().length){
                Output.printOutRed("Неккоректный ввод. Повторите ещё раз, пожалуйста!");
                choosePackage(composition);
            } else {
                Logic.addPackage(composition, FlowersPackage.values()[choice - 1]);
            }
        } else {
            Output.printOutRed("Неккоректный ввод. Повторите ещё раз, пожалуйста!");
            choosePackage(composition);
        }
    }

    //Метод по продолжению работы с выбором.
    private static void resumeFlower(FlowerComposition composition){
        Scanner scanner = new Scanner(System.in);
        Output.printOutBlue("1. Да\n2. Нет.");
        int choice = 0;
        if(scanner.hasNextInt()){
            choice = scanner.nextInt();
            if(choice == 1){
                Output.printOutCyan("Какой цветок добавить?");
                chooseFlower(composition);
            } else if(choice == 2){
                return;
            } else {
                Output.printOutRed("Неккоректный ввод. Повторите ещё раз, пожалуйста!");
                resumeFlower(composition);
            }
        } else {
            Output.printOutRed("Неккоректный ввод. Повторите ещё раз, пожалуйста!");
            resumeFlower(composition);
        }
    }
}
