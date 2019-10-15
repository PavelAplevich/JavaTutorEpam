/*
  Все задания по работе со строкой как с массивом символов будут представлены в этом пакете. Остальные блоки третьей
  части также будут в отдельных пакетах. Каждое задание будет иметь свой отдельный класс.
 */

package workWith.stringAs.arrayOf.characters;

/*
    Работа со строкой как с массивом символов.
    Задание №1.
    Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class TaskOne {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закоментированный хардкод, использованный мной для проверки

//        String[] array = {"camelCase", "SnakeCase", "tmpTmTmpTat", "АртасНУБ"};
//        array = snakeCase(array);
//        for(String x : array){
//            System.out.println(x + " ");
//        }
    }

    /*Метод возвращает snake_case массив вызывающему. Работает только с английскими буквами Юникода и не проверяет
    правила обозначения переменных.
     */
    public static String[] snakeCase(String[] array){
        int count = 0;
        String[] resultArray = new String[array.length+count];
        for(int i = 0; i < array.length; i++){
            char[] str = array[i].toCharArray();
            for (int j = 0; j < str.length;j++){
                if(str[j] >= 'A' && str[j] <= 'Z'){     //Цикл определения длины результирующего массива
                    count++;
                }
            }
            char[] buf = new char[str.length+count];    //Массив чаров для создания одного из элементов результата
            for(int x = 0, y = 0; x < str.length; x++){
                if(str[x] >= 'A' && str[x] <= 'Z'){
                    buf[x+y] = 95;                      //Номер в Юникоде нижнего подчеркивания
                    buf[x+y+1] = (char)(str[x] + 32);   //Разница в Юникод между большой буквой и маленькой
                    y++;
                } else {
                    buf[x+y] = str[x];
                }
            }
            resultArray[i] = new String(buf);
            count = 0;
        }
        return resultArray;
    }


}
