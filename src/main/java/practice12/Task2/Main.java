package practice12.Task2;

public class Main {

    public static void main(String[] args) {
        User user1 = new User (21, "Алексей", "name_surname@email.com");
        UserValidator validator = new UserValidator(true);

        validator.validateUser(user1);
    }
}
