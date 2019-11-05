package menu;

import logic.Output;

//Класс, реализующий меню администратора
public class AdminMenu extends Menu {
    @Override
    public void showMenu() {
        super.showMenu();
        Output.printOutBlue("4. Добавить книгу.\n" +
                "5. Удалить книгу.");
    }
}
