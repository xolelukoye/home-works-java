package practice9;

public class PrintB extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Ошибка: " + e);
            }
        }
    }

}
