package simple.classes.and.objects.TaskFive;

public class DecimalCounter {
    private int begin = 0;
    private int end = 100;
    private int value = 0;

    //Конструкторы класса
    public DecimalCounter(){}

    public DecimalCounter(int begin, int end, int value){
        this.begin = begin;
        this.value = value;
        this.end = end;
    }

    //Сеттеры и геттеры класса
    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setAllData(int begin, int value, int end){
        this.begin = begin;
        this.value = value;
        this.end = end;
    }
}
