import java.util.Scanner;

public class Action {

    public static void doAction(int numberAction,String text){
        switch (numberAction){
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
                    doAction(numberAction,text);
                }
                doActionThree(text, simbol);
        }
    }

    //Метод выполняет сортировку текста по количеству предложений.
    private static void doActionOne(String text){
        String[] result = text.split("\t");
        result = stringArraySort(result);
        for(String x: result){
            System.out.print("\t" + x);
        }
    }

    //Метод отсортировывает в каждом предложении все слова по длине.
    private static void doActionTwo(String text){
       String[] array = text.split("[\\.!\\?]");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
       String[] endSentence = text.split("[^\\.!\\?]");
       for(int i = 0; i < array.length; i++){
           array[i] = array[i].replaceAll("\\n\\t\\f", "");
           System.out.println(array[i]);
           array[i] = String.join(" ", stringArraySort(array[i].split(" ")));
           array[i] += endSentence[i];

       }
    }

    //Метод отсортировывает лексемы в предложении по убыванию количества вхождений заданного символа
    private static void doActionThree(String text, String simbol){

    }

    private static String[] stringArraySort(String[] result){
        for(int i = 0; i < result.length-1; i++){
            if(result[i].length() < result[i+1].length()){
                String buf = result[i];
                result[i] = result[i+1];
                result[i+1] = buf;
                stringArraySort(result);
            }
        }
        return result;
    }


}
