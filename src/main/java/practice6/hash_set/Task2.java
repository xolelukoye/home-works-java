package practice6.hash_set;

// Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {

    public static Set<String> removeDuplicates(List<String> input) {
        HashSet<String> set = new HashSet<>();
        set.addAll(input);
        return set;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("мишка");
        list.add("кошка");
        list.add("мишка");
        list.add("мышка");
        list.add("кошка");
        list.add("мошка");

        Set<String> uniqueSet = removeDuplicates(list);

        System.out.println("Первоначальный список: " + list);
        System.out.println("Множество без дубликатов: " + uniqueSet);
    }
}
