package action;

import person.Person;
import java.io.IOException;
import java.net.URISyntaxException;

public class Action{

    public int chooseAction(Person person) {
        return -1;
    }

    public void doAction(Person person, int action) throws URISyntaxException, IOException {
        switch (action){
            case 1:
                ActionLogic.printCatalog();
                break;
            case 2:
                ActionLogic.findBook();
                break;
            case 3:
                ActionLogic.readBook();
                break;
        }
    }


}
