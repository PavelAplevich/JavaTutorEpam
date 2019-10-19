
//Класс отвечает за вывод
public class Output {

    //Метод выводит передаваемую строку с переводом на новую строку
    public void stringOutLn(String text){
        System.out.println(text);
    }
    public void stringOutLnCyan(String text){
        System.out.println("\033[36m"+text);
        System.out.print("\033[0m");
    }
    public void stringOutLnRed(String text){
        System.out.println("\033[31m"+text);
        System.out.print("\033[0m");
    }
}
