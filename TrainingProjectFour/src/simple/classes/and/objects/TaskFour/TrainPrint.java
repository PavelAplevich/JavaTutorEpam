package simple.classes.and.objects.TaskFour;

//Класс вывода информации по поездам
public class TrainPrint {

    //Метод вывода информации по поезду на консоль
    public static void trainPrint(Train train){
        System.out.println("Поезд номер: " + train.getTrainNumber() + "\nНаправление: " + train.getDestination()
        + "\nВремя отправления: " + train.getDepatureTime().toZonedDateTime() + "\n");
    }
}
