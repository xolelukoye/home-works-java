package practice8.funcinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //2. Анонимный класс Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        runnable.run();

        //3.Predicate - четное число
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(8));

        //4.Создайте лямбду, которая принимает строку и возвращает её длину. Function
        Function<String, Integer> lineLength = x -> x.length();
        System.out.println("Символов в переданной строке: " + lineLength.apply("Длинная строка"));

        //5.Напишите лямбду, которая принимает строку и печатает её в консоль. Consumer
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Эта строка распечатана с помощью лямбды");
    }
}
