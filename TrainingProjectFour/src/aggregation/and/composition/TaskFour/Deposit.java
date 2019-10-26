package aggregation.and.composition.TaskFour;

//Класс реализующий счет в банке.
public class Deposit {
    private boolean blocked;
    private int id;
    private int balance;

    //Конструктор для создания счета.
    Deposit(int id){
        this.id = id;
    }

    //Набор сеттеров и геттеров.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    //Переопределенный toString для вывода удобной информации по счету.
    @Override
    public String toString() {
        String isBlocked = (isBlocked())?"\033[31mBlocked!\u001B[0m":"\033[32mReady to use\u001B[0m";
        String isBalance = (balance >= 0)?"\033[32m":"\033[31m";
        return "Deposit ID = " + "\u001B[35m" + id + "\u001B[0m\tDeposit status = " + isBlocked + "\tBalance = " + isBalance + balance + "\u001B[0m";
    }
}
