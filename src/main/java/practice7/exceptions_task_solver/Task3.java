package practice7.exceptions_task_solver;
import practice7.exceptions.InvalidAgeValueException;
import java.util.Scanner;

/**
 * Разработайте метод, который проверяет валидность возраста пользователя. Если возраст меньше 0 или больше 150,
 * метод должен выбрасывать проверяемое исключение.
 * Создайте собственный класс исключения, наследуя его от класса Exception.
 * В методе используйте ключевое слово throw для генерации вашего исключения при неверных условиях.
 * Метод должен быть объявлен с ключевым словом throws.
 */

public class Task3 {

    public static void ageValidator(int age) throws InvalidAgeValueException{
        if (age < 0 || age > 150) {
            throw new InvalidAgeValueException("Ошибка! Значение возраста должно входить в диапазон от 0 до 150");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        try {
            ageValidator(age);
        }
        catch (InvalidAgeValueException e) {
            System.out.println("Указанный возраст не проходит по условиям программы.");
        }

        scanner.close();
    }

}
