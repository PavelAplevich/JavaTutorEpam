/*
  Все задания по работе со строкой как с объектом типа String или StringBuilder будут представлены в этом пакете.
  Каждое задание будет иметь свой отдельный класс.
 */

package workWith.stringAs.aObject;

/*
    Работа со строкой как с объектом типа String или StringBuilder.
    Задание №1.
    Дан текст(строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */


import static workWith.stringAs.arrayOf.characters.TaskFive.isSpace;

public class TaskOne {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закомментированный хардкод, использованный мной для проверки

//        String str = "Строка с пробелами  которых    максимум        восемь  ";
//        System.out.println(str);
//        System.out.println("Максимальное количество пробелов подряд: " + maxSpaceCount(str));
    }

    //Метод принимает строку и возвращает количество подряд стоящих пробелов.
    public static int maxSpaceCount(String str){
        int count = 0;
        int bufCount = 0;
        char[] array = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(isSpace(array[i])){      //Метод isSpace использовался в предыдущих заданиях. Отвечает на то, является ли
                bufCount++;             //символ пробелом
                if(bufCount > count){
                    count = bufCount;
                }
            }  else {
                bufCount=0;
            }
        }
        return count;
    }
}
