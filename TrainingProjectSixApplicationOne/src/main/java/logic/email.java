package logic;

import book.Book;
import person.Person;
import write.and.read.MyReader;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

//Класс, реализующий отправку e-mail сообщений.
public class email {

    //Метод отправки сообщений на e-mail при добавлении книги в каталог.
    public static void sendEmail(final Person person, Book book) {
        String from = person.getEmail();
        // Сюда необходимо подставить SMTP сервер, используемый для отправки
        String host = "smtp.gmail.com";
        // Тут указываем порт SMTP сервера.
        int port = 465;
        // Создание свойств, получение сессии
        Properties props = new Properties();
        // При использовании статического метода Transport.send()
        // необходимо указать через какой хост будет передано сообщение
        props.put("mail.smtp.host", host);
        // Если почтовый сервер использует SSL
        props.put("mail.smtp.ssl.enable", "true");
        // Указываем порт SMTP сервера.
        props.put("mail.smtp.port", port);
        // Большинство SMTP серверов, используют авторизацию.
        props.put("mail.smtp.auth", "true");
        // Авторизируемся.
        Scanner scanner = new Scanner(System.in);
        Output.printOutBlue("Пожалуйста, введите пароль от своей почты, для рассылки оповещения:");
        final String password = scanner.nextLine();
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            // Указываем логин пароль, от почты, с которой будем отправлять сообщение.
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(person.getEmail(), password);
            }
        });
        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = Logic.createMailing(person);
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject("В каталог добавлена новая книга!");
            msg.setSentDate(new Date());
            msg.setText("В каталог добавлена книга.\n" + book.toString());
            Transport.send(msg);
            Output.printOutCyan("Сообщение успешно отправлено..");
        }
        catch (MessagingException | IOException mex) {
            mex.printStackTrace();
        }
    }

    //Метод, реализующий отправку сообщения администратору с запросом на добавление книги.
    public static void sendEmailtoAdmin(final Person person, Book book) throws IOException {
        // Сюда необходимо подставить адрес получателя сообщения
        String to = MyReader.findEmail("administrator");
        String from = person.getEmail();
        // Сюда необходимо подставить SMTP сервер, используемый для отправки
        String host = "smtp.gmail.com";
        // Тут указываем порт SMTP сервера.
        int port = 465;

        // Создание свойств, получение сессии
        Properties props = new Properties();

        // При использовании статического метода Transport.send()
        // необходимо указать через какой хост будет передано сообщение
        props.put("mail.smtp.host", host);
        // Если почтовый сервер использует SSL
        props.put("mail.smtp.ssl.enable", "true");
        // Указываем порт SMTP сервера.
        props.put("mail.smtp.port", port);
        // Большинство SMTP серверов, используют авторизацию.
        props.put("mail.smtp.auth", "true");
        // Включение debug-режима
//        props.put("mail.debug", "true");
        // Авторизируемся.
        Scanner scanner = new Scanner(System.in);
        Output.printOutBlue("Пожалуйста, введите пароль от своей почты, для рассылки оповещения:");
        final String password = scanner.nextLine();
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            // Указываем логин пароль, от почты, с которой будем отправлять сообщение.
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(person.getEmail(), password);
            }
        });

        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject("Добавьте в каталог мою книгу, пожалуйста!");
            msg.setSentDate(new Date());
            msg.setText("Я хотел(а) бы увидеть эту книгу в каталоге.\n" + book.toString());
            Transport.send(msg);
            Output.printOutCyan("Сообщение успешно отправлено..");
        }
        catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
