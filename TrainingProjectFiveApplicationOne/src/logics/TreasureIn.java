package logics;

import data.TreasureBase;
import enums.Rarity;
import enums.TypeTreasure;
import java.util.Random;
import java.util.Scanner;

//Класс реализующий входные логики, такие как создание бащы сокровищ и обработка входных выборов пользователя.
public class TreasureIn {

    //Создание случайной базы сокровищ.
    public static void createTreasureBase(TreasureBase treasureBase){
        for(int i = 1; i < 101; i++){
            int price = new Random().nextInt(1000) + 1;
            TypeTreasure type = TypeTreasure.values()[new Random().nextInt(TypeTreasure.values().length)];
            if(price < 200) {
                TreasureBase.Treasure treasure = treasureBase.new Treasure(i, price, type, Rarity.Ordinary);
                treasureBase.addTreasures(treasure);
            } else if(price < 400) {
                TreasureBase.Treasure treasure = treasureBase.new Treasure(i, price, type, Rarity.Unusual);
                treasureBase.addTreasures(treasure);
            } else if(price < 600) {
                TreasureBase.Treasure treasure = treasureBase.new Treasure(i, price, type, Rarity.Rare);
                treasureBase.addTreasures(treasure);
            }else if(price < 800) {
                TreasureBase.Treasure treasure = treasureBase.new Treasure(i, price, type, Rarity.Legendary);
                treasureBase.addTreasures(treasure);
            } else {
                TreasureBase.Treasure treasure = treasureBase.new Treasure(i, price, type, Rarity.Mythical);
                treasureBase.addTreasures(treasure);
            }
        }
    }

    //Обработка выбора пользователя.
    public static void chooseAction(TreasureBase treasureBase) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                createTreasureBase(treasureBase);
                TreasureOut.printOutRed("Для вас сгенерировано 100 сокровищ!");
                break;
            case 2:
                TreasureOut.printOut(treasureBase.getTreasures().toString());
                break;
            case 3:
                TreasureOut.printOutGreen("Введите доступную вам сумму: ");
                int money = scanner.nextInt();
                treasureBase.printOffer(money);
                break;
            case 4:
                TreasureOut.printOutGreen("Введите номер желаемого сокровища: ");
                int number = scanner.nextInt();
                TreasureOut.printOutGreen("Вы выбрали: \n" + treasureBase.chooseTreasure(number).toString());
                break;
            case 5:
                TreasureOut.printOutGreen("Лучшее сокровище в коллекции дракона: ");
                TreasureOut.printOutGreen(treasureBase.chooseTopTreasure().toString());
                break;
        }
    }
}
