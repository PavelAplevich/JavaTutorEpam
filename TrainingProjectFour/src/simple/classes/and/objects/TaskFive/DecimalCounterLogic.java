package simple.classes.and.objects.TaskFive;

public class DecimalCounterLogic {

    //Метод увеличения счетчика. Бросает исключение при переполнении счетчика.
    public static void increaseCounter(DecimalCounter counter) throws Exception {
        counter.setValue(counter.getValue()+1);
        if(counter.getValue() > counter.getEnd()) {
            throw new Exception("Counter is full!");
        }

    }

    //Метод уменьшения счетчика. Бросает исключение, если счетчик пуст.
    public static void decreaseCounter(DecimalCounter counter) throws Exception {
        counter.setValue(counter.getValue()- 1);
        if(counter.getValue() < counter.getBegin()){
            throw new Exception("Counter is empty!");
        }
    }
}
