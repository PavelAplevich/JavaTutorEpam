public class JavaTutorOneLoopsTwo {
    public static void main(String[] args) {
    }

    public static void LoopsTaskTwo (double a, double b, double h){
        for(double i = a; i <= b; i=i+h){
            if (i > 2){
                System.out.println("y = " + i);
            } else {
                System.out.println("y = " + (-i));
            }
        }
    }
}