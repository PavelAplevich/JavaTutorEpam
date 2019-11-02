package action;

import catalog.Catalog;
import logic.Output;
import person.Person;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class UserAction extends Action {

    @Override
    public void doAction(Person person, int action, Catalog catalog) throws IOException, URISyntaxException {
        super.doAction(person, action, catalog);
        switch (action){
            case 4:
                ActionLogic.offerBook();
                break;
        }
    }

    @Override
    public int chooseAction(Person person) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int choice = scanner.nextInt();
            if(choice < 1 || choice > 4){
                Output.printOutRed("Неккоректный выбор, попробуйте ещё раз.");
                person.showMenu();
                return chooseAction(person);
            } else {
                return choice;
            }
        } else {
            Output.printOutRed("Неккоректный выбор, попробуйте ещё раз.");
            person.showMenu();
            return chooseAction(person);
        }
    }
}
