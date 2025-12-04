package practice4;
import java.util.Scanner;

public class ForTaskSolver {

    public static void main(String[] args) {

        // проверка метода вывода чисел
        // printNumberDivisibleByThree();

        // проверка метода суммирования чисел от 1 до n
        // sumOfAllNumbers();

        // проверка таблицы умножения
        // multiplyForNumber();

        // проверка на простое число
        // checkPrimeNumber();

        // проверка метода вывода чисел от 1 до 10
        // outputFrom1To10();
    }

    // 1. Вывод чисел от 1 до 100, делящихся на 3
    public static void printNumberDivisibleByThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    // 2. Сумма чисел от 1 до n
    public static void sumOfAllNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма всех чисел от 1 до " + n + " равна: " + sum);
    }

    // 3. Таблица умножения для числа
    public static void multiplyForNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, для которого хотите получить таблицу умножения: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    // 4. Проверка на простое число
    public static void checkPrimeNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " является простым числом");
        } else {
            System.out.println(number + " не является простым числом");
        }
    }

    // 5. Вывод чисел от 1 до 10
    public static void outputFrom1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
