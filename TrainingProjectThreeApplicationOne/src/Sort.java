
//Класс различных сортировок, необходимых в логике работы
public class Sort {

    //Метод принимает строку и символ и сортирует строку по количеству вхождений символа, и по алфавиту
    public  String sortSentenceSymbol(String sentence, String symbol){
        sentence = sentence.trim();
        //Создание массива слов
        String[] word = stringFormatToArray(sentence);
        for(int i = 0; i < word.length - 1; i++){
            //Сравнение количества символов в каждом слове и сортировка слов
            if(simbolCount(word[i], symbol) < simbolCount(word[i+1], symbol)){
                String buf = word[i];
                word[i] = word[i+1];
                word[i+1] = buf;
                i = -1;
            //Если количество вхождений символа равно, выполняем сортировку по алфавиту
            } else if(simbolCount(word[i], symbol) == simbolCount(word[i+1], symbol)){
                if(word[i+1].equals(alphabetSort(word[i], word[i+1]))) {
                    String buf = word[i+1];
                    word[i+1] = word[i];
                    word[i] = alphabetSort(word[i],buf)  ;
                }
            }
        }
        sentence = String.join(" ",word);
        return sentence;
    }

    //Метод принимает две строки. Возвращает строку, стоящую раньше по алфавиту
    public String alphabetSort(String stringOne, String stringTwo){
        char[] arrayOne = stringOne.toCharArray();  //Массив букв первого слова
        char[] arrayTwo = stringTwo.toCharArray();  //Массив букв второго слова
        for(int i = 0; i < Math.min(arrayOne.length,arrayTwo.length);i++){
            //сравниваем ASCII представление букв. Чем буква раньше, тем её номер меньше
            if((int)Character.toLowerCase(arrayOne[i]) < (int)Character.toLowerCase(arrayTwo[i])){
                return stringOne;
            } else if ((int)Character.toLowerCase(arrayOne[i]) == (int)Character.toLowerCase(arrayTwo[i])){
                continue;
            } else {
                return stringTwo;
            }
        }
        return stringOne;
    }

    //Метод сортирует входящий массив строк по убыванию количества символов элемента
    public String[] stringArraySort(String[] result){
        //Цикл сортировки через рекурсию
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

    //Метод возвращает количество заданных символов в слове(представленном массивом символов)
    public int simbolCount(String word, String simbol){
        char[] array = word.toCharArray();
        int count = 0;
        for( int i = 0; i < array.length; i++){
            if(array[i] == simbol.charAt(0)){
                count++;
            }
        }
        return count;
    }

    //Метод делает из строки массив строк
    public String[] stringFormatToArray(String sentence){
        sentence = sentence.replaceAll("[,'\"/;]", " ");
        sentence = sentence.replaceAll("\\s{2,}", " ");
        String[] word = sentence.split(" ");
        return word;
    }

    //Метод форматирует строку
    public String textFormat(String text){
        text = text.trim();
        text = text.replaceAll("\\t" , "");       //Убираем табуляции
        text = text.trim();                                        //Убираем пробелы по краям
        return text;
    }
}
