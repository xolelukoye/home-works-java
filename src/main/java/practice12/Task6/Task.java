package practice12.Task6;

// Класс Task<T> должен содержать уникальный идентификатор типа T, статус, приоритет и дату.
// Убедитесь, что все эти поля корректно инициализируются в конструкторе.

import java.time.LocalDate;

public class Task<T> {

    private final T ID;
    private final String STATUS;
    private final int PRIORITY;
    private final LocalDate DATE;

    public Task(T ID, String STATUS, int PRIORITY, LocalDate DATE) {
        this.ID = ID;
        this.STATUS = STATUS;
        this.PRIORITY = PRIORITY;
        this.DATE = DATE;
    }

    public T getID() {
        return ID;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public int getPRIORITY() {
        return PRIORITY;
    }

    public LocalDate getDATE() {
        return DATE;
    }
}
