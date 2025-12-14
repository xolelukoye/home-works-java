package practice5.task3;

public class HotDish extends Dish {
    private int temprature;

    public HotDish(int temprature) {
        this.temprature = temprature;
    }

    @Override
    void printDescription() {
        System.out.println("Температура блюда: " + this.temprature);
    }
}
