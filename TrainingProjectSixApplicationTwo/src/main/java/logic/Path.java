package logic;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;

public class Path {
    public static File getNotes(){
        URL resource = Run.class.getResource("Run.class");
        String path = (resource.toString().substring(resource.toString().indexOf("file:") + 5, resource.toString().indexOf("logic")) + "Notes.txt").replaceAll("%20"," ");
        return Paths.get(path).toFile();
    }
}
