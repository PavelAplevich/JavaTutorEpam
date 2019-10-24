package simple.classes.and.objects.TaskFour;


import java.util.GregorianCalendar;

//Класс поезда.
class Train{
    private String destination;
    private int trainNumber;
    private GregorianCalendar departureTime;

    //Набор геттеров и сеттеров для Train.
    String getDestination() {
        return destination;
    }

    void setDestination(String destination) {
        this.destination = destination;
    }

    int getTrainNumber() {
        return trainNumber;
    }

    void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    GregorianCalendar getDepatureTime() {
        return departureTime;
    }

    void setDepatureTime(GregorianCalendar depatureTime) {
        this.departureTime = depatureTime;
    }

    void setAllData(String destination, int trainNumber, GregorianCalendar departureTime){
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

}