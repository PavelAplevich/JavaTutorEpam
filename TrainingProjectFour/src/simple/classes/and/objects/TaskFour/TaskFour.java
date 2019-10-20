package simple.classes.and.objects.TaskFour;

/*
    Простейшие классы и объекты.
    Задание №4.
    Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
    данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
    Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможноть сортировки
    массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени
    отправления.

 */

import java.util.Date;

public class TaskFour {
    public class Train{
        private String destination;
        private int trainNumber;
        private Date depatureTime;

        public Train trainFactory(){
            return new Train();
        }

        public Train[] getTrainArray(int count){
            Train[] trainArray = new Train[count];
            for(int i = 0; i < trainArray.length; i++){
                trainArray[i] = trainFactory();
            }
            return trainArray;
        }

        public Train
    }
}
