package write.and.read;


import authentication.Authentication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class MyWriter {

    public static void addBook(String title, String author, int pages, String type, String path) throws URISyntaxException, IOException {
        URL resource = Authentication.class.getResource("Catalog.txt");
        File file = Paths.get(resource.toURI()).toFile();
        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.write("Title:" + "\"" + title + "\"" + " " +
                "Author:" + "\"" + author + "\"" + " " +
                "Pages:" + "\"" + pages + "\"" + " " +
                "Type:" + "\"" + type + "\"" + " " +
                "Path:" + "\"" + path + "\"" + "\n");
        fileWriter.close();
    }

    public static void addBook(String title, String author, int pages, String type) throws URISyntaxException, IOException {
        URL resource = Authentication.class.getResource("Catalog.txt");
        File file = Paths.get(resource.toURI()).toFile();
        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.write("Title:" + "\"" + title + "\"" + " " +
                "Author:" + "\"" + author + "\"" + " " +
                "Pages:" + "\"" + pages + "\"" + " " +
                "Type:" + "\"" + type + "\"" + " " + "\n");
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
}
