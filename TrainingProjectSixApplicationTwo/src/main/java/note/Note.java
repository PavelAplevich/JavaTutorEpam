package note;

import java.time.LocalDate;

//Класс заметки с конструктором, набором сеттеров и геттеров и удобным toString.
public class Note {
    private String topic;
    private LocalDate date;
    private String message;
    private String email;

    public Note(String topic, LocalDate date,  String email, String message) {
        this.topic = topic;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Topic:" + topic + "\n" +
                "Date:\n" + date + "\n" +
                "E-mail:" + email + "\n" +
                "Message:" + message  ;
    }
}
