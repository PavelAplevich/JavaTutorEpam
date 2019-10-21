package simple.classes.and.objects.TaskFour;


import java.util.GregorianCalendar;

//Класс поезда.
public class Train{
    private String destination;
    private int trainNumber;
    private GregorianCalendar departureTime;

    //Набор геттеров и сеттеров для Train.
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public GregorianCalendar getDepatureTime() {
        return departureTime;
    }

    public void setDepatureTime(GregorianCalendar depatureTime) {
        this.departureTime = depatureTime;
    }

    public void setAllData(String destination, int trainNumber, GregorianCalendar departureTime){
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

}