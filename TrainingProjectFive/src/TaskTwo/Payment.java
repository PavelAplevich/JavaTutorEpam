package TaskTwo;

import java.util.Arrays;

//Основной класс оплаты.
class Payment {
    private Product[] products;

    //Создание оплаты массива продуктов.
    void createPayment(Product... products){
        this.products = products;
    }

    //Вывод оплаты в консоль.
    void printPayment(){
        System.out.print(Arrays.toString(products));
        System.out.println();
    }

    //Вывод общей стоимости.
    void totalPrice(){
        int sum = 0;
        for(Product x:products){
            sum += x.getPrice();
        }
        System.out.println("Total price: " + sum + "$");
    }

    //Вложенный класс продуктов.
    class Product{
        private String name;
        private int price;

        Product(String name, int price){
            this.name = name;
            this.price = price;
        }

        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        int getPrice() {
            return price;
        }

        void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " " + price + "$";
        }
    }
}
