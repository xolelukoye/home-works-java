package practice7.exceptions_task_solver;

import java.util.Scanner;

/**
 * Напишите метод, который принимает на вход два числа и выполняет их деление.
 * Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
 * Используйте ArithmeticException для обработки ошибки деления на ноль.
 * Конструкция try-catch будет необходима для перехвата и обработки исключения.
 */

public class Task2 {

    public static void division(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Результат деления a на b: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Ошибка! На ноль делить нельяза! " + e);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите число b: ");
        int secondNumber = scanner.nextInt();

        division(firstNumber, secondNumber);
        scanner.close();

    }

}
