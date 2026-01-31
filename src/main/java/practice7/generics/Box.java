package practice7.generics;

/**
 * Разработайте дженерик класс Box, который может хранить объекты любого типа. Класс должен иметь методы для
 * установки и получения значения объекта, хранящегося внутри.
 * Определите класс с использованием дженерик типа <T>.
 * В классе Box реализуйте методы set(T item) и get(), которые позволяют устанавливать и получать объект типа T.
 * Для хранения объекта используйте переменную экземпляра типа T.
 */

// Напишите дженерик метод printArray, который принимает массив элементов любого типа и выводит каждый
// элемент массива на консоль.

public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    // проверка метода printArray
    public static void main(String[] args) {
        Integer[] numbers = {4, 5, 9, 66, 28};
        printArray(numbers);
    }
}
