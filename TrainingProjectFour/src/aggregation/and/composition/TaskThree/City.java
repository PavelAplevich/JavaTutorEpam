package aggregation.and.composition.TaskThree;

//Класс города.
class City {
    private String name;

    //Конструктор.
    City(String name) {
        this.name = name;
    }

    //Набор геттеров и сеттеров.
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    //Переопределенный метод toString, возвращающий имя города.
    @Override
    public String toString() {
        return name;
    }
}
