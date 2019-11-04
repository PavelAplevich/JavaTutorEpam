package action;
/*
   В этом проекте представлено первое приложение из шестого модуля. Классы приложения расположены в своих пакетах,
   согласно логике. Код сопровожден минимальными комментариями. Основная информация по работе приложения представлена
   в файле README.md
 */

/*
    Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
    Общие требования к заданию:
    • Система учитывает книги как в электронном, так и в бумажном варианте.
    • Существующие роли: пользователь, администратор.
    • Пользователь может просматривать книги в каталоге книг, осуществлять поиск
    книг в каталоге.
    • Администратор может модифицировать каталог.
    • *При добавлении описания книги в каталог оповещение о ней рассылается на
    e-mail всем пользователям
    • **При просмотре каталога желательно реализовать постраничный просмотр
    • ***Пользователь может предложить добавить книгу в библиотеку, переслав её
    администратору на e-mail.
    • Каталог книг хранится в текстовом файле.
    • Данные аутентификации пользователей хранятся в текстовом файле. Пароль
    не хранится в открытом виде.
 */

import authentication.Authentication;
import book.Catalog;
import logic.Logic;
import logic.Output;
import person.Person;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Output.printOutGreen("Добро пожаловать в программу учета книг.");
        Person person = Authentication.chooseUser();
        Catalog catalog = Logic.createCatalog();
        run(person, catalog);
    }

    public static void run(Person person, Catalog catalog) throws IOException{
        person.showMenu();
        int action = person.chooseAction();
        person.doAction(action, catalog);
        person.resume(catalog);
    }
}
