package practice7.exceptions_task_solver;

import practice7.exceptions.NotTheAppropriateValueException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Напишите функцию, которая принимает строку в качестве аргумента и проверяет, является ли строка правильным
 * электронным адресом. Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
 * Создайте класс исключения, наследуемый от RuntimeException.
 * Используйте регулярные выражения (Pattern и Matcher из пакета java.util.regex) для проверки формата строки.
 * Используйте throw для генерации исключения при обнаружении невалидного адреса.
 */

public class Task4 {

    public static void isValidEmail(String email) throws NotTheAppropriateValueException {
        // регулярное выражение
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new NotTheAppropriateValueException("Ошибка! Не валидная строка.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш email: ");
        String email = scanner.nextLine();

        try {
            isValidEmail(email);
        }
        catch (NotTheAppropriateValueException e) {
            System.out.println("Введённый email не соответствует допустимому формату");
        }
    }

}
