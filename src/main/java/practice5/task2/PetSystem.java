package practice5.task2;

public class PetSystem {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
    }

    public void feedPet() {
        this.pet.eat();
    }

    public void playAround() {
        if (this.pet instanceof Playable) {
            Playable playablePet = (Playable) this.pet;
            playablePet.play();
        } else {
            System.out.println("Это животное не может играть");
        }
    }

    public void takeAWalk() {
        if (this.pet instanceof Walkable) {
            Walkable walkablePet = (Walkable) this.pet;
            walkablePet.walk();
        } else {
            System.out.println("Это животное не может гулять");
        }
    }

}
