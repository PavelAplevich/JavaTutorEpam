package one.dimensional.arrays;

public class TaskTen {
    public static void main(String[] args) {
        double[] array = new double[11];
        for (int i = 0; i<array.length;i++){
            array[i]=i;
        }
        double[] b = zipArray(array);
        for (double x: b){
            System.out.println(x);
        }
    }

    public static double[] zipArray(double[] a){
        for(int i = 2,j = 0; i <= (a.length/2+a.length%2); i++){
            a[i-1] = a[i+j];
            j++;
        }
        for (int i =(a.length/2+a.length%2); i < a.length; i++){
            a[i] = 0;
        }
        return a;
    }
}
