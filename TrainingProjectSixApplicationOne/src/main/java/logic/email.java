package logic;

import catalog.Book;
import person.Person;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class email {

    public static void sendEmail(final Person person, Book book) {

        // Сюда необходимо подставить адрес получателя сообщения
        String to = "aplevich.pavel@gmail.com";
        String from = "pavel.aplevich@gmail.com";
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
        props.put("mail.debug", "true");
        // Авторизируемся.
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            // Указываем логин пароль, от почты, с которой будем отправлять сообщение.
            @Override
            //// TODO: 11/3/19 TYT!
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(person.getEmail(), "devilmickey28081992");
            }
        });

        try {
            // Создание объекта сообщения
            Message msg = new MimeMessage(session);

            // Установка атрибутов сообщения
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject("Test E-Mail through Java");
            msg.setSentDate(new Date());

            // Установка тела сообщения
            msg.setText("This is a test of sending a " +
                    "plain text e-mail through Java.\n" +
                    "Here is line 2.");

            // Отправка сообщения
            Transport.send(msg);
        }
        catch (MessagingException mex) {
            // Печать информации об исключении в случае его возникновения
            mex.printStackTrace();
        }
    }
}
