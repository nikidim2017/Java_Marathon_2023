package day13;

public class Task1 {
    public static void main(String[] args) {
        User user_1 = new User("Дмитрий");
        User user_2 = new User("Катя");
        User user_3 = new User("Юрий");

        user_1.sendMessage(user_2, "Привет, какие планы на вечер?");
        user_1.sendMessage(user_2, "Предлагаю куда-то выбраться");
        ;
        user_2.sendMessage(user_1, "Привет!");
        user_2.sendMessage(user_1, "Пока не знаю");
        user_2.sendMessage(user_1, "А ты что предлагаешь?");

        user_3.sendMessage(user_1, "Привет, звонила Катя, говорила, ты предложил пикник замутить?");
        user_3.sendMessage(user_1, "Во сколько собираемся и где?");
        user_3.sendMessage(user_1, "Со своей стороны, готов приготовить мясо");


        user_1.sendMessage(user_3, "Привет, да, верно. Давно не виделись, надо выбраться на природу");
        user_1.sendMessage(user_3, "Отлично, готовь мясо");
        user_1.sendMessage(user_3, "Тогда я принесу вино и овощи");

        user_3.sendMessage(user_1, "Договорились, до встречи!");


        user_1.isFriend(user_3);
        user_2.isFriend(user_3);
        MessageDatabase.showDialog(user_1, user_3);
    }
}
