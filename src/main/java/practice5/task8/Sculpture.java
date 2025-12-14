package practice5.task8;

public class Sculpture extends Exhibit {
    public Sculpture() {
        super("Скульптурный объект");
    }

    @Override
    void preserve() {
        System.out.println("Реставрация");
    }
}
