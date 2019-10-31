package composition;

import flowers.logic.Logic;
import enums.Flowers;
import enums.FlowersPackage;

import java.util.ArrayList;

//Класс цветочной композиции.
public class FlowerComposition {
    private ArrayList<Flowers> flowers = new ArrayList<>();
    private FlowersPackage pack;

    //Метод добавления цветка в композицию.
    public void addFlower(Flowers flower){
        Logic.addFlower(this,flower);
    }

    //Набор сеттеров и геттеров.
    public void addPack(FlowersPackage pack){
        Logic.addPackage(this, pack);
    }

    public ArrayList<Flowers> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flowers> flowers) {
        this.flowers = flowers;
    }

    public FlowersPackage getPack() {
        return pack;
    }

    public void setPack(FlowersPackage pack) {
        this.pack = pack;
    }

    //Переопределенный toString, для вывода информации по композиции в удобном виде.
    @Override
    public String toString() {
       return Logic.getString(flowers, pack);
    }
}
