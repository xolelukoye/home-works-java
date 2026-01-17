package practice6.linked_list;
import java.util.LinkedList;

//Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        for (int i = 1; i <= 8; i++) {
            list.add("Строка №" + i);
        }

        System.out.println(list);
        System.out.println("Первая строка списка: " + list.getFirst());
        System.out.println("Последняя строка списка: " + list.getLast());
    }
}
