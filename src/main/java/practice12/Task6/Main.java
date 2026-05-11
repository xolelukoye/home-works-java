package practice12.Task6;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TaskManager<String> manager = new TaskManager<>();

        Task<String> t1 = new Task<>("1", "open", 1, LocalDate.of(2024, 1, 1));
        Task<String> t2 = new Task<>("2", "done", 2, LocalDate.of(2025, 1, 1));
        Task<String> t3 = new Task<>("3", "open", 3, LocalDate.of(2023, 5, 10));

        manager.addTask(t1);
        manager.addTask(t2);
        manager.addTask(t3);

        print(manager.sortByDateAsc());
    }

    private static void print(List<Task<String>> tasks) {
        for (Task<String> t : tasks) {
            System.out.println("ID=" + t.getID() + ", статус=" + t.getSTATUS() + ", приоритет=" + t.getPRIORITY() + ", дата=" + t.getDATE());
        }
    }

}
