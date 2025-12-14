package practice5.task4;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
        System.out.println("Морское существо было добавлено в аквариум");
    }

    public void demonstrationOfBehavior() {
        this.seaCreature.demonstrationOfBehavior();
    }
}
