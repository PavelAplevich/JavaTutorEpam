package decomposition.use.metods;

    /*
    Декомпозиция с использованием методов(подпрограммы).
    Задача №17.
    Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий
    надо произвести, чтобы получился ноль? Для решения использовать декомпозицию.
    */

public class TaskSeventeen {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки.
//        int number = 12345;
//        printCount(number);
    }

    //Метод вывода количества действий.
    public static void printCount(int number){
        int count = decreaseCount(number, 0);
        System.out.println("Количество произведенных действий = "  + count);
    }

    //Метод вычисления количества действий.
    public static int decreaseCount(int number, int count){
        if(number == 0){return count;}
        int[] array = doArray(number);
        int sumNumeral = 0;
        for(int i:array){
            sumNumeral += i;
        }
        number -= sumNumeral;
        count++;
        return decreaseCount(number,count);
    }

    //Метод возвращает число в виде массива цифр.
    public static int[] doArray(int number){
        int[] resultArray = new int[("" + number).length()];
        for(int i= 0; i < resultArray.length ;i++){
            resultArray[i] = number%10;
            number /= 10;
        }
        return resultArray;
    }
}
