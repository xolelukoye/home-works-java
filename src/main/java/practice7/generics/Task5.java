package practice7.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализуйте метод, который принимает List<T super Integer> и добавляет в него несколько чисел.
 * Объявите метод как public static void addNumbers(List<T super Integer> list)
 * Используйте метод add() для добавления целых чисел
 * Элементы можно безопасно добавлять, но при чтении потребуется приведение типа
 */

public class Task5 {

    public static void addNumbers(List<? super Integer> list) {
        list.add(5);
        list.add(15);
        list.add(35);
        list.add(56);
    }

    public static void main(String[] args) {

        //работает ограничение сверху, поэтому можно добавлять списки с типами Integer, Number, Object
        List<? super Integer> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println(numberList);

        //считывание элементов с приведением типа
        Number firstNumber = (Number) numberList.get(0);
        Number secondNumber = (Number) numberList.get(1);
        System.out.println("Первый элемент списка: " + firstNumber + ", второй элемент списка: " + secondNumber);
    }
}
