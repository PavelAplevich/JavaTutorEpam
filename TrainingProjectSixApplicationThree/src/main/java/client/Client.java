package client;

import output.Output;

import java.io.*;
import java.net.Socket;

public class Client {

    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            try {
                // адрес - локальный хост, порт - 4004, такой же как у сервера
                clientSocket = new Socket("localhost", 4004);
                reader = new BufferedReader(new InputStreamReader(System.in));
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                Output.printBlue("Вас приветствует Архив! Пожалуйста, авторизируйтесь..");
                run();
            } finally {
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    private static void run() throws IOException {
        authentication();
        String action = in.readLine();
        Output.printBlue(action); // Предоставление списка действий.
        chooseAction(action);
        String 
    }

    private static void chooseAction(String action) throws IOException {
        String choice = reader.readLine();
        out.write(choice);
        String serverAnswer = in.readLine();
        while(!serverAnswer.equals("ActionAccept")){
            Output.printRed("Некорректный ввод. Повторите выбор ещё раз.");
            Output.printBlue(action);
            choice = reader.readLine();
            out.write(choice);
            out.flush();
        }
        out .flush();
    }

    private static void authentication() throws IOException {
        Output.printBlue("Введите логин:");
        String login = reader.readLine();
        Output.printBlue("Введите пароль:");
        String password = reader.readLine();
        out.write(login);
        out.write(password);
        String serverAnswer = in.readLine();
        while(!serverAnswer.equals("LoginAccept")) {
            Output.printRed("Введен неправильный логин и/или пароль.");
            Output.printBlue("Введите логин:");
            login = reader.readLine();
            Output.printBlue("Введите пароль:");
            password = reader.readLine();
            out.write(login); // отправляем login
            out.write(password);// отправляем password
            out.flush();
            serverAnswer = in.readLine(); // ждём, что скажет сервер
        }
        Output.printGreen("Добро пожаловать, " + login);
        out.flush();
    }


}