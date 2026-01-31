package practice7.exceptions_task_solver;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Напишите программу, которая пытается открыть файл с именем "data.txt".
 * Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".
 * Используй класс FileReader из пакета java.io.
 * Метод new FileReader("data.txt") может выбросить проверяемое исключение FileNotFoundException.
 * Оберни этот вызов в блок try-catch.
 * В catch выведи сообщение о том, что файл не найден.
 */

public class Task1 {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("data.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Ошибка! " + e);
        }

    }

}
