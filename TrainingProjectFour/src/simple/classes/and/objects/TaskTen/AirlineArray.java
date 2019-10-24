package simple.classes.and.objects.TaskTen;

import java.sql.Time;

//Класс агрегирующий массив Airline.
public class AirlineArray {
    private Airline[] array;

    //Конструктор
    AirlineArray(Airline[] array){
        this.array = array;
    }

    //Методы вывода списков по заданию.
    void printDestinationList(String destination){
        AirlineLogic.printList(this.array,destination);
    }

    void printDayList(Week day){
        AirlineLogic.printList(this.array, day);
    }

    void printDayTimeList(Week day, Time time){
        AirlineLogic.printList(this.array, day, time);
    }


}
