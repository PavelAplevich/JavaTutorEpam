package simple.classes.and.objects;

/*
    Простейшие классы и объекты.
    Задание №2.
    Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
    инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */

public class TaskTwo {
    public class Test2{
        private double  numberOne = 1;
        private double  numberTwo = 2.1;

        //Набор конструкторов.
        public Test2(){
        }

        public Test2(double numberOne, double numberTwo) {
            this.numberOne = numberOne;
            this.numberTwo = numberTwo;
        }

        //Набор геттеров.
        public double getNumberOne() {
            return numberOne;
        }

        public double getNumberTwo() {
            return numberTwo;
        }

        //Набор сеттеров.
        public void setNumberOne(double numberOne) {
            this.numberOne = numberOne;
        }

        public void setNumberTwo(double numberTwo) {
            this.numberTwo = numberTwo;
        }
    }
}
