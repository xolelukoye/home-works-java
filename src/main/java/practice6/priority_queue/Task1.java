package practice6.priority_queue;

// Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Используй PriorityQueue<Integer>
 * Добавляй числа через add() или offer()
 * Элементы автоматически сортируются по возрастанию при извлечении
 * Используй poll() в цикле while (!queue.isEmpty()) для поочерёдного извлечения и вывода
 */

public class Task1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.add(8);
        queue.add(3);
        queue.add(45);
        queue.add(22);
        queue.add(93);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
