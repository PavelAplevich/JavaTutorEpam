package simple.classes.and.objects.TaskFour;

/*
    Простейшие классы и объекты.
    Задание №4.
    Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
    данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
    Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки
    массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени
    отправления.

 */



import java.util.GregorianCalendar;

public class TaskFour {
    public static void main(String[] args) {
        //Ниже приведен закомментированный хард-код для проверки.

//        Train[] array = TrainArray.trainArray(5);
//        array[0].setAllData("Amsterdam", 13, new GregorianCalendar(2019, 10,20,10,21));
//        array[1].setAllData("London", 1, new GregorianCalendar(2019,10,20,10,10));
//        array[2].setAllData("Amsterdam", 12, new GregorianCalendar(2019,10,20,8,01));
//        array[3].setAllData("Moscow", 147, new GregorianCalendar(2019,10,20,1,21));
//        array[4].setAllData("London", 2, new GregorianCalendar(2019,10,21, 0,00));

        //Проверка сортировки по номерам.
//        for(Train x:TrainLogic.trainArraySortNumber(array)){
//            TrainPrint.trainPrint(x);
//        }
        //Проверка сортировки по направлению.
//        for(Train x: TrainLogic.trainArraySortDestination(array)){
//            TrainPrint.trainPrint(x);
//        }
        //Проверка вывода поезда по номеру из списка.
//        try{TrainPrint.trainPrint(TrainLogic.getTrain(array,-1));}
//        catch (Exception e){
//            System.out.println(e);
//        }
    }
}
