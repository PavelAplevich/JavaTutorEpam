package workWith.stringAs.aObject;

/*
    Работа со строкой как с объектом типа String или StringBuilder.
    Задание №6.
    Из заданной строки получить новую, повторив каждый символ дважды
 */

public class TaskSix {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закомментированный хардкод, использованный мной для проверк

//        String str = "  А роза упала на лапу Азора";
//        System.out.println(twoLiteral(str));
    }

    //Метод принимает строку, повторяет каждый символ дважды и возвращает строку-результат
    public static String twoLiteral(String str){
        char[] array = str.toCharArray();
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            resultString.append(array[i]).append(array[i]);
        }
        return resultString.toString();
    }
}
