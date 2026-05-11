package practice12.Task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Corner cases:
 *      age:
 *   18, "Иван", "user@example.com" - нижняя граница возраста
 *   100, "Петр", "petr@mail.ru" - верхняя граница возраста
 *      email:
 *   30, "Анна", "anna.test+tag@sub.domain.co.uk" - сложный, но валидный
 * Negative cases:
 *      age:
 *   17, "Иван", "user@example.com"
 *   101, "Иван", "user@example.com"
 *      email:
 *   25, "Иван", "user@"
 *   25, "Иван", "@example.com"
 *   25, "Иван", "invalid"
 *   25, "Иван", "ivan@exam!ple.com" - недопустимые символы
 *      name:
 *   33, "", "user@example.com" - пустое
 *   56, null, "user@example.com" - null (БР - не было прописано в методе)
 *   88, "иван", "user@example.com" - с маленькой буквы
 */

public class UserValidatorTest {

    private UserValidator validator;

    @BeforeEach
    void createUserValidator() {
        validator = new UserValidator(true);
    }

    private User createValidUser() {
        return new User(21, "Алексей", "name_surname@email.com");
    }

    @Test
    @DisplayName("Пользователь с валидными данными")
    void validateValidUser() {
        User user = createValidUser();
        assertDoesNotThrow(() -> validator.validateUser(user));
    }

    @Test
    @DisplayName("Пользователь с валидными данными, но с выключенным флагом")
    void validateValidUserWhenValidatorDisabled() {
        validator.setValidationEnabled(false);
        User user = createValidUser();
        assertDoesNotThrow(() -> validator.validateUser(user));
    }

    @ParameterizedTest
    @DisplayName("Пользователь с невалидным email")
    @ValueSource(strings = {
            "invalid",
            "user@",
            "@example.com",
            "ivan@exam!ple.com"
    })
    void validateUserWithInvalidEmail(String invalidEmail) {
        User user = new User (25, "Иван", invalidEmail);
        assertThrows(InvalidUserException.class, () -> validator.validateUser(user));
    }

    static Stream<String> invalidNameValues() {
        return Stream.of("", null, "иван");
    }

    @ParameterizedTest
    @DisplayName("Пользователь с невалидным именем")
    @MethodSource("invalidNameValues")
    void validateUserWithInvalidName(String invalidName) {
        User user = new User (33, invalidName, "user@example.com");
        assertThrows(InvalidUserException.class, () -> validator.validateUser(user));
    }

    @ParameterizedTest
    @DisplayName("Пользователь с невалидным возрастом")
    @ValueSource(ints = {
            17, 101
    })
    void validateUserWithInvalidAge(int invalidAge) {
        User user = new User (invalidAge, "Иван", "user@example.com");
        assertThrows(InvalidUserException.class, () -> validator.validateUser(user));
    }

    @ParameterizedTest
    @DisplayName("Пользователь с валидными граничными значениями возраста")
    @ValueSource(ints = {
            18, 100
    })
    void validateUserWithCornerAge(int validAge) {
        User user = new User (validAge, "Иван", "user@example.com");
        assertDoesNotThrow(() -> validator.validateUser(user));
    }

    @Test
    @DisplayName("Поьзователь с валидным, но сложным email")
    void validateUserWithCornerEmail() {
        User user = new User(30, "Анна", "anna.test+tag@sub.domain.co.uk");
        assertDoesNotThrow(() -> validator.validateUser(user));
    }

}
