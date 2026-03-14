package practice10;

import java.util.Arrays;

public class SetOfMethods {

    // 1. Проверка чётности числа
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 2. Подсчёт количества гласных в строке
    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }

    // 3. Разворот строки
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    // 4. Поиск максимального числа в массиве
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }

    // 5. Проверка, является ли год високосным
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 6. Проверка валидности email
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    // 7. Факториал числа
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    // 8. Поиск второго максимального числа в массиве
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }

    // 9. Подсчёт количества слов в строке
    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }

    // 10. Проверка валидности номера телефона
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }


}
