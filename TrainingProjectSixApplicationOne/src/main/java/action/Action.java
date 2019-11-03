package action;

import catalog.Catalog;
import person.Person;
import java.io.IOException;

public class Action{

    public int chooseAction(Person person) {
        return -1;
    }

    public void doAction(Person person, int action, Catalog catalog) throws IOException {
        switch (action){
            case 1:
                ActionLogic.printCatalog(catalog);
                break;
            case 2:
                ActionLogic.findBook(catalog);
                break;
            case 3:
                ActionLogic.readBook(catalog);
                break;
        }
    }


}
