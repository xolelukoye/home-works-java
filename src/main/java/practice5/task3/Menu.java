package practice5.task3;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
        System.out.println("Блюдо было добавлено в меню");
    }

    public void printDescription() {
        this.dish.printDescription();
    }
}
