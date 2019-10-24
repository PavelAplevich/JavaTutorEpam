package simple.classes.and.objects.TaskTen;

import java.sql.Time;

//Класс с логикой Airline.
public class AirlineLogic {

    //Перегруженный метод вывода списка чего-либо из массива Airline.
    static void printList(Airline[] airlines, String destination){
        for(Airline airline: airlines){
            if(airline.getDestination().equals(destination)){
                AirlineOutput.printAirline(airline);
            }
        }
    }

    static void printList(Airline[] airlines, Week day){
        for(Airline airline: airlines){
            if(airline.getDay().equals(day)){
                AirlineOutput.printAirline(airline);
            }
        }
    }

    static void printList(Airline[] airlines, Week day, Time time){
        for(Airline airline: airlines){
            if(airline.getDay().equals(day)){
                if(airline.getTime().after(time)){
                    AirlineOutput.printAirline(airline);
                }
            }
        }
    }
}
