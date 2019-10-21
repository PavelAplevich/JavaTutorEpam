public class Main {
    public static void main(String[] args) {
        new Output().textOutLn("Здраствуйте! Вы запустили программу парсинга XML - документа");
        run();
    }

    public static void run(){
        String text = new Input().testInput();
        text = new MyParser().parsXml(text);
        new Output().textOutLn(text);
    }
}
