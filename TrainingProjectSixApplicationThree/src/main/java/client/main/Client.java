package client.main;

import client.output.Output;
import java.io.*;
import java.net.Socket;

//Точка входа клиента.
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

    //Основной метод работы клиента.
    private static void start() throws IOException {
        // адрес - локальный хост, порт - 4004, такой же как у сервера
        clientSocket = new Socket("localhost", 4004);
        reader = new BufferedReader(new InputStreamReader(System.in));
        in = new DataInputStream(clientSocket.getInputStream());
        out = new DataOutputStream(clientSocket.getOutputStream());
        authentication();   //проходим аутентификацию.
        chooseAction();     //Выбор действия.
        doAction();         //Выполнение действия.
        resume();           //Продолжение работы или выход.
    }

    private static void resume() throws IOException {
        Output.printRed(in.readUTF());
        String choice = reader.readLine();
        while(choice.equals("Да")){
            out.writeUTF(choice);
            chooseAction();
            doAction();
            Output.printRed(in.readUTF());
            choice = reader.readLine();
        }
        out.writeUTF(choice);
        Output.printBlue(in.readUTF());
    }

    private static void doAction() throws IOException {
        Output.printRed(in.readUTF());
        out.writeUTF(reader.readLine());
        String message = in.readUTF();
        while(!message.equals("quit")){
            if(message.equals("input")){
                out.writeUTF(reader.readLine());
            } else {
                Output.printBlue(message);
            }
            message = in.readUTF();
        }
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
        Output.printPurple(in.readUTF());
        String choice = reader.readLine();
        out.writeUTF(choice);
        String serverAnswer = in.readUTF();
        Output.print(in.readUTF());
        if(!serverAnswer.equals("ActionAccept")){
            chooseAction();
        }
    }


}