package server.action;

import server.persons.Administrator;
import server.persons.Person;

public class Action {

    public static String actionList(Person person) {
        String actionList = "Выберите необходимое действие:\n";
        if(person instanceof Administrator){
            actionList += "1. Получить дело по ID\n" +
                    "2. Получить дело по ФИО студента\n" +
                    "3. Изменить данные дела по ID\n" +
                    "4. Добавить дело\n" +
                    "5. Удалить дело по ID";
        } else {
            actionList += "1. Получить дело по ID\n" +
                    "2. Получить дело по ФИО студента";
        }
        return actionList;
    }


}
