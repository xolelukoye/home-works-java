package practice5.task2;

public class Dog extends Pet implements Walkable{
    @Override
    public void eat() {
        System.out.println("Собака кушает сухой корм");
    }

    @Override
    public void walk() {
        System.out.println("Собака гуляет");
    }
}
