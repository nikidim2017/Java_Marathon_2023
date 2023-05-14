package day13;

import java.util.List;
import java.util.ArrayList;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();
    private static Message message;


    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
        u1.subscribe(u2);
    }


    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message i : messages) {
            if (i.getSender().equals(u1) && i.getReceiver().equals(u2)) {
                System.out.println(u1.getName() + ": " + i.getText());
            } else if (i.getSender().equals(u2) && i.getReceiver().equals(u1)) {
                System.out.println(u2.getName() + ": " + i.getText());
            }
        }
    }
}
