package practice10;

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
 * Обычная строка: "Hello world" → countWords() → 2.
 * Строка с лишними пробелами: " Java is awesome " → countWords() → 3.
 *      corner case:
 * Пустая строка: "" → countWords() → 0.
 * Строка с пробелами: " " → countWords() → 0.
 *      negative case:
 * null строка: null → Должно выбрасываться IllegalArgumentException.
 */

public class CountWordsTest extends BaseTest{

    private static Stream<Arguments> validStrings() {
        return Stream.of(
                Arguments.of("Hello world", 2),
                Arguments.of(" Java is awesome ", 3), // БР
                Arguments.of("", 0),
                Arguments.of(" ", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("validStrings")
    @DisplayName("Проверка метода подсчета слов в строке:")
    public void userCanCountWordsInNormalString(String sentence, int expectedResult) {
        assertEquals(expectedResult, setOfMethods.countWords(sentence));
    }

    @Test
    @DisplayName("Проверка метода подсчета слов в строке null:")
    public void userCanNotCountWordsInEmptyString() {
        assertThrows(NullPointerException.class, () -> {
            setOfMethods.countWords(null);
        }, "При попытке посчитать слова в строке null возникает NullPointerException");
    }
}
