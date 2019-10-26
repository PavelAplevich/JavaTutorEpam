package aggregation.and.composition.TaskFour;

class ClientLogic {

    static void addDeposit(Client client, Deposit deposit){
        Deposit[] deposits = new Deposit[client.getDeposits().length + 1];
        for(int i = 0; i < deposits.length - 1; i++){
            deposits[i] = client.getDeposits()[i];
        }
        deposits[deposits.length-1] = deposit;
        client.setDeposits(deposits);
    }
}
