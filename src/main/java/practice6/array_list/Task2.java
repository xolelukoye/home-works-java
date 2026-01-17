package practice6.array_list;
import java.util.ArrayList;

// Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.

public class Task2 {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("Первая строка");
        strings.add("");
        strings.add("строка");
        strings.add("Четвертая строка");
        strings.add("Пятая строка");

        System.out.println(strings);

        String longest = "";
        for (String s : strings) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }

        System.out.println("Самая длинная строка: " + longest);

    }

}
