package practice10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *      positive cases:
 * "hello" → "olleh"
 * "Java" → "avaJ"
 * "12345" → "54321"
 *      corner cases:
 * "" → ""
 * "a" → "a"
 * null → null
 */

public class ReverseTest extends BaseTest{

    private static Stream<Arguments> stringsForReverse() {
        return Stream.of(
                // positive cases:
                Arguments.of("hello", "olleh"),
                Arguments.of("Java", "avaJ"),
                Arguments.of("12345", "54321"),
                // corner cases:
                Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("stringsForReverse")
    @DisplayName("Проверка метода разворота строки:")
    public void userCanReverseString(String input, String expectedResult) {
        assertEquals(expectedResult, setOfMethods.reverse(input));
    }
}
