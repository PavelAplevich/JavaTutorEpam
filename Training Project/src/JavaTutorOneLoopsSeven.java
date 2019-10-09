    /*
    Циклы.
    Задание №7.
    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.
    */
import java.util.Scanner;

public class JavaTutorOneLoopsSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        if (begin <= 0){                            //Блок условий, для проверки корректности ввода пользователя
            throw new IllegalArgumentException("Incorrect Begin number = " + begin);
        }
        if (end <= begin){
            throw new IllegalArgumentException("End number must be more Begin number = " + end);
        }
        resultingMetod(begin, end);
        }

    public static void resultingMetod(int begin, int end){        //Метод, выводящий результат
        for ( int i = begin; i <= end; i++){                      //Цикл перебора введенных чисел
            System.out.print("Делители числа " + i + " :  ");
            for (int x = i; x > 0; x--){                          //Цикл поиска делителей
                if((i%x==0) && (x != 1) && (x != i)){
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
}
