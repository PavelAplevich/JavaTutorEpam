package aggregation.and.composition.TaskFour;

class Client {
    private String name;
    private Deposit[] deposits;

    Client(String name){
        this.name = name;
    }

    void addDeposit(Deposit deposit){
        ClientLogic.addDeposit(this,deposit);
    }

    Deposit findDeposit(Deposit deposit){
        return ClientLogic.findDeposit(this,deposit);
    }// TODO: 10/26/19 Продолжить здесь! 



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
}
