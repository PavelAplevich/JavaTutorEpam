package simple.classes.and.objects.TaskFive;

/*
    Простейшие классы и объекты.
    Задание №5.
    Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
    в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
    Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющий получить его текущее состояние.
    Написать код, демонстрирующий все возможности класса.

 */

public class TaskFive {

    //В main представлен код, демонстрирующий возможности класса DecimalCounter.
    public static void main(String[] args) throws Exception {
        DecimalCounter counter = new DecimalCounter();
        System.out.println(counter.getValue());
//        DecimalCounterLogic.decreaseCounter(counter);
        for(int i = 0; i < 11; i++){
            DecimalCounterLogic.increaseCounter(counter);
        }
        System.out.println(counter.getValue());
//        for(int i = 0; i < 110; i++){
//            DecimalCounterLogic.increaseCounter(counter);
//        }

        DecimalCounter counter1 = new DecimalCounter(-1,10,111);
        System.out.println(counter1.getValue()+ " " + counter1.getBegin() + " " + counter1.getEnd());
        counter1.setAllData(100, 1000, 100000);
        System.out.println(counter1.getValue()+ " " + counter1.getBegin() + " " + counter1.getEnd());
    }
}
