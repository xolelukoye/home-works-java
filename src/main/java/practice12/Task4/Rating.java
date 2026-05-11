package practice12.Task4;

public class Rating<T extends Number> {

    private T rating;

    public Rating(T rating) {
        this.rating = rating;
    }

    public T getRating() {
        return rating;
    }

    public double doubleValue() {
        return  rating.doubleValue();
    }
}
