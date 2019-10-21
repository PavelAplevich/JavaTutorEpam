package simple.classes.and.objects.TaskSix;

class TimeLogic {

    static void changeHours(Time time, int hours){
        time.setHours(time.getHours() + hours);
    }

    static void changeMinute(Time time, int minute){
        time.setMinute(time.getMinute() + minute);
    }

    static void  changeSecond(Time time, int second){
        time.setSecond(time.getSecond() + second);
    }
    //TODO  Продолжить с задания 7 и срефакторить задания 3 4 5
}
