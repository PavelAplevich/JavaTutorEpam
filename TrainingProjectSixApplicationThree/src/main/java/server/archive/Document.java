package server.archive;

public class Document {
    private int id;
    private String firstName;
    private String secondName;
    private String patronymic;
    private int age;
    private String characteristic;
    private int averageMark;
    private String otherMarks;

    public Document(int id, String firstName, String secondName, String patronymic, int age, String characteristic, int averageMark, String otherMarks) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.age = age;
        this.characteristic = characteristic;
        this.averageMark = averageMark;
        this.otherMarks = otherMarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public String getOtherMarks() {
        return otherMarks;
    }

    public void setOtherMarks(String otherMarks) {
        this.otherMarks = otherMarks;
    }

    @Override
    public String toString() {
        return "Document id: " + id +
                "\nFirstName: " + firstName +
                "\nSecondName: " + secondName +
                "\nPatronymic: " + patronymic +
                "\nAge: " + age +
                "\nCharacteristic: " + characteristic +
                "\nAverageMark: " + averageMark +
                "\nOtherMarks: " + otherMarks ;
    }
}
