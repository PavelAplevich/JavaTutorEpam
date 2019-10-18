
//Класс отвечает за выполнение действий над текстом. Имеет один публичный метод для работы с текстом и несколько
//внутренних приватных для логики своей работы.

public class Action {

    //Публичный метод, выполняет заданной действие над входным текстом и вызывает методы вывода
    public void doAction(int numberAction,String text){
        //Выбор действия в зависимости от переданного номера
        switch (numberAction){
            case 1:
                doActionOne(text);
                break;
            case 2:
                doActionTwo(text);
                break;
            case 3:
                new Output().stringOutLn("Введите символ для сортировки...");
                String symbol = new MyReader().readSymbol();
                new Output().stringOutLn("");
                doActionThree(text, symbol);
                break;
            default:
                new Output().stringOutLn("Something went wrong...");
        }
    }

    //Метод выполняет сортировку текста по количеству предложений.
    private static void doActionOne(String text){
        //Передача методу сортировки массива из разбитого по знаку табуляции текста
        String[] result = new Sort().stringArraySort(text.split("\\t"));
        //Вызов метода вывода
        new Output().stringOutLn(String.join("",result));
    }

    //Метод отсортировывает в каждом предложении все слова по длине.
    private static void doActionTwo(String text){
        text = new Sort().textFormat(text);
        //Разбиваем текст на массив предложений
        String[] array = text.split("[.!?]");
        //Регулярное выражения для создания строки, состоящей из символов окончания предложений
        String endSentence = text.replaceAll("[^.!?]", "");
        //Создание массива окончаний предложений
        String[] endSentenceArray = endSentence.split("");
        //Цикл, в котором мы получаем отсортированную строку
        for(int i = 0; i < array.length; i++){
            //Сортировка строки
            array[i] = String.join(" ", new Sort().stringArraySort(array[i].split(" ")));
            //Конкатенация строки с её окончанием
            array[i] = array[i].concat(endSentenceArray[i]);
        }
        new Output().stringOutLn(String.join("", array));
        new Output().stringOutLn("");
    }

    //Метод отсортировывает лексемы в предложении по убыванию количества вхождений заданного символа
    private static void doActionThree(String text, String symbol){
        text = new Sort().textFormat(text);
        //Создаем массив предложений
        String[] sentenceArray = new Sort().textFormat(text).split("[.!?]");
        //Создаем массив окончаний предложений
        String[] endSentenceArray = (text.replaceAll("[^.!?]", "")).split("");
        //Цикл сортировки предложений согласно выбору №3
        for(int i = 0; i < sentenceArray.length; i++){
            sentenceArray[i] = new Sort().sortSentenceSymbol(sentenceArray[i], symbol);
            sentenceArray[i] = sentenceArray[i].concat(endSentenceArray[i] + "\n");
        }
        new Output().stringOutLn("Ваш результат: \n");
        new Output().stringOutLn(String.join("",sentenceArray));
    }
}
