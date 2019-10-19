/*
    В этом пакете представлены решения заданий четвертой части, раздела "Простейшие классы и объекты". Каждое задание
    представлено отдельным классом с пояснениями в виде комментариев.
 */
package simple.classes.and.objects;

/*
    Простейшие классы и объекты.
    Задание №1.
    Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
    Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
    из этих двух переменных.
 */

public class TaskOne {
    public class Test1{
        private double numberOne = -1.2;
        private double numberTwo = 2.0;

        //Методы вывода на экран переменных.
        public void getNumberOne() {
            System.out.println(numberOne);;
        }

        public void getNumberTwo() {
            System.out.println(numberTwo);
        }

        //Метод находит сумму переменных.
        public double getSum(){
            return numberOne+numberTwo;
        }

        //Метод находит максимальную переменную.
        public double getMax(){
            return Math.max(numberOne,numberTwo);
        }

        //Набор сеттеров для переменных.
        public void setNumberOne(double numberOne) {
            this.numberOne = numberOne;
        }

        public void setNumberTwo(double numberTwo) {
            this.numberTwo = numberTwo;
        }
    }
}
