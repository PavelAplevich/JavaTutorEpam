package write.and.read;

import catalog.Book;
import catalog.Catalog;
import logic.Path;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyReader {

    public static void createCatalog(){

    }

    public static boolean findString(String string, File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        for(;;){
            if(scanner.hasNextLine()){
                String strLogin = scanner.next();
                String strPassword = scanner.next();
                if(string.equals(strLogin)){
                    fileReader.close();
                    return true;
                } else if(string.equals(strPassword)){
                    fileReader.close();
                    return true;
                } else {
                    scanner.nextLine();
                }
            } else {
                break;
            }
        }
        fileReader.close();
        return false;
    }

    public static Catalog findBook(String string, Catalog catalog) {
        ArrayList<Book> list = new ArrayList<>();
        for(Book x: catalog.getCatalog()){
            if (x.getTitle().equals(string)){
                list.add(x);
            }
        }
        return new Catalog(list);
    }

    public static String findEmail(String login) throws IOException {
        File file = Path.getAuthentication();
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        for(;;){
            if(scanner.hasNextLine()){
                String strLogin = scanner.next();
                String strPassword = scanner.next();
                if(login.equals(strLogin)){
                    fileReader.close();
                    return strPassword;
                } else {
                    scanner.nextLine();
                }
            } else {
                throw  new IOException("Something went wrong...");
            }
        }
    }
}
