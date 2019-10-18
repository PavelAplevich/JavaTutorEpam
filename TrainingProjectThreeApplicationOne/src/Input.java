import java.util.InputMismatchException;
import java.util.Scanner;

//Класс отвечает за обработку ввода
public class Input {

    //Публичный метод выдает приветственное сообщение и вызывает методы считывания
    public String inputText(){
        new Output().stringOutLn("Введите полный путь к вашему тексту. Спасибо!");
        return new MyReader().readText();
    }

    //Публичный метод для выбора действия над текстом. Выводит сообщения выбора и возвращает ввод пользователя.
    public int chooseAction(){
        new Output().stringOutLn("Введите номер действия, которое вы хотите произвести: " + "\n"
                        + "1. Отсортировать абзацы по количеству предложений. "
                        +"(Абзацы должны быть выделены символом табуляции" + "\n"
                        +"2. В каждом предложении отсортировать слова по длине." + '\n'
                        +"3. Отсортировать лексемы в предложении по убыванию количества вхождений "
                        +" заданного символа, а в случае равенства - по алфавиту.");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        try{
            choice = scanner.nextInt();
        }catch (InputMismatchException e){
            new Output().stringOutLn("Неккоректный ввод, попробуйте ещё раз. Спасибо!\n");
            return chooseAction();
        }
        if(incorrectInput(choice)){
            new Output().stringOutLn("Неккоректный ввод, попробуйте ещё раз. Спасибо!\n"); //Обработка неккоректного ввода
            return chooseAction();                                              //через рекурсию.
        } else {
        return choice;
        }
    }

    //Метод определяет желает ли пользователь продолжить работу с программой
    public void workContinue(){
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if(incorrectInput(choice)){
            new Output().stringOutLn("Неккоректный ввод. Пожалуйста повторите. Спасибо!");
            workContinue();
        } else if(choice.equals("да")){
            Main.run();
        }else{
            new Output().stringOutLn("Спасибо! До свидания!");
        }
    }

    //Метод проверки корректности ввода для выбора действия над текстом. Перегружен для выбора продолжения работы.
    private boolean incorrectInput(int choice){
        return choice != 1 && choice != 2 && choice != 3;
    }

    private boolean incorrectInput(String choice){
        return !(choice.equals("да") || choice.equals("нет"));
    }
}
