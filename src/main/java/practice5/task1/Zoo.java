package practice5.task1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Животное " + animal + " было добавлено в зоопарк");
    }

    public void makeASound() {
        this.animal.makeSound();
    }

    public void getMoving() {
        this.animal.makeMove();
    }

}
