package practice5.task4;

//4. Аквариум
//Условие:
//В аквариуме может находиться одно морское существо.
//В зависимости от существа, оно ведёт себя по-разному.
//Примеры:
//Акула плавает быстро и агрессивно
//Морская звезда медленно ползает
//Нужно спроектировать систему, в которой можно добавить существо и продемонстрировать его поведение.

public class Main {
    public static void main(String[] args) {

        Shark shark = new Shark();
        Aquarium bigAquarium = new Aquarium();

        bigAquarium.addSeaCreature(shark);
        bigAquarium.demonstrationOfBehavior();

        Aquarium smallAquarium = new Aquarium();
        SeaStar seaStar = new SeaStar();

        smallAquarium.addSeaCreature(seaStar);
        smallAquarium.demonstrationOfBehavior();


    }

}
