package flowers.logic;

import composition.FlowerComposition;
import enums.Flowers;
import enums.FlowersPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

//Класс внутренней логики приложения.
public class Logic {
    private Logic(){}

    //Реализация добавления цветка.
    public static void addFlower(FlowerComposition composition, Flowers flower){
        composition.getFlowers().add(flower);
    }

    //Реализация добавления упаковки.
    public static void addPackage(FlowerComposition composition, FlowersPackage pack){
        composition.setPack(pack);
    }

    //Реализация выбора пользователя.
    public static void doAction(FlowerComposition composition, int choice){
        addFlower(composition, Flowers.values()[choice]);
    }

    //Метод возвращает строку удобного вида для toString цветочной композиции.
    public static String getString(ArrayList<Flowers> flowers, FlowersPackage pack){
        String resultString = "";
        Collections.sort(flowers);
        ArrayList<Flowers> result  = new ArrayList<>();
        result.addAll(new LinkedHashSet<>(flowers));
        for(int i = 0, j = 0 , count = 0; i < result.size();){
            if(result.get(i).equals(flowers.get(j))){
               count++;
               j++;
               if(j == flowers.size()){
                   resultString = resultString.concat("" + result.get(i) + " " + count + "шт. ");
                   break;
               }
            } else {
                resultString = resultString.concat("" + result.get(i) + " " + count + "шт. ");
                count = 0;
                i++;
            }
        }
        resultString = resultString.concat("в упаковке " + pack);
        return resultString;
     }
}
