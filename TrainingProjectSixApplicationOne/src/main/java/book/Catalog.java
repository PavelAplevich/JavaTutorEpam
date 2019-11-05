package book;

import java.util.ArrayList;

//Класс, реализующий каталог книг.
public class Catalog {
    ArrayList<Book> catalog = new ArrayList<Book>();

    //Конструктор.
    public Catalog(ArrayList<Book> catalog) {
        this.catalog = catalog;
    }
    //Набор сеттеров и геттеров.
    public ArrayList<Book> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Book> catalog) {
        this.catalog = catalog;
    }

    //Удобный  toString.
    @Override
    public String toString() {
        String result = "";
        for( Book x: catalog){
            result = result.concat(x.toString() + "\n");
        }
        return result;
    }
}
