package TaskThree;

import java.util.ArrayList;
import java.util.GregorianCalendar;

//Класс реализующий календарь.
public class Calendar {
    private ArrayList<Holiday> holidays = new ArrayList<Holiday>();
    private ArrayList<Workday> workdays = new ArrayList<Workday>();

    //Метод добавления выходного дня.
    void addHoliday(Holiday... holidays){
        for(Holiday x:holidays){
            this.holidays.add(x);
        }
    }

    //Метод добавления рабочего дня.
    void addWorkday(Workday... workdays){
        for(Workday x: workdays){
            this.workdays.add(x);
        }
    }

    //Метод вывода выходных дней.
    void printHoliday(){
        System.out.println(holidays.toString());
    }

    //Метод вывода рабочих дней.
    void printWorkday(){
        System.out.println(workdays.toString());
    }

    //Метод вывода всех дней.
    void printAllDay(){
        System.out.println("Holiday days:");
        System.out.println(holidays.toString());
        System.out.println("Workday days:");
        System.out.println(workdays.toString());
    }

    //Вложенный класс реализующий создание объекта рабочего дня.
    class Workday{
        private GregorianCalendar workday;

        //Конструктор.
        Workday(GregorianCalendar workday){
            this.workday = workday;
        }

        //Набор сеттеров, геттеров и переопределенный toString для удобства вывода.
        public GregorianCalendar getWorkday() {
            return workday;
        }

        public void setWorkday(GregorianCalendar holiday) {
            this.workday = workday;
        }

        @Override
        public String toString() {
            return "" + workday.get(java.util.Calendar.YEAR) + "." + workday.get(java.util.Calendar.MONTH)
                    + "." + workday.get(java.util.Calendar.DAY_OF_MONTH);
        }
    }

    //Вложенный класс реализующий создание объекта выходного дня.
    class Holiday{
        private GregorianCalendar holiday;

        //Конструктор.
        Holiday(GregorianCalendar holiday){
            this.holiday = holiday;
        }

        //Набор сеттеров, геттеров и переопределенный toString для удобства вывода.
        public GregorianCalendar getHoliday() {
            return holiday;
        }

        public void setHoliday(GregorianCalendar holiday) {
            this.holiday = holiday;
        }

        @Override
        public String toString() {
            return "" + holiday.get(java.util.Calendar.YEAR) + "." + holiday.get(java.util.Calendar.MONTH)
                    + "." + holiday.get(java.util.Calendar.DAY_OF_MONTH);
        }
    }
}
