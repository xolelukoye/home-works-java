package practice10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *      Чётные числа:
 * Вход: 4 → Выход: true.
 * Число делится на 2 без остатка, значит, оно чётное.
 *      Нечётные числа:
 * Вход: 5 → Выход: false.
 * Число не делится на 2 без остатка, значит, оно нечётное.
 *      Нулевое значение:
 * Вход: 0 → Выход: true.
 * Ноль — чётное число, так как он делится на 2.
 *      Отрицательные числа:
 * Вход: -4 → Выход: true.
 * Отрицательное чётное число также делится на 2 без остатка, поэтому результат будет true.
 *      Вход: -3 → Выход: false.
 * Отрицательное нечётное число не делится на 2 без остатка, поэтому результат будет false.
 */

public class IsEvenTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({
            // positive cases
            "4, true",
            "5, false",
            "-4, true",
            "-3, false",
            // corner case
            "0, true"
    })
    @DisplayName("Проверка чётности числа:")
    public void userCanDivideByTwo(int number, boolean expectedResult) {
        assertEquals(expectedResult, setOfMethods.isEven(number));
    }

}
