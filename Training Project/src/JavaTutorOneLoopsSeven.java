import java.util.Scanner;

public class JavaTutorOneLoopsSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        if (begin <= 0){
            throw new IllegalArgumentException("Incorrect Begin number =" + begin);
        }
        int end = scanner.nextInt();
        if (end <= begin){
            throw new IllegalArgumentException("End number must be more Begin number =" + end);
        }
        for ( int i = begin; i <= end; i++){
            System.out.print("Делители числа " + i + " :  ");
            for (int x = i; x > 0; x--){
                if((i%x==0) && (x != 1) && (x != i)){
                    System.out.print(x + ", ");
                }
            }
            System.out.println();
        }
    }
}
