package logics;


import data.TreasureBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TreasureLogic {

    public static void addTreasures(TreasureBase treasuresBase, TreasureBase.Treasure[] treasures){
        ArrayList<TreasureBase.Treasure> buf;
        buf = treasuresBase.getTreasures();
        for(TreasureBase.Treasure x: treasures){
            buf.add(x);
        }
        treasuresBase.setTreasures(buf);
    }

    public static TreasureBase.Treasure chooseTopTreasure(TreasureBase treasureBase) throws Exception {
        int maxPrice = 0;
        for(TreasureBase.Treasure x: treasureBase.getTreasures()){
            if(x.getPrice() > maxPrice){
                maxPrice = x.getPrice();
            }
        }
        for(TreasureBase.Treasure x: treasureBase.getTreasures()){
            if(x.getPrice() == maxPrice){
                return x;
            }
        }
        throw new Exception("Something do wrong...");
    }

    public static TreasureBase.Treasure chooseTreasure(TreasureBase treasureBase, int number) throws Exception {
        for(TreasureBase.Treasure x: treasureBase.getTreasures()){
            if(x.getNumber() == number){
                return x;
            }
        }
        throw new Exception("Something do wrong...");
    }

    public static void printOffer(TreasureBase treasureBase, int money){
        Collections.shuffle(treasureBase.getTreasures());
        int sum = 0;
        for(TreasureBase.Treasure x: treasureBase.getTreasures()){
            if( (sum + x.getPrice()) <= money){
                sum += x.getPrice();
                TreasureOut.printOut(x.toString());
            }
        }
        Collections.sort(treasureBase.getTreasures(), new Comparator<TreasureBase.Treasure>() {
            @Override
            public int compare(TreasureBase.Treasure treasure, TreasureBase.Treasure t1) {
                Integer x = treasure.getNumber();
                Integer y = t1.getNumber();
                return x.compareTo(y);
            }
        });
        TreasureOut.printOutCyan("Total price: " + sum);
    }
}
