package practice5.task7;

public class ParkOfAttractions {
    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Аттракцион был добавлен в парк");
    }

    public void printInfo() {
        this.attraction.info();
    }

    public void service() {
        this.attraction.service();
    }
}
