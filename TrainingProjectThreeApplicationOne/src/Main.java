/*
Точка входа в приложение. Приложение выполняет считывание текста заданным способом. Затем пользователю
предлагается выбор действия над текстом и затем выводится результат.

    Исходное задание:
    Работа с регулярными выражениями(Pattern, Matcher).
    Задание №1.
    Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
    операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
    отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства - по
    алфавиту.
 */
public class Main {
    public static void main(String[] args) {
        new Output().stringOutLnCyan("Добро пожаловать!\n");
        run();
    }

    //Основной метод работы с приложением.
    public static void run(){
        //Выбираем способ ввода текста.
        int input = new Input().chooseInput();
        new Output().stringOutLnCyan("Вы выбрали ввод №" + input + "\n");
        String text = new Input().inputChoice(input);
        new Output().stringOutLnCyan("Ваш текст представлен ниже: \n");
        new Output().stringOutLn(text);
        //Выбираем действие над текстом.
        int action = new Input().chooseAction();
        new Output().stringOutLnCyan("Вы выбрали действие №" + action + ". Ваш результат ниже: \n");
        new Action().doAction(action, text);
        //Выбираем продолжить работу или нет.
        new Output().stringOutLnCyan("Вы хотите продолжить работу? да/нет");
        new Input().workContinue();
    }
}
