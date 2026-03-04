package practice9;

/**
 * Напишите программу, в которой создается отдельный поток, выводящий сообщение "Привет из потока!"
 * 5 раз с паузой в 1 секунду между сообщениями.
 */

public class HelloFromThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Привет из потока!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Ошибка: " + e);
            }
        }
    }

    public static void main(String[] args) {

        HelloFromThread thread = new HelloFromThread();
        thread.start();
    }
}
