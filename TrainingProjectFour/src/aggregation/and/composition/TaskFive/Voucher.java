package aggregation.and.composition.TaskFive;

//Класс путевки.
class Voucher {
    private String name;
    private int dayCount;
    private Transport transport;
    private Supply food;
    private VoucherType type;
    private int price;

    //Конструктор подразумевает заполнение всей информации по путевке.
    public Voucher(String name, int dayCount, Transport transport, Supply food, VoucherType type, int price) {
        this.name = name;
        this.dayCount = dayCount;
        this.transport = transport;
        this.food = food;
        this.type = type;
        this.price = price;
    }

    //Набор геттеров и сеттеров.
    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Supply getFood() {
        return food;
    }

    public void setFood(Supply food) {
        this.food = food;
    }

    public VoucherType getType() {
        return type;
    }

    public void setType(VoucherType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //Переопределенный toString для удобного вывода информации.
    @Override
    public String toString() {
        return "Voucher: " + "\u001B[36m\u001B[41m" + name + "\u001B[0m\n" +
                "Type: " + "\u001B[44m" + type + "\u001B[0m\n" +
                "Transport: " + "\u001B[34m" + transport + "\u001B[0m\n" +
                "Day count: " + "\u001B[35m" + dayCount + "\u001B[0m\n" +
                "Supply type: " + "\u001B[31m" + food + "\u001B[0m\n" +
                "Price: " + "\u001B[46m" + price + "\u001B[0m";
    }
}
