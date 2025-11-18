package practice3;

public class GameSettings {

    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String someGameName, int someCurrentPlayers) {
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    static int setMaxPlayers(int newMaxPlayers) {
        return GameSettings.maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        if (this.currentPlayers < GameSettings.maxPlayers) {
            this.currentPlayers++;
        } else {
            System.out.println("Максимальное кол-во игроков уже достигнуто: " + GameSettings.maxPlayers);
        }
    }

    void printGameStatus() {
        System.out.println("Игра: " + this.gameName);
        System.out.println("Сейчас играют: " + this.currentPlayers);
        System.out.println("Максимальное кол-во игроков: " + GameSettings.maxPlayers);
    }

}
