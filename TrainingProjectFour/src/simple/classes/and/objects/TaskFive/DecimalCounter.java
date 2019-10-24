package simple.classes.and.objects.TaskFive;

class DecimalCounter {
    private int begin = 0;
    private int end = 100;
    private int value = 0;

    //Конструкторы класса
    DecimalCounter(){}

    DecimalCounter(int begin, int end, int value){
        this.begin = begin;
        this.value = value;
        this.end = end;
    }

    //Сеттеры и геттеры класса
    int getBegin() {
        return begin;
    }

    void setBegin(int begin) {
        this.begin = begin;
    }

    int getEnd() {
        return end;
    }

    void setEnd(int end) {
        this.end = end;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    void setAllData(int begin, int value, int end){
        this.begin = begin;
        this.value = value;
        this.end = end;
    }
}
