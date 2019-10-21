package one.dimensional.arrays;

/*
    Одномерные массивы.
    Задание №9.
    В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
    несколько, от определить наименьшее из них.
 */

public class TaskNine {
    public static void main(String[] args) {
        //Т.к. не указан метод ввода, оставил закомментированный хард-код, использованный мной для проверки.

//        double[] array = {0,0,0,1,1,2,3,3,3,3,-2.1,-2.1,-2.1,-2.1};
//        System.out.println(taskNumber(array));
    }

    public static double taskNumber(double[] a){ //Метод возвращаюший искомое число из массива.
        int countOne = -1;
        int countTwo = -1;
        double maxNumber = 0;
        for (int i = 0; i < a.length; i++){
            for(int x = 0; x < a.length; x++){   //Вложенные циклы для нахождения повторений.
                if(a[x] == a[i]){
                    countTwo++;
                }
            }

            if(countOne < countTwo){              //Блок условий, определяющий минимальное число с
                countOne = countTwo;              //максимальным количеством повторений.
                maxNumber = a[i];
            }
            if (countOne == countTwo){
                if(maxNumber > a[i]){
                    maxNumber = a[i];
                }
            }
            countTwo = -1;
        }
        return maxNumber;                           //Возврат искомого числа.
    }
}
