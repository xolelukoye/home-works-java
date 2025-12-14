package practice5.task7;

public class RollerCoaster extends Attraction implements Serviceable {

    @Override
    public void service() {
        System.out.println("Проводится проверка безопасности американских горок");
    }

    @Override
    void info() {
        System.out.println("Острые ощущения");
    }
}
