package simple.classes.and.objects.TaskEight;

import java.util.Arrays;

//Класс массива  Customer-ов.
public class CustomerArray{
    private Customer[] array;

    //Конструктор класса.
    CustomerArray(Customer[] array){
        this.array = array;
    }

    //Метод сортировки массива по алфавиту.
    void alphabetSort(){
        array = CustomerLogic.alphabetArray(this.array);
    }

    //Метод вывода клиентов, кредитки котороых попадают в заданный диапазон.
    void printCreditRange(long begin, long end){
        CustomerLogic.creditChoose(begin, end, this.array);
    }

    //toString для массива.
    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    //Набор геттеров и сеттеров.
    public Customer[] getArray() {
        return array;
    }

    public void setArray(Customer[] array) {
        this.array = array;
    }
}
