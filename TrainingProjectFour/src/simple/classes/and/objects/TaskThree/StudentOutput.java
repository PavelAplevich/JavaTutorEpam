package simple.classes.and.objects.TaskThree;

//Класс вывода информации по студентам.
public class StudentOutput {

    //Метод выводи фамилию студента, инициалы и группу.
    static void printStudent(Student student){
        System.out.println(student.getSurname() + " " +student.getInitials()
                + " - " + student.getGroupNumber() + " group" );
    }
}
