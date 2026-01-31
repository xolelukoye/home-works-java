package practice7.generics;

import java.util.HashMap;
import java.util.Map;

/**
 * Объявите метод как public static <K, V> void printMap(Map<K, V> map)
 * Используйте цикл for (Map.Entry<K, V> entry : map.entrySet())
 * Выводите каждый ключ и значение с помощью System.out.println()
 * В main() протестируйте с разными типами данных, например, Map<String, Integer>
 */

public class Task7 {

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        Map<String,Integer> studentScore = new HashMap<>();

        studentScore.put("Alex", 56);
        studentScore.put("Vladislav", 78);
        studentScore.put("Anastasia", 36);

        printMap(studentScore);
    }
}
