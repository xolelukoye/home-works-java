package practice7.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Объявите класс NumberBox<T extends Number>
 * Внутри храните список чисел List<T>
 * В методе getSum() пройдитесь по списку и суммируйте значения, используя doubleValue()
 * Метод возвращает сумму в виде double
 */

public class NumberBox<T extends Number> {

    //шаблон объекта(списка) с неопределенным типом <Т>
    private List<T> numbers = new ArrayList<>();

    public double getSum() {
        double sum = 0.0;
        for (T number : numbers) {
            sum+= number.doubleValue();
        }
        return sum;
    }

    public void add(T number) {
        numbers.add(number);
    }

    public static void main(String[] args) {
        NumberBox<Integer> box = new NumberBox<>();

        box.add(8);
        box.add(12);
        box.add(32);
        box.add(41);
        box.add(1);

        System.out.println("Сумма всех чисел из списка: " + box.getSum());
    }
}