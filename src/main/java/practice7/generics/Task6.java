package practice7.generics;

/**
 * Объявите интерфейс как interface Container<T>
 * Объявите два метода:
 * void add(T item)
 * T get()
 * Создайте класс, реализующий этот интерфейс, и реализуйте в нём хранение одного элемента
 */

public class Task6<T> implements Container<T> {
    private T element;

    @Override
    public void add(T element) {
        this.element = element;
    }

    @Override
    public T get() {
        return element;
    }

    public static void main(String[] args) {
        Container<String> stringContainer = new Task6<>();
        stringContainer.add("Какая-то строка");
        System.out.println("Строка типа String: " + stringContainer.get());

        Container<Integer> integerContainer = new Task6<>();
        integerContainer.add(32);
        System.out.println("Число типа Integer: " + integerContainer.get());
    }
}
