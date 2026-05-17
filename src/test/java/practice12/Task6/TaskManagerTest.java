package practice12.Task6;

/*
Добавление задачи
удаление задачи
поиск по статусу
поиск по приоритету
сортировка по дате по возрастанию
сортировка по дате по убыванию
удаление несуществующей задачи
добавление задачи с одинаковым id
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

public class TaskManagerTest {

    private TaskManager<String> manager;
    private Task<String> task1;
    private Task<String> task2;

    @BeforeEach
    void setUp() {
        manager = new TaskManager<>();

        task1 = new Task<>("1", "open", 1, LocalDate.of(2025, 5, 5));
        task2 = new Task<>("2", "done", 2, LocalDate.of(2026, 5, 5));
    }

    @Test
    @DisplayName("Добавление задачи")
    void addTask() {
        manager.addTask(task1);

        List<Task<String>> list = manager.findByStatus("open");
        assertEquals(1, list.size());
    }

    @Test
    @DisplayName("Удаление задачи")
    void removeTask() {
        manager.addTask(task1);
        manager.removeTask("1");

        assertTrue(manager.findByStatus("open").isEmpty());
    }

    @Test
    @DisplayName("Поиск задачи по статусу")
    void findByStatus() {
        manager.addTask(task1);
        manager.addTask(task2);

        List<Task<String>> list = manager.findByStatus("open");

        assertEquals(1, list.size());
    }

    @Test
    @DisplayName("Поиск задачи по приоритету")
    void findByPriority() {
        manager.addTask(task1);
        manager.addTask(task2);

        List<Task<String>> list = manager.findByPriority(2);
        assertEquals(1, list.size());
    }

    @Test
    @DisplayName("Сортировка задач по дате (по возрастанию)")
    void sortByDateAsc() {
        manager.addTask(task1);
        manager.addTask(task2);

        List<Task<String>> list = manager.sortByDateAsc();

        assertEquals("1", list.get(0).getId());
    }

    @Test
    @DisplayName("Сортировка задач по дате (по убыванию)")
    void sortByDateDesc() {
        manager.addTask(task1);
        manager.addTask(task2);

        List<Task<String>> list = manager.sortByDateDesc();

        assertEquals("2", list.get(0).getId());
    }

    @Test
    @DisplayName("Удаление несуществующей задачи")
    void removeNonExistingTask() {
        assertThrows(NoSuchElementException.class, () -> {
            manager.removeTask("3");
        });
    }

    @Test
    @DisplayName("Нельзя добавить задачу с одинаковыми ID")
    void shouldNotAddDuplicateId() {
        manager.addTask(task1);

        assertThrows(IllegalArgumentException.class, () -> {
            manager.addTask(task1);
        });
    }


}
