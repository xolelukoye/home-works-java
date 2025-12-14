package practice5.task1;

public class Elephant extends Animal {

    @Override
    void makeSound() {
        System.out.println("Трубит");
    }

    @Override
    void makeMove() {
        System.out.println("Ходит");
    }
}
