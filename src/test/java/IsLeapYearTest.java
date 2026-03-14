import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Обычные невисокосные годы: 2019, 2021, 2022 → false
 * Високосные годы: 2020, 2000, 1600 → true
 * Года, делящиеся на 100, но не на 400: 1900, 2100 → false
 * Граничные случаи: 0, 4, 400 → true
 */

public class IsLeapYearTest extends BaseTest{

    @ParameterizedTest
    @ValueSource(ints = {2019, 2021, 2022, 1900, 2100})
    @DisplayName("Проверка ввода пользователем невисокосного года:")
    public void userCanInputNotLeapYear(int year) {
        assertFalse(setOfMethods.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    @DisplayName("Проверка ввода пользователем високосного года:")
    public void userCanInputLeapYear(int year) {
        assertTrue(setOfMethods.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 4, 400})
    @DisplayName("Проверка ввода пользователем граничных значений високосного года:")
    public void userCanInputValidLeapYear(int year) {
        assertTrue(setOfMethods.isLeapYear(year));
    }
}
