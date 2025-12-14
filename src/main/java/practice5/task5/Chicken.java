package practice5.task5;

public class Chicken extends FarmAnimal implements Eatable{
    @Override
    void produce() {
        System.out.println("Курица несёт яйца");
    }

    @Override
    public void eat() {
        System.out.println("Курица клюет зерно");
    }
}
