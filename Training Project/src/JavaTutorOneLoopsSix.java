public class JavaTutorOneLoopsSix {
    public static void main(String[] args) {
        printASCII();
    }

    public static void printASCII(){
        for (int i = 0; i < 128; i++){
            LoopsTaskSix((char)(i));
        }
    }

    public static void LoopsTaskSix(char simbol){
        System.out.print(simbol + "   ");
        System.out.println((int)simbol);
    }
}
