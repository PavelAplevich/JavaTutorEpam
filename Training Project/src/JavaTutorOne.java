/*
    В этом классе представлены решения линейного раздела и раздела ветвлений в виде методов.
    Раздел циклов представлен в классах JavaTutorOneLoops ... .java
 */


public class JavaTutorOne {
    public static void main(String[] args) {
    }


    public static double LinearTaskOne (double a, double b, double c){
        return  (a-3)*b/2+c;
    }

    public static double LinearTaskTwo (double a, double b, double c){
        double numerator = b + Math.sqrt(Math.pow(b,2)+4*a*c);
        double denominator = 2*a;
        return numerator/denominator - Math.pow(a,3)*c+Math.pow(b,-2);
    }

    public static double LinearTaskTree (double x, double y){
        return (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
    }

    public static double LinearTaskFour(double R){
        int x = (int)R;
        double y = ((R-x)*1000);
        return y + x/1000d;
    }

    public static void LinearTaskFive(int T){
            int hour = T / 3600;
            int minute = (T - hour * 3600) / 60;
            int second = T - hour * 3600 - minute * 60;
            System.out.printf("%02dч %02dмин %02dс.", hour, minute, second);
    }

    public static void LinearTaskSix(double x, double y){
        boolean a = ((x >= -2) && (x <= 2)) && ((y >= -3) && (y <= 4));
        boolean b = ((x >= -4) && (x <= 4)) && ((y >= -3) && (y <= 0));
        System.out.println(a||b);
    }

    public static void BranchTaskOne(double a, double b){
        double c = 180-(a+b);
        if (c > 0){
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("This is rectangular triangle");
            } else {
                System.out.println("This is non-rectangular triangle");
            }
        } else {
            System.out.println("This is not triangle");
        }
    }

    public static double BranchTaskTwo(double a, double b, double c, double d){
        return Math.max(Math.min(a,b), Math.min(c,d));
    }

    public static boolean BranchTaskThree(double x1, double y1, double x2, double y2, double x3, double y3){
        return (x1-x3)/(x2-x3) == (y1-y3)/(y2-y3);
    }

    public static boolean BranchTaskFour(double x, double y, double z, double A, double B){
        double length = Math.max(Math.max(x,y),z);
        boolean result;
        if (x == length){
            result = (y < A && z < B) || (y < B && z < A);
        } else if (y == length){
            result = (x < A && z < B) || (x < B && z < A);
        } else {
            result = (x < A && y < B) || (x < B && y < A);
        }
        return result;
    }

    public static double BranchTaskFive(double x){
        if(x<=3) {
            return (x * (x - 3) + 9);
        } else {
            return 1/(Math.pow(x,3)+6);
        }
    }

}
