package practice12.Task6;

// Класс Task<T> должен содержать уникальный идентификатор типа T, статус, приоритет и дату.
// Убедитесь, что все эти поля корректно инициализируются в конструкторе.

import java.time.LocalDate;

public class Task<T> {

    private final T id;
    private final String status;
    private final int priority;
    private final LocalDate date;

    public Task(T id, String status, int priority, LocalDate date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }
}
