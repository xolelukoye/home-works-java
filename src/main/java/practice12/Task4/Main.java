package practice12.Task4;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MovieService movieService = new MovieService();

        Movie movie1 = new Movie("Бетховен", 2002);
        Movie movie2 = new Movie("Человек-паук", 2005);
        Movie movie3 = new Movie("Лангольеры", 1994);

        System.out.println("Добавление оценок для фильма " + movie1.toString() + " с использованием многопоточности:");

        Thread[] threads = new Thread[5];
        int[] ratings = {6, 8, 7, 9, 5};

        for (int i = 0; i < threads.length; i++) {
            final int ratingValue = ratings[i];
            final int threadNumber = i + 1;

            threads[i] = new Thread(() -> {
                System.out.println("Поток " + threadNumber + " добавляет оценку " + ratingValue);
                movieService.addRating(movie1, new Rating<>(ratingValue));
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        movieService.addRating(movie2, new Rating<>(5));
        movieService.addRating(movie2, new Rating<>(4));
        movieService.addRating(movie2, new Rating<>(3));

        movieService.addRating(movie3, new Rating<>(10));
        movieService.addRating(movie3, new Rating<>(8));
        movieService.addRating(movie3, new Rating<>(9));

        System.out.println(movie1.toString() + " средняя оценка: " + movieService.getAverageRating(movie1).getAsDouble());
        System.out.println(movie2.toString() + " средняя оценка: " + movieService.getAverageRating(movie2).getAsDouble());
        System.out.println(movie3.toString() + " средняя оценка: " + movieService.getAverageRating(movie3).getAsDouble());

        System.out.println("Сортировка фильмов по убыванию:");
        System.out.println(movieService.getMovieSortedByAverageRating());
    }
}
