package logic;

import authentication.Authentication;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;

//Класс, реализующий пути к файлам аутентификации и каталога.
public class Path {
    //Todo  Работает абсолютно не стабильно. Попробовать что-нибудь сделать, если будет время.

    public static File getAuthentication(){
        URL resource = Authentication.class.getResource("Authentication.class");
//        String path = (resource.toString().substring(resource.toString().indexOf("file:") + 5, resource.toString().indexOf("authentication")) + "Authentication.txt").replaceAll("%20"," ");
        String path = "/home/pavlik/Documents/JavaTutorEpam/TrainingProjectSixApplicationOne/target/classes/Authentication.txt";
        return Paths.get(path).toFile();
    }

    public static File getCatalog(){
        URL resource = Authentication.class.getResource("Authentication.class");
//        String path = (resource.toString().substring(resource.toString().indexOf("file:") + 5, resource.toString().indexOf("authentication")) + "Catalog.txt").replaceAll("%20"," ");
        String path = "/home/pavlik/Documents/JavaTutorEpam/TrainingProjectSixApplicationOne/target/classes/Catalog.txt";
        return Paths.get(path).toFile();
    }
}
