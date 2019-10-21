import java.util.regex.Pattern;

public class MyParser {
    public String parsXml(String text){
        return myParser(text);
    }

    private String myParser(String text){
        StringBuilder builder = new StringBuilder(text);

        for(int i = 0; i < builder.length(); i++){
            new Output().textOutLn((builder.charAt(i)));
        }
        return text;
    }
}
