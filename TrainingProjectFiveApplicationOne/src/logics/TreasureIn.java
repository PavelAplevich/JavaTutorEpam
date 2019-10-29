package logics;

import data.TreasureBase;
import enums.Rarity;
import enums.TypeTreasure;
import java.util.Random;

public class TreasureIn {

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
}
