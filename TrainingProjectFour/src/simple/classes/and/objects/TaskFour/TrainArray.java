package simple.classes.and.objects.TaskFour;

//Класс массива поездов.
class TrainArray {

    //Метод создает массив с заданным количеством поездов
    static Train[] trainArray(int count){
        Train[] result = new Train[count];
        for(int i = 0; i < result.length; i++){
            result[i] = new Train();
        }
        return result;
    }
}
