package practice12.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Разработайте систему валидации для модели данных пользователя, которая проверяет корректность имени, возраста и
 * электронной почты. Валидация должна управляться через глобальный флаг validationEnabled, который может быть включен
 * или выключен. Если данные не проходят валидацию, должно выбрасываться специализированное исключение InvalidUserException.
 * Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
 * Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
 * Проверка email: Email должен соответствовать стандартному формату электронной почты.
 * Управление валидацией: Валидация данных должна происходить только если флаг validationEnabled установлен в true.
 * Исключения: При обнаружении невалидных данных необходимо выбрасывать InvalidUserException.
 */

public class UserValidator {

    private boolean validationEnabled;

    public UserValidator(boolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }

    public void setValidationEnabled(boolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }

    void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidUserException("Ошибка! Имя не может быть пустым");
        }
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidUserException("Ошибка! Имя должно начинаться с большой буквы");
        } else {
            System.out.println("Валидация имени пользователя прошла успешно");
        }
    }

    void validateAge(int age) {
        if (age < 18) {
            throw new InvalidUserException("Ошибка! Возраст не должен быть менее 18 лет");
        }
        if (age > 100) {
            throw new InvalidUserException("Ошибка! Возраст не должен быть старше 100 лет");
        } else {
            System.out.println("Валидация возраста пользователя прошла успешно");
        }
    }

    void validateEmail(String email) {

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new InvalidUserException("Ошибка! Не валидная строка email");
        } else {
            System.out.println("Валидация email пользователя прошла успешно");
        }
    }

    public void validateUser(User user) {
        if (!validationEnabled) {
            System.out.println("Проверка не может быть выполнена, пока валидатор выключен");
            return;
        }
            validateName(user.getName());
            validateAge(user.getAge());
            validateEmail(user.getEmail());

    }



}
