package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;

    private final int MIN_STAMINA = 0;

    public static int getCountPlayers() {
        return CountPlayers;
    }

    private static int CountPlayers;

    public Player(int stamina) {
        if (CountPlayers <= 6) {
            this.stamina = stamina;
            CountPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {

        for (int i = stamina; i > MIN_STAMINA; i--) {
            stamina--;
        }
        CountPlayers--;
    }

    public static void info() {
        int vacantPlaces = 6 - CountPlayers;
        String end;
        switch (vacantPlaces) {
            case 1:
                end = "свободное место";
                break;
            case 2:
            case 3:
            case 4:
                end = "свободных места";
                break;
            default:
                end = "свободных мест";
                break;
        }

        if (CountPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + vacantPlaces + " " + end);
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}