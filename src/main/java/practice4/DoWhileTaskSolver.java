package practice4;

import java.util.Scanner;

public class DoWhileTaskSolver {

    static void main(String[] args) {

        // проверка запроса позитивного числа
        // positiveNumber();

        // проверка пароля
        // checkPassword();

        // проверка вывода чисел от 1 до 10 с помощью do while
        // printFrom1To10();

        // проверка ввода команды
        // completeCommand();

        // проверка метода подсчета количества цифр в числе
        // countingDigitsOfNumber();
    }

    // 1. Запрос положительного числа
    public static void positiveNumber() {

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {
            System.out.print("Введите положительное число: ");
            number = scanner.nextInt();
        } while (number <= 0);

        scanner.close();

    }

    // 2. Проверка пароля
    public static void checkPassword() {
         Scanner scanner = new Scanner(System.in);
         String password = "";

         do {
             System.out.print("Введите пароль: ");
             password = scanner.nextLine();
         } while (!password.equals("123"));
        System.out.println("Верный пароль!");
        scanner.close();
    }

    // 3. Вывод чисел от 1 до 10 с использованием do-while
    public static void printFrom1To10() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    // 4. Завершение программы по команде "exit"
    public static void completeCommand() {

        Scanner scanner = new Scanner(System.in);
        String command = "";

        do {
            System.out.print("Введите команду для завершения программы: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
        System.out.println("Программа завершена");
        scanner.close();

    }

    // 5. Подсчет количества цифр в числе
    public static void countingDigitsOfNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, в котором нужно посчитать количество цифр: ");
        int input_number = scanner.nextInt();
        int count = 0;
        int number = input_number;

        if (number == 0) {
            count = 1;
        } else {
            count = 0;
        }

        do {
            number = number / 10;
            count++;
        } while (number != 0);

        System.out.println("В числе " + input_number + " содержится " + count + " цифр(ы)");
        scanner.close();

    }
}
