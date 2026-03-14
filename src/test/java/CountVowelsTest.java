import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *      positive cases:
 * "hello" → 2
 * "java" → 2
 * "AEIOU" → 5
 *      corner cases:
 * "" → 0
 * "bcdfg" → 0
 *      negative case:
 *  null → выброс IllegalArgumentException
 */

public class CountVowelsTest extends BaseTest{

    private static Stream<Arguments> stringForValidationPositiveCases() {
        return Stream.of(
                // positive cases:
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                // corner cases:
                Arguments.of("", 0),
                Arguments.of("bcdfg", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("stringForValidationPositiveCases")
    @DisplayName("Проверка метода подсчета гласных в строке:")
    public void userCanCountVowels(String input, int expectedResult) {
        assertEquals(expectedResult, setOfMethods.countVowels(input));
    }

    @Test
    @DisplayName("Проверка исключения при передаче значения null:")
    public void userCanNotCountNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            setOfMethods.countVowels(null);
        }, "При попытке подсчета гласных в строке null выбрасывается IllegalArgumentException");
    }
}
