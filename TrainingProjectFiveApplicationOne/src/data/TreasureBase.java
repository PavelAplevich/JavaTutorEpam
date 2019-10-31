package data;

import enums.Rarity;
import enums.TypeTreasure;
import logics.TreasureLogic;

import java.util.ArrayList;

//Класс пещеры сокровищ.
public class TreasureBase{
    private ArrayList<Treasure> treasures = new ArrayList<Treasure>();

    //Метод добавления сокровища в пещеру.
    public void addTreasures(Treasure ... treasures){
        TreasureLogic.addTreasures(this,treasures);
    }

    //Метод выбора лучшего сокровища.
    public Treasure chooseTopTreasure() throws Exception {
        return TreasureLogic.chooseTopTreasure(this);
    }

    //Метод выбора сокровища по его номеру.
    public Treasure chooseTreasure(int number) throws Exception {
        return TreasureLogic.chooseTreasure(this, number);
    }

    //Метод вывода торгового предложения на заданную сумму монет.
    public void printOffer(int money){
        TreasureLogic.printOffer(this, money);
    }

    //Набор сеттеров и геттеров.
    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    //Класс сокровища.
    public class Treasure {
        private int number;
        private int price;
        private TypeTreasure type;
        private Rarity rarity;

        //Конструктор и набор сеттеров и геттеров.
        public Treasure(int number, int price, TypeTreasure type, Rarity rarity) {
            this.number = number;
            this.price = price;
            this.type = type;
            this.rarity = rarity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public TypeTreasure getType() {
            return type;
        }

        public void setType(TypeTreasure type) {
            this.type = type;
        }

        public Rarity getRarity() {
            return rarity;
        }

        public void setRarity(Rarity rarity) {
            this.rarity = rarity;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        //Переопределенный toString для удобства вывода информации по сокровищу.
        @Override
        public String toString() {
            String x = "";
            switch (rarity){
                case Rare:
                    x = "\u001B[34m";
                    break;
                case Mythical:
                    x = "\u001B[35m";
                    break;
                case Legendary:
                    x = "\u001B[33m";
                    break;
                case Unusual:
                    x = "\u001B[32m";
                    break;
                case Ordinary:
                    x = "\u001B[37m";
                    break;
            }
            return x + "Treasure №" + number + ". \n" + type + " - " + rarity + " rarity " + " - " + price +
                    " coins." + "\u001B[0m";
        }
    }
}
