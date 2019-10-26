package aggregation.and.composition.TaskFive;

//Класс массива путевок.
class VoucherBase {
    private Voucher[] vouchers;

    //Метод добавления путевки в базу.
    void addVoucher(Voucher voucher){
        setVouchers(VoucherLogic.addVoucher(this,voucher));
        VoucherLogic.sort(this);
    }

    //Метод вывода путевок по типу транспорта.
    void showTransport(Transport transport){
        VoucherLogic.showVouchers(this, transport);
    }

    //Метод вывода путевок по количеству дней.
    void showDay(int countDay){
        VoucherLogic.showVouchers(this, countDay);
    }

    //Метод вывода путевок по типу питания.
    void showFood(Supply food){
        VoucherLogic.showVouchers(this, food);
    }

    //Метод выбора путевки.
    Voucher chooseVoucher(String name){
        return VoucherLogic.chooseVoucher(this, name);
    }

    //Набор геттеров и сеттеров.
    Voucher[] getVouchers() {
        return vouchers;
    }

    void setVouchers(Voucher[] vouchers) {
        this.vouchers = vouchers;
    }
}
