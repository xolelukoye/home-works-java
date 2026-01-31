package practice7.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Напишите обобщённый метод, который принимает List<T extends Number> и вычисляет сумму элементов.
 * Метод должен выглядеть как public static void sum(List<T extends Number> list)
 * Используйте цикл for-each, чтобы получить доступ к элементам
 * Для каждого элемента вызывайте doubleValue() и прибавляйте к переменной суммы
 * Помните, что добавлять элементы в такой список нельзя
 */

public class Task4 {

    public static <T extends Number> double sum(List<T> list) {
        double summa = 0.0;
        for (T number : list) {
            summa+= number.doubleValue();
        }
        return summa;
    }

    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(5.8, 5.0, 6.8, 9.0, 5.6);
        System.out.println("Сумма чисел из списка: " + sum(doubleList));
    }
}
