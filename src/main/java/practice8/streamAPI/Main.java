package practice8.streamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1. Принимает список строк и удаляет из него все строки длиной 5 символов и менее
        System.out.println("Удаляем из списка все строки длиной 5 символов и менее:");
        List<String> names = Arrays.asList("Александр", "Павел", "Наталья", "Ян", "Анна");
        names.stream().filter(name -> name.length() > 5).forEach(System.out::println);

        //2. Принимает список чисел и отбирает только те, которые делятся на 5 без остатка
        System.out.println("Делятся на 5 без остатка:");
        List<Integer> numbers = Arrays.asList(3, 5, 8, 10, 7, 14);
        numbers.stream().filter(number -> number % 5 == 0).forEach(System.out::println);


        //3. Принимает список строк и заменяет каждую строку на её длину
        System.out.println("Заменяет строку на ее длину:");
        List<String> fruits = Arrays.asList("Яблоко", "Персик", "Апельсин", "Банан");
        fruits.stream().map(fruit -> fruit.length()).forEach(System.out::println);


        //4. Принимает список чисел и преобразует его в новый список, где каждое число заменено на его квадрат
        System.out.println("Заменяем на новый список с теми же числами, но в квадрате:");
        List<Integer> square = Arrays.asList(9, 3, 2, 4);
        square.stream().map(s -> s * s).forEach(System.out::println);

        //5. Принимает список элементов и удаляет из него все дубликаты
        System.out.println("Удаляем все дубликаты:");
        List<Integer> noDuplicates = Arrays.asList(3, 3, 79, 9, 8, 14, 79, 2);
        noDuplicates.stream().distinct().forEach(System.out::println);

        //1. Принимает список чисел и находит в нём самое большое число
        System.out.println("Самое большое число из списка:");
        List<Integer> listOfNumbers = Arrays.asList(7, 18, 91, 3, 15);
        Optional<Integer> biggest = listOfNumbers.stream().reduce(Math::max);
        System.out.println(biggest.get());

        //2. Принимает список чисел и находит в нем наименьшее число
        System.out.println("Минимальное число из списка:");
        Optional<Integer> minimal = listOfNumbers.stream().reduce(Math::min);
        System.out.println(minimal.get());

        //3. Принимает список чисел и вычисляет их сумму
        System.out.println("Сумма чисел списка:");
        int sum = listOfNumbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        //4. Принимает список строк и находит первую строку, начинающуюся на букву "Б"
        System.out.println("Первая строка, начинающаяся на Б:");
        List<String> animals = Arrays.asList("Медеведь", "Волк", "Бобер", "Белка", "Сурок");
        Optional<String> startsWithB = animals.stream().filter(animal -> animal.startsWith("Б")).findFirst();
        System.out.println(startsWithB.get());

        //5. Проверяет, есть ли хотя бы один элемент в списке, который удовлетворяет заданному условию (например, является чётным числом)
        System.out.println("Хотя бы одно четное число из списка:");
        boolean isEven = listOfNumbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(isEven);

        //1. Принимает список строк и группирует их по первой букве
        System.out.println("Список городов, сгруппированный по первой букве:");
        List<String> cities = Arrays.asList("Москва", "Минск", "Лондон", "Казань", "Париж", "Пермь");
        Map<Character, List<String>> groupedByFirstChar = cities.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(groupedByFirstChar);

        //2. Принимает список чисел и группирует их на чётные и нечётные
        System.out.println("Списки чётных и нечётных:");
        Map<Boolean, List<Integer>> isEvenIsNot = listOfNumbers.stream().collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println(isEvenIsNot);

        //3. Принимает список чисел и находит их среднее значение
        System.out.println("Среднее значение из списка:");
        double average = listOfNumbers.stream().collect(Collectors.averagingInt(n -> n));
        System.out.println(average);
    }
}
