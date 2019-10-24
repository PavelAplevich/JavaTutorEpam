package simple.classes.and.objects.TaskThree;

import static simple.classes.and.objects.TaskThree.StudentOutput.printStudent;

//Класс с действиями над студентом.
class StudentLogic {

    //Метод создания массива заданного количества студентов.
    static Student[] arrayStudent(int count){
        Student[] arrayStudent = new Student[count];
        for(int i = 0; i < arrayStudent.length; i++){
            arrayStudent[i] = new Student();
        }
        return arrayStudent;
    }

    //Метод вывода студентов, имеющих оценки 9 и 10.
    static void printTopStudent(Student[] arrayStudent){
        for(int i = 0; i < arrayStudent.length; i++){
            if(getTopValueProgress(arrayStudent[i].getProgress())){
                printStudent(arrayStudent[i]);
            }
        }
    }

    //Метод отвечает, все ли оценки студента 9 и 10.
    private static boolean getTopValueProgress(int[] progress){
        for(int i: progress){
            if(i < 9){
                return false;
            }
        }
        return true;
    }
}
