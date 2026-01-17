package practice6.array_list;
import java.util.ArrayList;

// Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.

public class Task1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(i + 1);
        }

        System.out.println(numbers);

        numbers.add(34);

        System.out.println(numbers);
    }

}
