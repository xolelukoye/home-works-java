package practice6.linked_hash_set;
import java.util.LinkedHashSet;

// Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.

public class Task1 {

    public static void addUnique(LinkedHashSet<String> set, String element) {
        if (!set.contains(element)) {
            set.add(element);
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        addUnique(set, "Первый элемент");
        addUnique(set, "Первый элемент");
        addUnique(set, "Второй элемент");
        addUnique(set, "Третий элемент");
        addUnique(set, "Четвертый элемент");
        addUnique(set, "Четвертый элемент");
        addUnique(set, "Пятый элемент");

        System.out.println(set);
    }
}
