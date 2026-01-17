package practice6.hash_set;

// Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        System.out.println(numbers);

        System.out.print("Введите искомое число: ");
        int searchNumber = scanner.nextInt();

        boolean isFound = false;
        for (Integer i : numbers) {
            if (i == searchNumber) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Число " + searchNumber + " было найдено в коллекции");
        } else {
            System.out.println("Число " + searchNumber + " не было найдено в коллекции");
        }

        scanner.close();

    }
}
