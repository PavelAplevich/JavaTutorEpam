package server.output;

public class Output {

    static public void print(String string){
        System.out.println(string);
    }

    static public void printRed(String string){
        System.out.println("\u001B[31m" + string + "\u001B[0m");
    }

    static public void printGreen(String string){
        System.out.println("\u001B[32m" + string + "\u001B[0m");
    }

    static public void printYellow(String string){
        System.out.println("\u001B[33m" + string + "\u001B[0m");
    }

    static public void printBlue(String string){
        System.out.println("\u001B[34m" + string + "\u001B[0m");
    }

    static public void printPurple(String string){
        System.out.println("\u001B[35m" + string + "\u001B[0m");
    }

    static public void printCyan(String string){
        System.out.println("\u001B[36m" + string + "\u001B[0m");
    }

    static public void printWhite(String string){
        System.out.println("\u001B[37m" + string + "\u001B[0m");
    }

}
