import java.util.regex.Pattern;

public class MyPattern {

    public Pattern openTagPattern(){
        Pattern pattern = Pattern.compile("<[a-zA-z]>");
        return pattern;
    }
}
