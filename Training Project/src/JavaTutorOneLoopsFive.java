public class JavaTutorOneLoopsFive {
    public static void main(String[] args) {

    }

    public static double LoopsTaskFive(int n , double e){
        double result = 0;
        for (int i = 0; i <= n ; i++){
            double a = 1/Math.pow(2,i)+1/Math.pow(3,i);
            if (a >= e){
                result += a;
            }
        }
        return result;
    }
}
