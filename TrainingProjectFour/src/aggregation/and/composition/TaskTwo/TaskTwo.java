package aggregation.and.composition.TaskTwo;

/*
    Агрегация и композиция.
    Задание №2.
    Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
    менять колесо, вывести на консоль марку автомобиля.
 */

public class TaskTwo {
    public static void main(String[] args) {
        Car car = new Car("Audi");
        car.printModel();
    }
}
