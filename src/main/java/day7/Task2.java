package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();

        Player player_1 = new Player(rand.nextInt(11) + 90);
        Player player_2 = new Player(rand.nextInt(11) + 90);
        Player player_3 = new Player(rand.nextInt(11) + 90);
        Player player_4 = new Player(rand.nextInt(11) + 90);
        Player player_5 = new Player(rand.nextInt(11) + 90);
        Player player_6 = new Player(rand.nextInt(11) + 90);

        Player.info();

       // Player player_7 = new Player(rand.nextInt(11) + 90); - добавлен для проверки. Но при отработке метода run() на player_6, количество игороков не поле не уменьшается.
      //При "уходе с поля player_6 игрок player_7 становится 6-м и учитывается счетчиком. Это правильно?

        player_6.run();

        Player.info();


    }
}
