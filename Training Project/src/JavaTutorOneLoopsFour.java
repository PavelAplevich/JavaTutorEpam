import java.math.BigInteger;
    /*
    Циклы.
    Задание №4.
    Составить программу нахождения произведения квадратов первых двухсот чисел
    */

public class JavaTutorOneLoopsFour {
    public static void main(String[] args) {        //Точка входа с программой, выводящей результат
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= 200; i++){
            result = result.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(result);
    }
}
