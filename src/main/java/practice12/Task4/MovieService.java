package practice12.Task4;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * Хранение оценок в Map<Movie, List<Rating>>.
 * Метод для добавления оценки к фильму. Метод должен быть потокобезопасным и валидировать оценку на допустимость
 * (например, оценка должна быть в пределах от 1 до 10).
 * Возможность расчета средней оценки для каждого фильма.
 * Использование Stream API для подсчёта средней оценки.
 * Использование Stream API и лямбда-выражений для сортировки фильмов по средней оценке.
 */

public class MovieService {

    private final Map<Movie, List<Rating<? extends Number>>> ratings;
    private final double minRating;
    private final double maxRating;

    public MovieService(double minRating, double maxRating) {
        this.maxRating = maxRating;
        this.minRating = minRating;
        this.ratings = new ConcurrentHashMap<>();
    }

    public MovieService() {
        this(1.0, 10.0);
    }

    private void validateRating(double value) {
        if (value < minRating || value > maxRating) {
            throw new IllegalArgumentException("Неверное значение рейтинга " + value);
        }
    }

    public synchronized void addRating(Movie movie, Rating<? extends Number> rating) {
        validateRating(rating.doubleValue());
        ratings.computeIfAbsent(movie, k -> new CopyOnWriteArrayList<>()).add(rating);
    }

    public OptionalDouble getAverageRating(Movie movie) {
        List<Rating<? extends Number>> movieRatings = ratings.get(movie);
        if (movieRatings == null || movieRatings.isEmpty()) {
            return OptionalDouble.empty();
        }

        return movieRatings.stream().mapToDouble(Rating::doubleValue).average();
    }

    public List<Movie> getMovieSortedByAverageRating() {
        return ratings.keySet().stream().sorted((m1, m2) -> {
            double avg1 = getAverageRating(m1).orElse(0.0);
            double avg2 = getAverageRating(m2).orElse(0.0);
            return Double.compare(avg2, avg1);
        }).collect(Collectors.toList());
    }
}
