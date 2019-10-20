package simple.classes.and.objects.TaskThree;

/*
    Простейшие классы и объекты.
    Задание №3.
    Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость( массив из пяти
    элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров
    групп студентов, имеющих оценки, равные только 9 и 10.
 */

public class TaskThree {
    public class Student{
        private String surname;
        private String initials;
        private int groupNumber;
        private int[] progress;

        //Метод создания студента.
        public Student studentFactory(){
            return new Student();
        }

        //Метод создания массива заданного количества студентов.
        public Student[] arrayStudent(int count){
            Student[] arrayStudent = new Student[count];
            for(int i = 0; i < arrayStudent.length; i++){
                arrayStudent[i] = studentFactory();
            }
            return arrayStudent;
        }

        //Метод вывода студентов, имеющих средний балл с [9,10].
        public void printTopStudent(Student[] arrayStudent){
            for(int i = 0; i < arrayStudent.length; i++){
                if(arrayStudent[i].getAverageValueProgress(arrayStudent[i].getProgress()) >= 9){
                    System.out.println(arrayStudent[i].getInitials() + " - " + arrayStudent[i].getGroupNumber() );
                }
            }
        }

        //Метод получения среднего балла студента.
        public int getAverageValueProgress(int[] progress){
            int sum = 0;
            for(int i = 0; i < progress.length; i++){
                sum+=progress[i];
            }
            return (int)(sum/progress.length);
        }

        //Набор сеттеров
        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setInitials(String initials) {
            this.initials = initials;
        }

        public void setGroupNumber(int groupNumber) {
            this.groupNumber = groupNumber;
        }

        public void setProgress(int[] progress) {
            this.progress = progress;
        }

        //Набор геттеров
        public String getSurname() {
            return surname;
        }

        public String getInitials() {
            return initials;
        }

        public int getGroupNumber() {
            return groupNumber;
        }

        public int[] getProgress() {
            return progress;
        }

    }
}
