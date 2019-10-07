import java.util.Scanner;

public class JavaTutorOneLoopsOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        long result = 0;
        if (input <= 0){
            throw  new IllegalArgumentException("Incorrect number! : " + input);
        }
        for (int i=1; i <= input; i++){
            result += i;
        }
        System.out.println("Summary result = " + result);
    }
}
