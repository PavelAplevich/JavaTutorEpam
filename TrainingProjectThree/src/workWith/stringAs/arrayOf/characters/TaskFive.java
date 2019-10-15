package workWith.stringAs.arrayOf.characters;

/*
    Работа со строкой как с массивом символов.
    Задание №5.
    Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    Крайние пробелы в строке удалить.
 */

public class TaskFive {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закоментированный хардкод, использованный мной для проверки

        String str = " Это   довольно длин ная   строка с   пробелом     в   начале и двумя в конце  ";
        System.out.println( deleteExtraSpace(str));
    }

//    public static String deleteExtraSpace(String str){
//        //Регулярное выражение убивает множественные пробелы.
//        str = str.replaceAll("\\s{2,}", " ");
//        //Метод trim убирает пробелы в начале и конце строки.
//        str = str.trim();
//        return str;
//    }

    public static String deleteExtraSpace(String str){
        int count = 0;              //Счетчик лишних пробелов
        char[] array = str.toCharArray();   //Создание массива символов из строки
        for(int i = 0; i < array.length - 1; i++){  //Цикл подсчета лишних пробелов
            if(isSpace(array[i]) && (isSpace(array[i+1]))){
                count++;
            }
        }
        char[] resultArray = new char[array.length-count];  //Создание массива с одиночными пробелами
        for(int i = 0, j = 0; i < array.length; ){          //и цикл его наполнения
            if((i < array.length-1) && (isSpace(array[i]) && isSpace(array[i+1]))){
                i++;
            } else {
                resultArray[j] = array[i];
                i++;
                j++;
            }
        }
        if(isSpace(resultArray[0])){                     //Проверка на пробел в начале массива
            char[] buf = new char[resultArray.length - 1];
            for(int i = 1; i < resultArray.length;i++) {
                buf[i - 1] = resultArray[i];
            }
            resultArray = buf;
        }
        if(isSpace(resultArray[resultArray.length-1])){  //Проверка на пробел в коце массива
            char[] buf = new char[resultArray.length-1];
            for(int i = 0; i < resultArray.length-1;i++){
                buf[i] = resultArray[i];
            }
            resultArray = buf;
        }
        return new String(resultArray);
    }

    //Метод отвечает является ли символ пробелом
    public static boolean isSpace(char space){
        return space == ' ';
    }
}
