package simple.classes.and.objects.TaskTen;


import java.sql.Time;

//Класс по заданию.
class Airline {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private Time time;
    private Week day;

    //Метод вывода экземпляра класса.
    void printAirline(){
        AirlineOutput.printAirline(this);
    }

    //Метод создания массива экземляров Airline.
    static Airline[] createAirlineArray(int count){
        Airline[] array = new Airline[count];
        for(int i = 0; i < array.length; i++){
            array[i] = new Airline();
        }
        return array;
    }

    //Набор сеттеров и геттеров и переопределенный toString.
    void setAllData(String destination, int flightNumber, String aircraftType, Time time, Week day) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.time = time;
        this.day = day;
    }

    String getDestination() {
        return destination;
    }

    void setDestination(String destination) {
        this.destination = destination;
    }

    int getFlightNumber() {
        return flightNumber;
    }

    void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    String getAircraftType() {
        return aircraftType;
    }

    void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    Time getTime() {
        return time;
    }

    void setTime(Time time) {
        this.time = time;
    }

    Week getDay() {
        return day;
    }

    void setDay(Week day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Airline{" +
                " destination = '" + destination + '\'' +
                ", flightNumber = " + flightNumber +
                ", aircraftType = '" + aircraftType + '\'' +
                ", time = " + time +
                ", day = " + day +
                '}';
    }
}
