package write.and.read;

import catalog.Book;
import catalog.Catalog;
import logic.Path;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyWriter {

    public static void addBook(Book book, Catalog catalog) throws IOException {
        File file = Path.getCatalog();
        FileWriter fileWriter = new FileWriter(file,false);
        catalog.getCatalog().add(book);
        fileWriter.write(catalog.toString());
        fileWriter.close();
    }

    public static void writeNewUser(String login, String password, String email) throws IOException {
        File file = Path.getAuthentication();
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

    public static void writeCatalog(Catalog catalog) throws IOException {
        FileWriter fileWriter = new FileWriter(Path.getCatalog(),false);
        fileWriter.write(catalog.toString());
        fileWriter.close();
    }
}