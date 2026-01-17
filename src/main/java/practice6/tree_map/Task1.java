package practice6.tree_map;

// Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.

import java.util.Map;
import java.util.TreeMap;

/**
 * Используй TreeMap<String, Integer>
 * Добавляй пары с помощью put(name, score)
 * TreeMap сортирует ключи по алфавиту
 * Для вывода используй цикл for (Map.Entry<String, Integer> entry : map.entrySet())
 * Убедись, что имена добавляются в случайном порядке, чтобы увидеть сортировку по ключу
 */

public class Task1 {

    public static void main(String[] args) {

        TreeMap<String, Integer> students = new TreeMap<>();

        students.put("Вася", 68);
        students.put("Таня", 98);
        students.put("Даня", 77);
        students.put("Маша", 56);
        students.put("Саша", 38);

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", балл: " + entry.getValue());
        }

    }
}
