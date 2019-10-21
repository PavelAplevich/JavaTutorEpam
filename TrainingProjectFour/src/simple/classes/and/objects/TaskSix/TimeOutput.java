package simple.classes.and.objects.TaskSix;

class TimeOutput {

    static void printTime(Time time){
        System.out.println("Текущее время");
        System.out.printf("%02dч. %02dмин. %02dсек.\n ",time.getHours(),time.getMinute(),time.getSecond());
    }
}
