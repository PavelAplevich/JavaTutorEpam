package aggregation.and.composition.TaskFour;

//Класс содержащий логику работы с клиентом.
class ClientLogic {

    //Метод добавления счета клиенту. Реализация.
    static void addDeposit(Client client, Deposit deposit){
        Deposit[] deposits;
        if(client.getDeposits() == null){
            deposits = new Deposit[1];
        } else {
            deposits = new Deposit[(client.getDeposits().length) + 1];
        }
        for(int i = 0; i < deposits.length - 1; i++){
            deposits[i] = client.getDeposits()[i];
        }
        deposits[deposits.length-1] = deposit;
        client.setDeposits(deposits);
    }

    //Реализация метода поиска счета.
    static Deposit findDeposit(Client client, int depositId) throws IllegalAccessException {
        for(int i = 0; i < client.getDeposits().length;i++){
            if(depositId == client.getDeposits()[i].getId()){
                return client.getDeposits()[i];
            }
        }
        throw new IllegalAccessException("Deposit not found...");
    }

    //Реализация метода сортировки счетов по возрастанию баланса.
    static void sortDeposits(Client client){
        Deposit[] deposits = client.getDeposits();
        for(int i = 0; i < deposits.length-1; i++){
            if(deposits[i].getBalance() > deposits[i+1].getBalance()){
                Deposit buf = deposits[i];
                deposits[i] = deposits[i+1];
                deposits[i+1] = buf;
                i=0;
            }
        }
        client.setDeposits(deposits);
    }

    //Реализация метода поиска суммы балансов на всех счетах.
    static int depositsSum(Client client){
        int sum = 0;
        for(Deposit x:client.getDeposits()){
            sum += x.getBalance();
        }
        return sum;
    }

    //Реализация метода поиска суммы положительных/отрицательных балансов на всех счетах.
    static int depositsSum(Client client, boolean positive){
        int sum = 0;
        if(positive){
            for(Deposit x:client.getDeposits()){
                if((x.getBalance() > 0)){
                sum+=x.getBalance();
                }
            }
            return sum;
        } else {
            for(Deposit x:client.getDeposits()){
                if((x.getBalance() < 0)){
                    sum+=x.getBalance();
                }
            }
            return sum;
        }
    }
}
