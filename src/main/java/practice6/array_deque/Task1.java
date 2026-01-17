package practice6.array_deque;

// Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.

import java.util.ArrayDeque;

/**
 * Используй addFirst() и addLast() для добавления в начало и конец
 * Извлекай элементы с помощью removeFirst() и removeLast()
 * Выводи результат после каждого извлечения, чтобы увидеть порядок
 * ArrayDeque отлично работает как двусторонняя очередь (deque)
 */

public class Task1 {

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < 4; i++) {
            deque.add(i);
        }
        System.out.println("Создали 4 элемента: " + deque);

        deque.addFirst(77);
        deque.addLast(38);
        System.out.println("Добавили в начало и конец: " + deque);

        deque.removeFirst();
        System.out.println("Удалили первый: " + deque);

        deque.removeLast();
        System.out.println("Удалили последний: " + deque);
    }
}
