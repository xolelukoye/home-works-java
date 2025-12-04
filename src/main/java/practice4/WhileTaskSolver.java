package practice4;
import java.util.Scanner;

public class WhileTaskSolver {

    public static void main(String[] args) {

        // проверка метода вычисления факториала
        // calculatingFactorial();

        // проверка метода вывода четных чисел
        // printEvenNumber();

        // проверка метода обратного счета
        // countDown();

    }

    // 1. Вычисление факториала с помощью while
    public static void calculatingFactorial() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, для которого хотите вычислить факториал: ");
        int number = scanner.nextInt();
        int i = 1;
        int result = 1;

        while (i <= number) {
            result = result * i;
            i++;
        }

        System.out.println("Факториал числа " + number + " равен: " + result);
        scanner.close();

    }

    // 2. Вывод всех четных чисел от заданного
    public static void printEvenNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }

    // 3. Обратный отсчет от введенного числа до 1
    public static void countDown() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
        scanner.close();
    }

}
