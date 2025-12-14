package practice5.task6;

public class BotanicalGarden {
    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
        System.out.println("Растение было добавлено в сад");
    }

    public void care() {
        this.plant.care();
    }
}
