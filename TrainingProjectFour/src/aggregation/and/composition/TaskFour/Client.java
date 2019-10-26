package aggregation.and.composition.TaskFour;

import java.util.Arrays;

//Класс клиента.
class Client {
    private String name;
    private Deposit[] deposits;

    //Конструктор, запрещаеющий анонимных клиентов.
    Client(String name){
        this.name = name;
    }

    //Метод добавления счета клиенту.
    void addDeposit(Deposit deposit){
        ClientLogic.addDeposit(this,deposit);
    }

    //Метод поиска счета.
    Deposit findDeposit(int depositId) throws IllegalAccessException {
        return ClientLogic.findDeposit(this, depositId);
    }

    //Метод сортирует массив счетов по возрастанию баланса.
    void sortDeposits(){
        ClientLogic.sortDeposits(this);
    }

    //Метод вычисления суммы балансов.
    int depositsSum(){
        return ClientLogic.depositsSum(this);
    }

    //Метод вычисления суммы позитивных балансов.
    int depositsSumPositive(){
        return ClientLogic.depositsSum(this, true);
    }

    //Метод вычисления суммы негативных балансов.
    int depositsSumNegative(){
        return ClientLogic.depositsSum(this, false);
    }

    //Наборы геттеров и сеттеров.
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Deposit[] getDeposits() {
        return deposits;
    }

    void setDeposits(Deposit[] deposits) {
        this.deposits = deposits;
    }

    //Переопределенный toString, для вывода удобной информации о клиенте.
    @Override
    public String toString() {
        return "Client: " + name + "\nClient deposits:\n" + Arrays.toString(deposits);
    }
}
