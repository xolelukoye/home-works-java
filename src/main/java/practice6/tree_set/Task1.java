package practice6.tree_set;

// Найдите ближайшее большее и меньшее число к заданному в TreeSet.

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Используй TreeSet<Integer>
 * Метод higher(value) возвращает наименьший элемент, строго больше заданного
 * Метод lower(value) возвращает наибольший элемент, строго меньше заданного
 * Выведи оба значения, если они не равны null
 * Пример: если в наборе {10, 20, 30, 40} и задано 25, то higher = 30, lower = 20
 */

public class Task1 {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set);

        System.out.println("Введите число: ");
        Integer setNumber = scanner.nextInt();

        scanner.close();

        Integer higher = set.higher(setNumber);
        Integer lower = set.lower(setNumber);

        if (higher != null) {
            System.out.println("Наибольшее от числа " + setNumber + " - " + higher);
        } else {
            System.out.println("Введенное значение является максимальным в данном множестве");
        }

        if (lower != null) {
            System.out.println("Наименьшее от числа " + setNumber + " - " + lower);
        } else {
            System.out.println("Введенное значение является минимальным в данном множестве");
        }
    }

}
