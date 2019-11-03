package menu;

import logic.Output;

public class UserMenu extends Menu {
    @Override
    public void showMenu() {
        super.showMenu();
        Output.printOutBlue("4. Предложить книгу для добавления в каталог.");
    }
}
