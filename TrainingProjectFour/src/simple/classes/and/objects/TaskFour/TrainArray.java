package simple.classes.and.objects.TaskFour;

//Класс массива поездов.
public class TrainArray {

    //Метод создает массив с заданным количеством поездов
    public static Train[] trainArray(int count){
        Train[] result = new Train[count];
        for(int i = 0; i < result.length; i++){
            result[i] = new Train();
        }
        return result;
    }
}
