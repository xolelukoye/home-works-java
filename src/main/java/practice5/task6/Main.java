package practice5.task6;

//6. Ботанический сад
//Условие:
//В ботаническом саду содержится одно растение.
//У разных растений — разные требования к уходу.
//Примеры:
//Орхидея — высокая влажность и тень
//Кактус — много света, редкий полив
//Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.

public class Main {
    public static void main(String[] args) {

        BotanicalGarden garden = new BotanicalGarden();
        Cactus aloe = new Cactus();

        garden.addPlant(aloe);
        garden.care();

        BotanicalGarden orchidGarden = new BotanicalGarden();
        Orchid orchid = new Orchid();

        orchidGarden.addPlant(orchid);
        orchidGarden.care();


    }
}
