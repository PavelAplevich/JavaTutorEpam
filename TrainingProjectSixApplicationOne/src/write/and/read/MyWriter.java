package write.and.read;


import authentication.Authentication;
import catalog.Book;
import catalog.Catalog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MyWriter {

    public static void addBook(Book book, Catalog catalog) throws URISyntaxException, IOException {
        catalog.getCatalog().add(book);
        URL resource = Authentication.class.getResource("Catalog.txt");
        File file = Paths.get(resource.toURI()).toFile();
        FileWriter fileWriter = new FileWriter(file,false);
        fileWriter.write(catalog.toString());
        fileWriter.close();
    }

    public static void writeNewUser(String login, String password, String email) throws URISyntaxException, IOException {
        URL resource = Authentication.class.getResource("Authentication.txt");
        File file = Paths.get(resource.toURI()).toFile();
        FileWriter fileWriter = new FileWriter(file, true);
        byte[] cryptoPas = encode(password, "readme");
        StringBuilder passwordBuilder = new StringBuilder();
        for(byte x:cryptoPas){
            passwordBuilder.append(x);
        }
        password = passwordBuilder.toString();
        fileWriter.write(login + " " + password + " " + email + "\n");
        fileWriter.close();
    }

    public static byte[] encode(String password, String key) {
        byte[] passwordAr = password.getBytes();
        byte[] keyAr = key.getBytes();
        byte[] res = new byte[password.length()];
        for (int i = 0; i < passwordAr.length; i++) {
            res[i] = (byte) (passwordAr[i] ^ keyAr[i % keyAr.length]);
        }
        return res;
    }

    public static void readBook(Book book){

    }
}
