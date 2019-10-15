package workWith.stringAs.arrayOf.characters;
// TODO: 15.10.2019 Делать здесь
/*
    Работа со строкой как с массивом символов.
    Задание №4.
    В строке найти количество чисел.
 */

public class TaskFour {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, я оставлю закоментированный хардкод, использованный мной для проверки

//        String str = "12.3//a..3 4..wase.t56hdfh5..qwq//.j.fj./.....,,wte4";
//        System.out.println("Количество чисел в строке: " + countNumberInString(str));
    }

    //Метод возвращает количество чисел в сроке
    public static int countNumberInString(String str){
        int count = 0;
        //Регулярное выражение убирает все нецифры кроме точек
        str = str.replaceAll("[^\\. && \\D]", " ");//
        //Регулярное выражение убирает все подряд идущие точки
        str = str.replaceAll("\\.{2,}",  " ");
        //Выражение убирает все точки перед которыми ничего нет
        str = str.replaceAll("\\D\\.", " ");
        //Выражение убирает все множественные пробелы, заменяя их одним
        str = str.replaceAll("\\ {2,}", " ");
        //Используем метод split для образования массива строк, содержащих числа
        String[] array = str.split(" ");
        //Возвращаем длину массива, которая и является искомым количеством чисел
        return array.length;
    }

}
