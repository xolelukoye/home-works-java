package practice5.task8;

public class Manuscript extends Exhibit {
    public Manuscript() {
        super("Древний текст");
    }

    @Override
    void preserve() {
        System.out.println("Контролируемая влажность");
    }
}
