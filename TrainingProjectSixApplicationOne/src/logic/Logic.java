package logic;

import person.Admin;

public class Logic {

    public static void runAdminMenu(Admin admin){
        Output.printOutBlue("Добро пожаловать, " + admin.getLogin() + "!");
        Output.printOutCyan("Выберите необходимое действие:\n" +
                "1. Добавить книгу в каталог.\n" +
                "2. удалить книгу из каталога.\n" +
                "3. Открыть книгу из каталога.\n" +
                "4. Найти книгу в каталоге.\n" +
                "5. Выйти из учетной записи.\n" +
                "6. Закончить работу с программой.");
        //TODO  Delat tyt
    }
}
