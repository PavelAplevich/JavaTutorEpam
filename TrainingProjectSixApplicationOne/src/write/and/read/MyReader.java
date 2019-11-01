package write.and.read;

import authentication.Authentication;
import catalog.Book;
import logic.Output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Scanner;

public class MyReader {

    public static void printCatalog(File file) throws FileNotFoundException {
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        for(;;){
            if(scanner.hasNextLine()){
                Output.printOutPurple(scanner.nextLine());
            } else {
                break;
            }
        }
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

    public static void findBook(String string, File file) throws IOException {
        string = "\"" + string + "\"";
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        int count = 0;
        while (scanner.hasNext()) {
            String str = scanner.findInLine("\".{1,}\"");
            if (str.equals(string)) {
                Output.printOutPurple(str + scanner.nextLine());
                count++;
            } else {
                scanner.nextLine();
            }
        }
        if(count==0)Output.printOutRed("Такой книги нет в каталоге.");
    }

    public static String findEmail(String login) throws IOException, URISyntaxException {
        URL resource = Authentication.class.getResource("Authentication.txt");
        File file = Paths.get(resource.toURI()).toFile();
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
