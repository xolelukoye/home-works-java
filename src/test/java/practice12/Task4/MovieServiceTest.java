package practice12.Task4;

// Протестируйте добавление рейтингов, расчёт средней оценки и сортировку фильмов. Проверьте, что оценки
// валидируются корректно и что фильмы правильно сортируются.

/*
positive cases:
    добавление валидной оценки Integer
    добавление валидной оценки Double
    добавление нескольких значений к одному фильму
    добавление значений к разным фильмам
    расчет средней оценки с несколькими значениями
    расчет средней оценки с несколькими значениями (разные типы Number)
    сортировка фильмов по средней оценке по убыванию
corner cases:
    добавление граничных значений рейтинга
    расчет средней оценки для фильма с одной оценкой
    сортировка фильмов по средней оценке, если все средние оценки равны
negative cases:
    добавление рейтинга вне диапазона
    расчет средней оценки для фильма без рейтингов
    расчет средней оценки для несуществующего фильма
    сортировка фильмов по средней оценке фильмов без рейтингов
    сортировка фильмов, когда у некоторых фильмов нет рейтингов
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {

    private MovieService movieService;
    private Movie bethoven;
    private Movie interstellar;
    private Movie titanic;

    @BeforeEach
    void setUp() {
        movieService = new MovieService();
        bethoven = new Movie("Бетховен", 2002);
        interstellar = new Movie("Интерстеллар", 2014);
        titanic = new Movie("Титаник", 1997);
    }

    @Test
    @DisplayName("Добавление валидной оценки Integer")
    void addValidRatingValueInteger() {
        Rating<Integer> rating = new Rating<>(7);
        movieService.addRating(bethoven, rating);

        OptionalDouble average = movieService.getAverageRating(bethoven);
        assertTrue(average.isPresent());
        assertEquals(7.0, average.getAsDouble());
    }

    @Test
    @DisplayName("Добавление валидной оценки Double")
    void addValidRatingValueDouble() {
        Rating<Double> rating = new Rating<>(7.5);
        movieService.addRating(bethoven, rating);

        OptionalDouble average = movieService.getAverageRating(bethoven);
        assertTrue(average.isPresent());
        assertEquals(7.5, average.getAsDouble());
    }

    @Test
    @DisplayName("Добавление нескольких значений к одному фильму")
    void addValidRatingsToOneMovie() {
        movieService.addRating(bethoven, new Rating<>(7));
        movieService.addRating(bethoven, new Rating<>(9));
        movieService.addRating(bethoven, new Rating<>(8));

        OptionalDouble average = movieService.getAverageRating(bethoven);
        assertTrue(average.isPresent());
        assertEquals(8.0, average.getAsDouble());
    }

    @Test
    @DisplayName("Добавление значений к разным фильмам")
    void addValidRatingsToDifferentMovies() {
        movieService.addRating(bethoven, new Rating<>(8));
        movieService.addRating(interstellar, new Rating<>(9));
        movieService.addRating(titanic, new Rating<>(7));

        OptionalDouble averageBethoven = movieService.getAverageRating(bethoven);
        OptionalDouble averageInterstellar = movieService.getAverageRating(interstellar);
        OptionalDouble averageTitanic = movieService.getAverageRating(titanic);

        assertTrue(averageBethoven.isPresent());
        assertTrue(averageInterstellar.isPresent());
        assertTrue(averageTitanic.isPresent());

        assertEquals(8.0, averageBethoven.getAsDouble());
        assertEquals(9.0, averageInterstellar.getAsDouble());
        assertEquals(7.0, averageTitanic.getAsDouble());
    }

    @Test
    @DisplayName("Расчет средней оценки для фильма с несколькими значениями")
    void calculateAverageRatingForMovieWithMultipleRatings() {
        movieService.addRating(bethoven, new Rating<>(7));
        movieService.addRating(bethoven, new Rating<>(8));
        movieService.addRating(bethoven, new Rating<>(9));
        movieService.addRating(bethoven, new Rating<>(10));

        OptionalDouble average = movieService.getAverageRating(bethoven);

        assertTrue(average.isPresent());
        // (7 + 8 + 9 + 10) / 4 = 34 / 4 = 8.5
        assertEquals(8.5, average.getAsDouble());
    }

    @Test
    @DisplayName("Расчет средней оценки для фильма с несколькими значениями (разные типы Number)")
    void calculateAverageRatingForMovieWithMultipleRatingsDifferentTypes() {
        movieService.addRating(bethoven, new Rating<>(7));
        movieService.addRating(bethoven, new Rating<>(8.5));

        OptionalDouble average = movieService.getAverageRating(bethoven);

        assertTrue(average.isPresent());
        assertEquals((7.0 + 8.5) / 2, average.getAsDouble(), 0.001);
    }

    @Test
    @DisplayName("Сортировка фильмов по средней оценке по убыванию")
    void sortMoviesByAverageRatingDescending() {
        movieService.addRating(bethoven, new Rating<>(7.0));
        movieService.addRating(bethoven, new Rating<>(8.0)); // 7.5

        movieService.addRating(interstellar, new Rating<>(9.5));
        movieService.addRating(interstellar, new Rating<>(8.5)); // 9.0

        movieService.addRating(titanic, new Rating<>(5.0));
        movieService.addRating(titanic, new Rating<>(6.0)); // 5.5

        List<Movie> sortedMovies = movieService.getMovieSortedByAverageRating();

        assertEquals(3, sortedMovies.size());
        assertEquals(interstellar, sortedMovies.get(0));
        assertEquals(bethoven, sortedMovies.get(1));
        assertEquals(titanic, sortedMovies.get(2));
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.0, 10.0})
    @DisplayName("Добавление граничных значений рейтинга")
    void addBoundaryRatingValues(double boundaryValue) {
        Rating<Double> rating = new Rating<>(boundaryValue);
        movieService.addRating(bethoven, rating);

        OptionalDouble average = movieService.getAverageRating(bethoven);
        assertTrue(average.isPresent());
        assertEquals(boundaryValue, average.getAsDouble());
    }

    @Test
    @DisplayName("Расчет средней оценки для фильма с одной оценкой")
    void calculateAverageRatingForMovieWithSingleRating() {
        movieService.addRating(interstellar, new Rating<>(9.3));

        OptionalDouble average = movieService.getAverageRating(interstellar);
        assertTrue(average.isPresent());
        assertEquals(9.3, average.getAsDouble());
    }

    @Test
    @DisplayName("Сортировка фильмов по средней оценке, если все средние оценки равны")
    void sortMovieWhenAllAverageRatingsAreEqual() {
        movieService.addRating(bethoven, new Rating<>(5));
        movieService.addRating(interstellar, new Rating<>(5));
        movieService.addRating(titanic, new Rating<>(5));

        List<Movie> sortedMovies = movieService.getMovieSortedByAverageRating();

        assertEquals(3, sortedMovies.size());
        assertTrue(sortedMovies.contains(bethoven));
        assertTrue(sortedMovies.contains(interstellar));
        assertTrue(sortedMovies.contains(titanic));
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.5, 0.0, -1.0, -5.0, 10.5, 15.0, 100.0})
    @DisplayName("Добавление рейтинга вне диапазона")
    void addRatingBelowRange(double invalidRating) {
        Rating<Double> rating = new Rating<>(invalidRating);

        assertThrows(IllegalArgumentException.class, () -> movieService.addRating(bethoven, rating));
    }

    @Test
    @DisplayName("Расчет средней оценки для фильма без рейтингов")
    void calculateAverageRatingForMovieWithoutRatings() {
        OptionalDouble average = movieService.getAverageRating(bethoven);

        assertFalse(average.isPresent());
    }

    @Test
    @DisplayName("Расчет средней оценки для несуществующего фильма")
    void calculateAverageRatingForNonExistentMovie() {
        Movie newMovie = new Movie("Новый фильм", 2008);

        OptionalDouble average = movieService.getAverageRating(newMovie);

        assertFalse(average.isPresent());
    }

    @Test
    @DisplayName("Сортировка фильмов по средней оценке фильмов без рейтингов")
    void sortMoviesWhenMoviesHaveNoRatings() {
        List<Movie> sortedMovies = movieService.getMovieSortedByAverageRating();

        assertTrue(sortedMovies.isEmpty());
    }

    @Test
    @DisplayName("Сортировка фильмов, когда у некоторых фильмов нет рейтингов")
    void sortMoviesWhenSomeMoviesHaveNoRatings() {
        movieService.addRating(bethoven, new Rating<>(9));
        movieService.addRating(interstellar, new Rating<>(5));

        List<Movie> sortedMovies = movieService.getMovieSortedByAverageRating();

        assertEquals(2, sortedMovies.size());
        assertEquals(bethoven, sortedMovies.get(0));
        assertEquals(interstellar, sortedMovies.get(1));
        assertFalse(sortedMovies.contains(titanic));
    }

}
