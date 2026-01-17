package practice6.hash_map;
import java.util.HashMap;

public class Task1 {

    // Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
    public static void printAllUnder18(HashMap<String, Integer> users) {
        System.out.println("Пользователи, не достигшие 18 лет: ");
        for (var entry : users.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " лет");
            }
        }
    }

    // Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
    public static void main(String[] args) {
        HashMap<String, Integer> users = new HashMap<>();

        users.put("Алёша", 22);
        users.put("Алёна", 22);
        users.put("Алеся", 12);
        users.put("Амира", 43);
        users.put("Александр", 15);

        System.out.println("Все юзеры: " + users);

        printAllUnder18(users);
    }

}
