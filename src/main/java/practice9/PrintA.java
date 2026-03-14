package practice9;

/**
 * Создайте два потока. Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.
 */

public class PrintA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
