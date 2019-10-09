    /*
    Циклы.
    Задание №3.
    Найти сумму квадратов первых ста чисел
*/
public class JavaTutorOneLoopsThree {
    public static void main(String[] args) {       //Точка входа с программой подсчета и вывода суммы.
        int summary = 0;
        for(int i = 0; i <=100; i++){
            summary += i*i;
        }
        System.out.println(summary);
    }
}
