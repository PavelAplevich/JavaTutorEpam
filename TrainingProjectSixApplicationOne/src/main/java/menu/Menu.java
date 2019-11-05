package menu;

import logic.Output;

//Суперкласс, реализующий общее меню администратора и пользователя.
public class Menu {

    public void showMenu() {
        Output.printOutBlue("Выберите необходимое действие:\n" +
                "1. Вывести список книг.\n" +
                "2. Найти книгу в каталоге.\n" +
                "3. Прочитать книгу.");
    }

}
