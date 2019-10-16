package workWith.stringAs.aObject;

/*
    Работа со строкой как с объектом типа String или StringBuilder.
    Задание №9.
    Посчитать количество строчных(маленьких) и прописных(больших) букв в введенной строке. Учитывать только английские
    буквы.
*/

public class TaskNine {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закоментированный хардкод, использованный мной для проверки

//        String str = "London is the Capital of GreatBritain";
//        System.out.println("Количество строчных символов: " + countLowerCaseLiteral(str));
//        System.out.println("Количество прописных символов: " + countUpperCaseLiteral(str));
    }

    //Метод возвращает количество строчных английских букв.
    public static int countLowerCaseLiteral(String str){
        str = str.replaceAll("[^a-z]", "");
        return str.length();
    }

    //Метод возвращает количество прописных английских букв.
    public static int countUpperCaseLiteral(String str){
        str = str.replaceAll("[^A-Z]", "");
        return str.length();
    }
}
