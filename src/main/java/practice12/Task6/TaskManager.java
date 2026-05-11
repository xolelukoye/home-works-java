package practice12.Task6;

import java.util.*;
import java.util.stream.Collectors;

/**
 * TaskService<T>: Сервис для управления задачами, включающий методы для добавления, удаления и поиска задач.
 * Управление задачами:
 * Добавление задачи: Метод для добавления новой задачи в список.
 * Удаление задачи: Метод для удаления задачи по ID. Метод должен быть синхронизирован для предотвращения конкурентного доступа.
 * Поиск задач: Методы для фильтрации задач по статусу и приоритету, а также сортировка задач по дате.
 * Обработка данных:
 * Использование Stream API для фильтрации и сортировки задач.
 * Лямбда-выражения для сортировки задач по дате.
 */

public class TaskManager<T> {

    private final Map<T, Task<T>> tasks = new HashMap<>();

    public void addTask(Task<T> task) {
        if (tasks.containsKey(task.getID())) {
            throw new IllegalArgumentException("Задача с таким ID уже есть");
        }
        tasks.put(task.getID(), task);
    }

    public synchronized void removeTask(T ID) {
        if (!tasks.containsKey(ID)) {
            throw new NoSuchElementException("Задача не найдена");
        }
        tasks.remove(ID);
    }

    public List<Task<T>> findByStatus(String STATUS) {
        return tasks.values().stream()
                .filter(t -> t.getSTATUS() == STATUS)
                .collect(Collectors.toList());
    }

    public List<Task<T>> findByPriority(int PRIORITY) {
        return tasks.values().stream()
                .filter(t -> t.getPRIORITY() == PRIORITY)
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortByDateAsc() {
        return tasks.values().stream()
                .sorted(Comparator.comparing(Task::getDATE))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortByDateDesc() {
        return tasks.values().stream()
                .sorted(Comparator.comparing((Task<T> t) -> t.getDATE()).reversed())
                .collect(Collectors.toList());
    }

}
