    /*
    Циклы.
    Задание №6.
    Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
    */
public class JavaTutorOneLoopsSix {
    public static void main(String[] args) {
        printASCII();
    }

    public static void printASCII(){        //Метод, задающий кол-во символов и выводящий результат
        for (int i = 0; i < 128; i++){
            print((char)(i));
        }
    }

    public static void print(char simbol){  //Подметод, выводящий результат
        System.out.print(simbol + "   ");
        System.out.println((int)simbol);
    }
}
