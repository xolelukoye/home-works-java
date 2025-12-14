package practice5.task1;

//1. Зоопарк
//Условие:
//В зоопарке есть одно животное, но оно может быть разным: птица или слон.
//Каждое животное издаёт уникальные звуки и передвигается по-своему.
//Например, слон трубит и ходит, а птица чирикает и летает.
//Нужно спроектировать систему, которая может работать с любым животным, добавлять его в зоопарк и демонстрировать его поведение.

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Bird raven = new Bird();
        Elephant elephant = new Elephant();

        zoo.addAnimal(raven);
        zoo.makeASound();
        zoo.getMoving();

        zoo.addAnimal(elephant);
        zoo.makeASound();
        zoo.getMoving();

    }
}
