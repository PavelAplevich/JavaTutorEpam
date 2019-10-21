package simple.classes.and.objects.TaskFour;

import java.util.GregorianCalendar;

//Класс действий над поездом.
public class TrainLogic {

    //Получение поезда из массива поездов по номеру. Бросает исключение, если номера не существует.
    public static Train getTrain(Train[] trains, int number) throws Exception{
        for(Train i: trains){
            if (i.getTrainNumber() == number){
                return i;
            }
        }
        throw new Exception("Train do not exist!");
    }

    //Метод сортировки массива поездов по номеру.
    public static Train[] trainArraySortNumber(Train[] array){
        for(int i = 0; i < array.length-1; i++){
            if(array[i].getTrainNumber() > array[i+1].getTrainNumber()){
                Train buf = array[i];
                array[i] = array[i+1];
                array[i+1] = buf;
                trainArraySortNumber(array);
            }
        }
        return array;
    }

    //Метод сортировки массива поездов по станции назначения.
    public static Train[] trainArraySortDestination(Train[] array){
        for(int i = 0; i < array.length-1; i++){
            if(isAlphabet(array[i].getDestination(), array[i+1].getDestination()) == 0){
                Train buf = array[i];
                array[i] = array[i+1];
                array[i+1] = buf;
                trainArraySortDestination(array);
            } else if(isAlphabet(array[i].getDestination(), array[i+1].getDestination()) == -1){
                if(!isDateBefore(array[i].getDepatureTime(), array[i+1].getDepatureTime())){
                    Train buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                    trainArraySortDestination(array);
                }
            } else{
                continue;
            }
        }
        return array;
    }

    //Метод отвечает стоит ли первая строка по алфавиту раньше второй. И одинаковы ли они.
    private static int isAlphabet(String first, String second){
        first = first.toLowerCase();
        second = second.toLowerCase();
        for(int i = 0; i < Math.min(first.length(), second.length()); i++){
            if((int)first.charAt(i) < (int)second.charAt(i)){
                return 1;   //Возвращает что первая строка стоит раньше.
            } else if((int)first.charAt(i) == (int)second.charAt(i)){
                continue;
            } else{
                return 0;   //Возвращает что первая строка стоит позже.
            }
        }
        return -1;          //Возвращает если строки равны.
    }

    //Метод отвечает стоит ли первая дата раньше второй.
    private static boolean isDateBefore(GregorianCalendar first, GregorianCalendar second){
        return first.before(second);
    }
}
