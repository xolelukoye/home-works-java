package practice5.task5;

public class Farm {
    private FarmAnimal farmAnimal;

    public void addFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
        System.out.println("Животное было добавлено на ферму");
    }

    public void collectingProduce() {
        this.farmAnimal.produce();
    }

    public void feedFarmAnimal() {
        if (this.farmAnimal instanceof Eatable) {
            Eatable eatableFarmAnimal = (Eatable) this.farmAnimal;
            eatableFarmAnimal.eat();
        } else {
            System.out.println("Это животное не питается зерном");
        }
    }

    public void takeAWalk() {
        if (this.farmAnimal instanceof Walkable) {
            Walkable walkableFarmAnimal = (Walkable) this.farmAnimal;
            walkableFarmAnimal.walk();
        } else {
            System.out.println("Это животное не нуждается в выпасе");
        }
    }
}
