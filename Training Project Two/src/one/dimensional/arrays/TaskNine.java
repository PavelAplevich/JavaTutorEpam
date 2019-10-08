package one.dimensional.arrays;

public class TaskNine {
    public static void main(String[] args) {
    }

    public static double taskNumber(double[] a){ //Метод возвращаюший искомое число из массива
        int countOne = -1;
        int countTwo = -1;
        double maxNumber = 0;
        for (int i = 0; i < a.length; i++){
            for(int x = 0; x < a.length; x++){  //Вложенные циклы для нахождения повторений
                if(a[x] == a[i]){
                    countTwo++;
                }
            }

            if(countOne < countTwo){             //Блок условий, определяющий минимальное число с максимальным кол-вом повторений
                countOne = countTwo;
                maxNumber = a[i];
            } else if (countOne == countTwo){
                if(maxNumber < a[i]){
                    maxNumber = a[i];
                }
            }
            countTwo = -1;
        }
        return maxNumber;
    }
}
