package practice5.task7;

public class Carusel extends Attraction implements Serviceable {

    @Override
    public void service() {
        System.out.println("Проводится техническое обслуживание карусели");
    }

    @Override
    void info() {
        System.out.println("Спокойный аттракцион");
    }
}
