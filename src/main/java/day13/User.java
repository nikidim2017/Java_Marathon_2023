package day13;

import java.util.List;
import java.util.ArrayList;

public class User {

    private String name;
    private List<User> subscriptions;
    private Message message;

    public String getName() {
        return name;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public User(String name) {
        this.name = name;
        subscriptions = new ArrayList<>();
    }


    public void subscribe(User user) {
        getSubscriptions().add(user);
    }

    public boolean isSubscribed(User user) {
        return this.getSubscriptions().contains(user);

    }

    public boolean isFriend(User user) {
        if (this.isSubscribed(user) && user.isSubscribed(this)) {
            System.out.println("Пользователи " + this.getName() + " и " + user.getName() + " - друзья");
            return true;
        } else {
            System.out.println("Пользователи " + this.getName() + " и " + user.getName() + " - не друзья");
            return false;
        }
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
