package simple.classes.and.objects.TaskThree;

//Класс студента.
class Student{
    private String surname;
    private String initials;
    private int groupNumber;
    private int[] progress;

    //Набор сеттеров
    void setSurname(String surname) {
        this.surname = surname;
    }

    void setInitials(String initials) {
        this.initials = initials;
    }

    void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    void setProgress(int[] progress) {
        this.progress = progress;
    }

    void setAllData(String surname, String initials, int groupNumber, int[] progress){
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    //Набор геттеров
    String getSurname() {
        return surname;
    }

    String getInitials() {
        return initials;
    }

    int getGroupNumber() {
        return groupNumber;
    }

    int[] getProgress() {
        return progress;
    }

}
