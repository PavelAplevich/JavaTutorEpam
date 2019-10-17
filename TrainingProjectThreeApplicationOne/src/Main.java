public class Main {
    public static void main(String[] args) {
        String text = Input.inputText();
        System.out.println("Ваш текс представлен ниже: \n");
        System.out.println(text);
        int action = Input.chooseAction();
        System.out.println("Вы выбрали действие №" + action + ". Ваш результат ниже: \n");
        Action.doAction(action, text);
    }
}
