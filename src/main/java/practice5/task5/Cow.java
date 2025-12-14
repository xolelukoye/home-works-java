package practice5.task5;

public class Cow extends FarmAnimal implements Walkable {
    @Override
    void produce() {
        System.out.println("Корова дает молоко");
    }

    @Override
    public void walk() {
        System.out.println("Корова пасётся");
    }
}
