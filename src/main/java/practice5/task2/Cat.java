package practice5.task2;

public class Cat extends Pet implements Playable{
    @Override
    void eat() {
        System.out.println("Кот кушает влажный корм");
    }

    @Override
    public void play() {
        System.out.println("Кот играет");
    }
}
