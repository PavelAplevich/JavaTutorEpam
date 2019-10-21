package simple.classes.and.objects.TaskSix;

//Класс времени.
class Time {
    private int hours = 3;
    private int minute = 2;
    private int second = 7;

    //Набор конструкторов
    Time(){}

    Time(int hours, int minute, int second){
        this.hours = hours;
        this.minute = minute;
        this.second = second;
    }

    //Метод вывода времени.
    void outPut(){
        TimeOutput.printTime(this);
    }
    //Метод изменения часов.
    void changeHours(int hours){
        TimeLogic.changeHours(this, hours);
    }
    //Метод изменения минут.
    void changeMinute(int minute){
        TimeLogic.changeMinute(this, minute);
    }
    //Метод изменения секунд.
    void changeSecond(int second){
        TimeLogic.changeSecond(this, second);
    }

    //Набор сеттеров и геттеров
    int getHours() {
        return hours;
    }

    void setHours(int hours) {
        if(hours < 24 && hours > 0){
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    int getMinute() {
        return minute;
    }

    void setMinute(int minute) {
        if(minute < 60 && minute > 0){
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    int getSecond() {
        return second;
    }

    void setSecond(int second) {
        if(second < 60 && second > 0){
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    void setAllData(int hours, int minute, int second){
        this.hours = hours;
        this.minute = minute;
        this.second = second;
    }
}
