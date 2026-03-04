package practice9;

public class Main {

    static void main(String[] args) {
        PrintA threadA = new PrintA();
        PrintB threadB = new PrintB();

        threadA.start();
        threadB.start();
    }
}
