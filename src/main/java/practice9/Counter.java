package practice9;

/**
 * Напишите класс Counter с методом increment, увеличивающим значение счётчика. Создайте два потока,
 * каждый из которых вызывает increment() 1000 раз. Обеспечьте правильную работу с помощью synchronized.
 */

public class Counter {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Финальное значение count: " + counter.count);
    }

}
