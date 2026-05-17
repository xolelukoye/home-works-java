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
        if (tasks.containsKey(task.getId())) {
            throw new IllegalArgumentException("Задача с таким ID уже есть");
        }
        tasks.put(task.getId(), task);
    }

    public synchronized void removeTask(T id) {
        if (!tasks.containsKey(id)) {
            throw new NoSuchElementException("Задача не найдена");
        }
        tasks.remove(id);
    }

    public List<Task<T>> findByStatus(String status) {
        return tasks.values().stream()
                .filter(t -> t.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public List<Task<T>> findByPriority(int priority) {
        return tasks.values().stream()
                .filter(t -> t.getPriority() == priority)
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortByDateAsc() {
        return tasks.values().stream()
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortByDateDesc() {
        return tasks.values().stream()
                .sorted(Comparator.comparing((Task<T> t) -> t.getDate()).reversed())
                .collect(Collectors.toList());
    }

}
