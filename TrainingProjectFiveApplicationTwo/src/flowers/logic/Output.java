package flowers.logic;

//Класс реализующий различные выводы на консоль.
public class Output {

    static public void printOut(String string){
        System.out.println(string);
    }

    static public void printOutRed(String string){
        System.out.println("\u001B[31m" + string + "\u001B[0m");
    }

    static public void printOutGreen(String string){
        System.out.println("\u001B[32m" + string + "\u001B[0m");
    }

    static public void printOutYellow(String string){
        System.out.println("\u001B[33m" + string + "\u001B[0m");
    }

    static public void printOutBlue(String string){
        System.out.println("\u001B[34m" + string + "\u001B[0m");
    }

    static public void printOutPurple(String string){
        System.out.println("\u001B[35m" + string + "\u001B[0m");
    }

    static public void printOutCyan(String string){
        System.out.println("\u001B[36m" + string + "\u001B[0m");
    }

    static public void printOutWhite(String string){
        System.out.println("\u001B[37m" + string + "\u001B[0m");
    }
}
