package practice6.linked_hash_map;

// Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Используй LinkedHashMap<String, String> где ключ — имя, значение — номер телефона
 * Для добавления используй put(name, phone)
 * Для поиска используй containsKey(name) и get(name)
 * Имя можно передать в метод или считать с клавиатуры
 * Если контакт найден — выведи номер телефона, иначе сообщение "Контакт не найден"
 */

public class Task1 {

    public static void main(String[] args) {
        LinkedHashMap<String, String> contacts = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        contacts.put("Маша", "89325671586");
        contacts.put("Паша", "89325581586");
        contacts.put("Петя", "89329271586");
        contacts.put("Миша", "89325671142");
        contacts.put("Гриша", "89325771586");

        System.out.println("Все контакты: ");
        for (String n : contacts.keySet()) {
            System.out.println(n);
        }

        System.out.println("Введите имя искомого контакта: ");
        String name = scanner.nextLine();

        if (contacts.containsKey(name)) {
            String phone = contacts.get(name);
            System.out.println("Номер телефона контакта " + name + ": " + phone);
        } else {
            System.out.println("Контакт не был найден");
        }

        scanner.close();
    }
}
