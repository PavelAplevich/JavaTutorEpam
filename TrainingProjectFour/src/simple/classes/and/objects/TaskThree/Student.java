package simple.classes.and.objects.TaskThree;

//Класс студента.
public class Student{
    private String surname;
    private String initials;
    private int groupNumber;
    private int[] progress;

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

    public void setAllData(String surname, String initials, int groupNumber, int[] progress){
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
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
