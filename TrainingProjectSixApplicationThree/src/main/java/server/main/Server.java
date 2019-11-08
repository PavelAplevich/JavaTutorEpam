package server.main;

import org.xml.sax.SAXException;
import server.logic.ServerLogic;

import javax.xml.parsers.ParserConfigurationException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static Socket clientSocket; //сокет для общения
    private static ServerSocket server; // серверсокет
    private static DataInputStream in; // поток чтения из сокета
    private static DataOutputStream out; // поток записи в сокет

    public static void main(String[] args) throws ParserConfigurationException, SAXException {
            while(true){
                serverStart();
            }
    }

    private static void serverStart() throws ParserConfigurationException, SAXException {
        try {
            try {
                server = new ServerSocket(4004); // серверсокет прослушивает порт 4004
                clientSocket = server.accept();
                try {
                    ServerLogic.start(in,out,clientSocket);
                } finally {
                    clientSocket.close();
                }
            } finally {
                System.out.println("Сессия завершена.");
                server.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}