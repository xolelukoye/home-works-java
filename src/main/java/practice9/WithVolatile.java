package practice9;

/**
 * Создайте поток, который бесконечно увеличивает счетчик. В основном потоке через 2 секунды
 * установите флаг stop = true, чтобы остановить поток.
 */

public class WithVolatile {

    private volatile boolean stop = false;
    private int counter = 0;

    public void stop() {
        stop = true;
    }

    public static void main(String[] args) {

        WithVolatile withVolatile = new WithVolatile();

        Thread thread = new Thread(() -> {
            while (!withVolatile.stop) {
                withVolatile.counter++;
                System.out.println("Значение счетчика: " + withVolatile.counter);
            }
            System.out.println("Рабочий поток завершен, итоговое значение счетчика: " + withVolatile.counter);
        });

        thread.start(); // запуск потока

        // команды для основного main потока
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка: " + e);
        }

        withVolatile.stop();
        System.out.println("Остановка в основном потоке");

    }

}
