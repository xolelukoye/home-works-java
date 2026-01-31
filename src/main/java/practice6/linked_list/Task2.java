package practice6.linked_list;
import java.util.LinkedList;
import java.util.ListIterator;

// Используйте ListIterator для прохода по LinkedList в обоих направлениях.

public class Task2 {
    public static void main(String[] args) {

        LinkedList<Integer> listOfNumbers = new LinkedList<>();

        for (int i = 0; i < 6; i++) {
            listOfNumbers.add(i +1);
        }

        System.out.println("Первоначальный список: " + listOfNumbers);

        ListIterator<Integer> iterator = listOfNumbers.listIterator();

        System.out.print("Проход туда: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.print("Проход обратно: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }

    }
}
