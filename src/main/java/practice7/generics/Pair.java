package practice7.generics;

/**
 * Создайте класс Pair, который может хранить два объекта разных типов. Класс должен позволять получать и
 * устанавливать каждый из этих объектов.
 * Определите класс Pair с использованием двух дженерик типов <T, U>.
 * В классе Pair создайте две переменные экземпляра разных типов: T first и U second.
 * Реализуйте методы setFirst(T item), getFirst(), setSecond(U item) и getSecond() для работы с этими объектами.
 */

public class Pair<T, U> {
    private T first;
    private U second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
