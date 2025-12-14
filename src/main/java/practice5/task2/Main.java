package practice5.task2;

//2. Управление домашними питомцами
//Условие:
//В системе может быть один домашний питомец, у каждого вида свои особенности ухода.
//Примеры:
//Собака гуляет и ест сухой корм
//Кошка играет и ест влажный корм
//Нужно спроектировать систему, которая позволяет взаимодействовать с любым питомцем с учётом его особенностей.


public class Main {

    public static void main(String[] args) {
        Dog tusik = new Dog();
        Cat barsik = new Cat();

        PetSystem owner = new PetSystem();

        owner.addPet(tusik);
        owner.feedPet();
        owner.playAround();
        owner.takeAWalk();

        owner.addPet(barsik);
        owner.feedPet();
        owner.playAround();
        owner.takeAWalk();
    }

}
