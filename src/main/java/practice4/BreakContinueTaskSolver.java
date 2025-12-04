package practice4;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BreakContinueTaskSolver {

    public static void main(String[] args) {

        // проверка метода суммирования чисел
        // sumOfDigits();

        // проверка метода пропуска чисел
        // skippingNumbersDivisibleBy3();

        // проверка метода вывода только положительных чисел
        // printPositiveNumbers();

        // проверка метода остановки программы с помощью ключевого слова stop
        // whileNotStop();

    }

    // 1. Сумма чисел от первого отрицательного
    public static void sumOfDigits() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Вводите числа, которые нужно сложить: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Ошибка! Вы ввели отрицательное число");
                break;
            }

            sum += number;
            System.out.println("Текущая сумма: " + sum);
        }

        System.out.println("Итоговая сумма: " + sum);
        scanner.close();

    }

    // 2. Пропуск чисел делящихся на 3
    public static void skippingNumbersDivisibleBy3() {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }

    }

    // 3. Вывод только положительных чисел
    public static void printPositiveNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите числа, чтобы отобрать положительные.");
        System.out.println("Если хотите завершить программу, введите 0");

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number < 0) {
                continue;
            }

            if (number == 0) {
                System.out.println("Программа успешно завершена!");
                break;
            }

            System.out.println("Число " + number + " является положительным!");

        }
        scanner.close();
    }

    // 4. Ввод строк до команды "stop"
    public static void whileNotStop() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите данные, которые хотите сохранить");
        System.out.println("Для завершения программы введите stop");

        while (true) {
            System.out.print("Введите данные: ");
            String data = scanner.nextLine();

            if (data.equals("stop")) {
                System.out.println("Программа успешно завершена.");
                break;
            }
        }
        scanner.close();
    }


}
