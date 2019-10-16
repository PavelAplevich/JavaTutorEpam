import java.util.Scanner;

public class Action {

    public static void doAction(int number,String text){
        switch (number){
            case 1:
                doActionOne(text);
                break;
            case 2:
                doActionTwo(text);
                break;
            default:
                System.out.println("Введите символ для сортировки... ");
                Scanner scanner = new Scanner(System.in);
                String simbol = scanner.nextLine();
                if(simbol.length() != 1){
                    System.out.println("Введите корректный символ. Спасибо! ");
                    doAction(number,text);
                }
                doActionThree(text, simbol);
        }
    }

    //Метод выполняет сортировку текста по количеству предложений.
    private static void doActionOne(String text){
        String[] array = text.split("[]");
    }

    //Метод отсортировывает в каждом предложении все слова по длине.
    private static void doActionTwo(String text){

    }

    //Метод отсортировывает лексемы в предложении по убыванию количества вхождений заданного символа
    private static void doActionThree(String text, String simbol){

    }

}
