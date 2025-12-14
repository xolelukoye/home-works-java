package practice5.task3;

public class Drink extends Dish {
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    void printDescription() {
        System.out.println("Объем напитка: " + this.volume);
    }
}
