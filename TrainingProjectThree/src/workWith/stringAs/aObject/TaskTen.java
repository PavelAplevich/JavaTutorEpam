package workWith.stringAs.aObject;

/*
    Работа со строкой как с объектом типа String или StringBuilder.
    Задание №10.
    Строка Х состоит из нескольких предложений, каждлое из которых кончается точкой, восклицательным знаком или
    вопросительным знаком. Определить количество предложений в строке Х.
*/

public class TaskTen {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закомментированный хардкод, использованный мной для проверки

        String str = "  А роза. упала! на лапу? Азора.";
        System.out.println("Количество предложений: " + countSentence(str));
    }

    //Метод принимает строку и возвращает количество предложений.
    public static int countSentence(String str){
        str = str.replaceAll("[^\\.!\\?]", "");
        return str.length();
    }
}
