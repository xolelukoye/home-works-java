package practice5.task1;

public class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Кар-кар");
    }

    @Override
    void makeMove() {
        System.out.println("Летает");
    }
}
