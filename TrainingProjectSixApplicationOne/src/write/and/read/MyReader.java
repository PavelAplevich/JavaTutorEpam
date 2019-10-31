package write.and.read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Scanner;

public class MyReader {

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

    public static String findEmail(String login) throws IOException, URISyntaxException {
        URL resource = MyWriter.class.getResource("Authentication.txt");
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
