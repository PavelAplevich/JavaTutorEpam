package action;

import book.Catalog;
import person.Person;
import java.io.IOException;

//Суперкласс, реализующий выбор различных действий пользователя.
public class Action{

    //Метод, реализующий выбор действия.
    public int chooseAction(Person person) {
        return -1;
    }

    //Метод, запускающий реализации действий.
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
