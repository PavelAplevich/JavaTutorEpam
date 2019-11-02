package logic;

import authentication.Authentication;
import authentication.InputValidations;
import catalog.Book;
import catalog.Catalog;
import catalog.EBook;
import catalog.PaperBook;
import main.Main;
import person.Person;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Logic {
    static URL resource = Authentication.class.getResource("Catalog.txt");
    static File file;
    static {
        try {
            file = Paths.get(resource.toURI()).toFile();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static Catalog createCatalog() throws FileNotFoundException {
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        ArrayList<Book> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String allLine = scanner.nextLine();
            //Todo Явный велосипед с выборкой из строки. Исправить, если будет время.
            String title = allLine.substring(allLine.indexOf("Title:") + 6, allLine.indexOf(" Author:"));
            String author = allLine.substring(allLine.indexOf("Author:") + 7,allLine.indexOf(" Pages:"));
            int pages = Integer.parseInt(allLine.substring(allLine.indexOf("Pages:") + 6,allLine.indexOf(" Type:")));
            String type = allLine.substring(allLine.indexOf("Type:") + 5);
            if(type.equals("\"PaperBook\"")){
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



    public static void resume(Person person, Catalog catalog) throws IOException, URISyntaxException {
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
