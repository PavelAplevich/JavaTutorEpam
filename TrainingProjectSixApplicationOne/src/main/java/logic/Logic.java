package logic;

import action.Main;
import authentication.InputValidations;
import catalog.Book;
import catalog.Catalog;
import catalog.EBook;
import catalog.PaperBook;
import person.Person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Logic {

    public static Catalog createCatalog() throws FileNotFoundException {
        FileReader fileReader = new FileReader(Path.getCatalog());
        Scanner scanner = new Scanner(fileReader);
        ArrayList<Book> list = new ArrayList<Book>();
        while (scanner.hasNext()) {
            String allLine = scanner.nextLine();
            //Todo Явный велосипед с выборкой из строки. Исправить, если будет время.
            String title = allLine.substring(allLine.indexOf("Title:") + 6, allLine.indexOf(" Author:"));
            String author = allLine.substring(allLine.indexOf("Author:") + 7,allLine.indexOf(" Pages:"));
            int pages = Integer.parseInt(allLine.substring(allLine.indexOf("Pages:") + 6,allLine.indexOf(" Type:")));
            String type = allLine.substring(allLine.indexOf("Type:") + 5);
            if(type.equals("PaperBook")){
                Book book = new PaperBook(title,author,pages);
                list.add(book);
            } else {
                String path = allLine.substring(allLine.indexOf("Path:") + 5);
                Book book = new EBook(title,author,pages,path);
                list.add(book);
            }
        }
        return new Catalog(list);
    }

    public static Book removeBook(Catalog catalog, int count){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int choice = scanner.nextInt();
            if(choice < 1 || choice > count){
                Output.printOutRed("Неккоректный ввод, попробуйте ещё раз.");
                return removeBook(catalog, count);
            } else {
               return catalog.getCatalog().get(choice-1);
            }
        } else {
            Output.printOutRed("Неккоректный ввод, попробуйте ещё раз.");
            return removeBook(catalog, count);
        }
    }

    public static void resume(Person person, Catalog catalog) throws IOException {
        Output.printOutBlue("\nВы желаете продолжить работу с программой?\n" +
                "1. Да\n" +
                "2. Нет");
        int choice = InputValidations.checkOneTwo();
        if(choice == 1){
            Main.run(person, catalog);
        } else {
            System.exit(1);
        }
    }

}
