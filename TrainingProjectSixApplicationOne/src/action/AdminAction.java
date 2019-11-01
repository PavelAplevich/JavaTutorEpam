package action;

import logic.Output;
import person.Person;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class AdminAction extends Action {

    @Override
    public void doAction(Person person, int action) throws IOException, URISyntaxException {
        super.doAction(person, action);
        switch (action){
            case 4:
                ActionLogic.addBook();
                break;
            case 5:
                ActionLogic.removeBook();
                break;
        }
    }

    @Override
    public int chooseAction(Person person) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int choice = scanner.nextInt();
            if(choice < 1 || choice > 5){
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
