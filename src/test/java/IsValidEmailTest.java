import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Корректные email: "test@example.com", "user.name@domain.co", "a@b.cc" → true
 * Некорректные email: "bad@.com", "no-at-symbol", "@missing-user.com", "user@domain" → false
 * Пустая строка: "" → false
 * null: null → false
 */

public class IsValidEmailTest extends BaseTest{

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "user.name@domain.co", "a@b.cc"})
    @DisplayName("Проверка ввода корректного email:")
    public void userCanInputValidEmail(String email) {
        assertTrue(setOfMethods.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol", "@missing-user.com", "user@domain"})
    @DisplayName("Проверка ввода некорректного email:")
    public void userCanInputNotValidEmail(String email) {
        assertFalse(setOfMethods.isValidEmail(email));
    }

    private static Stream<String> notValidStrings() {
        return Stream.of("", null);
    }

    @ParameterizedTest
    @MethodSource("notValidStrings")
    @DisplayName("Проверка ввода пустой строки:")
    public void userCanNotInputEmptyStringForEmail(String email) {
        assertFalse(setOfMethods.isValidEmail(email));
    }
}
