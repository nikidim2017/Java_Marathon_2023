package day13;

import java.util.*;

public class Message {

    private User sender;
    private User receiver;
    private Date date;
    private String text;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        Date date = new Date();     // Также, конструктор должен назначать полю date текущее время (то есть время создания объекта Message).
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "FROM: " + sender +
                ", TO: " + receiver +
                ", 'Текст сообщения'" + text + '\'' +
                ", ON: " + date +
                '}';
    }
}
