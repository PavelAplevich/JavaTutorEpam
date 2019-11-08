package client;

import server.output.Output;

import java.io.*;
import java.net.Socket;

public class Client {

    private static Socket clientSocket;
    private static BufferedReader reader;
    private static DataInputStream in;
    private static DataOutputStream out;

    public static void main(String[] args) {
        try {
            try {
                Output.printBlue("Вас приветствует Архив! Пожалуйста, авторизируйтесь..");
                start();
            } finally {
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    private static void start() throws IOException {
        // адрес - локальный хост, порт - 4004, такой же как у сервера
        clientSocket = new Socket("localhost", 4004);
        reader = new BufferedReader(new InputStreamReader(System.in));
        in = new DataInputStream(clientSocket.getInputStream());
        out = new DataOutputStream(clientSocket.getOutputStream());
        authentication();
        Output.printPurple(in.readUTF()); //Получили список действий.
        chooseAction();
        doAction();
    }

    private static void doAction() throws IOException {
        Output.printRed(in.readUTF());
        out.writeUTF(reader.readLine());
        Output.printBlue(in.readUTF());
    }

    private static void authentication() throws IOException {
        Output.printBlue("Введите логин:");
        String login = reader.readLine();
        Output.printBlue("Введите пароль:");
        String password = reader.readLine();
        Output.printBlue("Спасибо!");
        out.writeUTF(login);
        out.writeUTF(password);
        String serverAnswer = in.readUTF();
        Output.print(in.readUTF());
        if(!serverAnswer.equals("LoginAccept")) {
            authentication();
        }
    }

    private static void chooseAction() throws IOException {
        String choice = reader.readLine();
        out.writeUTF(choice);
        String serverAnswer = in.readUTF();
        Output.print(in.readUTF());
        if(!serverAnswer.equals("ActionAccept")){
            chooseAction();
        }
    }


}