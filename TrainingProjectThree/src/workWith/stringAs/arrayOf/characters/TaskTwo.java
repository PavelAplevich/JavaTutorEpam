package workWith.stringAs.arrayOf.characters;

/*
    Работа со строкой как с массивом символов.
    Задание №2.
    Замените в строке все вхождения 'word' на 'letter'.
 */


public class TaskTwo {
    public static void main(String[] args) {
            //Т.к. не указан метод ввода, я оставлю закомментированный хардкод, использованный мной для проверки

        String str = "wordPress call me Word int word word wide.";
        System.out.println(wordReplace(str));
    }

//    //Метод через строку как объект. Выполняет замену и чувствителен к регистру(намеренно).
//    public static String wordReplace(String str){
//        return str.replaceAll("word","letter");
//    }


    //Метод решения задачи через массив символов. Чувствителен к регистру.
    public static String wordReplace(String str){
        int count = 0;                  //Счетчик размера итогового массива символов
        char[] array = str.toCharArray();
        for(int i =0; i < array.length-4;i++){
            if((isWord(array[i],array[i+1],array[i+2],array[i+3]))){
                count++;                //Цикл определения  размера итогового массива символов
            }
        }
        char[] resultArray = new char[array.length + count*2];
        for (int i = 0, j = 0; i < array.length;){
            //Ленивые вычисления помогают избежать переполнения массива
            if((i < array.length-3) && (isWord(array[i],array[i+1],array[i+2],array[i+3]))){
                resultArray[j] = 'l';
                resultArray[j+1] = 'e';
                resultArray[j+2] = 't';
                resultArray[j+3] = 't';
                resultArray[j+4] = 'e';
                resultArray[j+5] = 'r';
                j+=6;
                i+=4;
            } else {
                resultArray[j] = array[i];
                j++;
                i++;
            }
        }
        return new String(resultArray);
    }

    //Метод принимает четыре символа и проверяет являются ли они словом "word"
    public static boolean isWord(char w, char o, char r, char d){
        return w == 'w' && o == 'o' && r == 'r' && d == 'd';
    }

}
