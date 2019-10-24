package simple.classes.and.objects.TaskEight;

//Класс логики для класса Customer.
class CustomerLogic {

    //Метод передачи на вывод Customer-ов, кредитки которых входят в диапазон.
    static void creditChoose(long begin, long end, Customer[] array){
        for (Customer customer : array) {
            if (customer.getCreditCard() >= begin && customer.getCreditCard() <= end) {
                customer.printCustomer();
            }
        }
    }

    //Метод сортировки заданного массива по алфавиту.
    static Customer[] alphabetArray(Customer[] array){
        for(int i = 0; i < array.length-1; i++){
            if(isAlphabet(array[i+1], array[i])){
                Customer buf = array[i+1];
                array[i+1] = array[i];
                array[i] = buf;
                alphabetArray(array);
            }
        }
        return array;
    }

    //Перегруженный внутренний метод, для сортировки по алфавиту. Сначала пытается сортировать по фамилии,
    //затем по имени, затем по отчеству. Если имеется абсолютное совпадение, сортирует по ID.
    private static boolean isAlphabet(Customer firstCustomer, Customer secondCustomer){
        String first = firstCustomer.getSurname();
        String second = secondCustomer.getSurname();
        for(int i = 0; i < Math.min(first.length(), second.length()); i++){
            if((int)first.charAt(i) < (int)second.charAt(i)){
                return true;
            } else if((int)first.charAt(i) > (int)second.charAt(i)){
                return false;
            }else {
                continue;
            }
        }
        return isAlphabet(firstCustomer.getName(),secondCustomer.getName(), firstCustomer, secondCustomer);
    }

    private static boolean isAlphabet(String first, String second, Customer firstCustomer, Customer secondCustomer){
        for(int i = 0; i < Math.min(first.length(), second.length()); i++){
            if((int)first.charAt(i) < (int)second.charAt(i)){
                return true;
            } else if((int)first.charAt(i) > (int)second.charAt(i)){
                return false;
            }else {
                continue;
            }
        }
        return isAlphabet(firstCustomer.getPatronymic(), secondCustomer.getPatronymic(), firstCustomer.getId(), secondCustomer.getId());
    }

    private static boolean isAlphabet(String first, String second, int firstId, int secondId){
        for(int i = 0; i < Math.min(first.length(), second.length()); i++){
            if((int)first.charAt(i) < (int)second.charAt(i)){
                return true;
            } else if((int)first.charAt(i) > (int)second.charAt(i)){
                return false;
            }else {
                continue;
            }
        }
        return firstId < secondId;
    }
}
