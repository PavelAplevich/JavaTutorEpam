package aggregation.and.composition.TaskFive;

//Класс логики для базы путевок.
class VoucherLogic {

    //Реализация метода добавления путевки.
    static Voucher[] addVoucher(VoucherBase voucherBase, Voucher voucher){
        Voucher[] resultArray;
        if(voucherBase.getVouchers() == null){
            resultArray = new Voucher[1];
        } else{
            resultArray = new Voucher[(voucherBase.getVouchers().length) +1];
        }
        for(int i = 0; i < resultArray.length-1; i++){
            resultArray[i] = voucherBase.getVouchers()[i];
        }
        resultArray[resultArray.length-1] = voucher;
        return resultArray;
    }

    //Перегруженная реализация метода вывода путевок по параметрам.
    static void showVouchers(VoucherBase voucherBase, Transport transport){
        for(Voucher x: voucherBase.getVouchers()){
            if(x.getTransport() == transport){
                System.out.println(x.toString());
            }
        }
    }

    static void showVouchers(VoucherBase voucherBase, int countDay){
        for(Voucher x: voucherBase.getVouchers()){
            if(x.getDayCount() == countDay){
                System.out.println(x.toString());
            }
        }
    }

    static void showVouchers(VoucherBase voucherBase, Supply food){
        for(Voucher x: voucherBase.getVouchers()){
            if(x.getFood() == food){
                System.out.println(x.toString());
            }
        }
    }

    //Реализация метода выбора путевки.
    static Voucher chooseVoucher(VoucherBase voucherBase, String name){
        for(Voucher x: voucherBase.getVouchers()){
            if(x.getName().equals(name)){
                return x;
            }
        }
        throw new IllegalArgumentException("Voucher not found...");
    }

    //Метод сортировки базы путевок по возрастанию цены.
    static void sort(VoucherBase voucherBase){
        Voucher[] vouchers = voucherBase.getVouchers();
        for(int i = 0; i < vouchers.length-1; i++){
            if(vouchers[i].getPrice() > vouchers[i+1].getPrice()){
                Voucher buf = vouchers[i];
                vouchers[i] = vouchers[i+1];
                vouchers[i+1] = buf;
                i=0;
            }
        }
        voucherBase.setVouchers(vouchers);
    }

}
