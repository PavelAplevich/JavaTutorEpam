package simple.classes.and.objects.TaskEight;

//Заданный класс с набором геттеров и сеттеров. Также переопределен toString и имеется метод вывода экземпляра класса.
class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long creditCard;
    private long bankAccount;

    //Метод вывода экземпляра класса.
    void printCustomer(){
        CustomerOutput.printCustomer(this);
    }

    //Метод создания массива Customer-ов.
    static Customer[] createArray(int count){
        Customer[] array = new Customer[count];
        for(int i = 0; i < count; i++){
            array[i] = new Customer();
        }
        return array;
    }

    //Переопределенный метод toString.
    @Override
    public String toString() {
        return ("ID = " + id +
                " Surname = " + surname +
                " Name = " + name +
                " Patronymic = " + patronymic +
                " Credit card = " + creditCard +
                " Bank account = " + bankAccount );
    }

    //Набор геттеров и сеттеров.
    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getPatronymic() {
        return patronymic;
    }

    void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    long getCreditCard() {
        return creditCard;
    }

    void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    long getBankAccount() {
        return bankAccount;
    }

    void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    void setAllData(int id, String surname, String name, String patronymic, long creditCard, int bankAccount){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }
}
