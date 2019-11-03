package logic;

import authentication.Authentication;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;

public class Path {

    public static File getAuthentication(){
        URL resource = Authentication.class.getResource("Authentication.class");
        String path = (resource.toString().substring(resource.toString().indexOf("file:") + 5, resource.toString().indexOf("authentication")) + "Authentication.txt").replaceAll("%20"," ");
        return Paths.get(path).toFile();
    }

    public static File getCatalog(){
        URL resource = Authentication.class.getResource("Authentication.class");
        String path = (resource.toString().substring(resource.toString().indexOf("file:") + 5, resource.toString().indexOf("authentication")) + "Catalog.txt").replaceAll("%20"," ");
        return Paths.get(path).toFile();
    }
}
