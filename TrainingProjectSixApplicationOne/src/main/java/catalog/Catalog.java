package catalog;

import java.util.ArrayList;

public class Catalog {
    ArrayList<Book> catalog = new ArrayList<Book>();

    public Catalog(ArrayList<Book> catalog) {
        this.catalog = catalog;
    }

    public ArrayList<Book> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Book> catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        String result = "";
        for( Book x: catalog){
            result = result.concat(x.toString() + "\n");
        }
        return result;
    }
}
