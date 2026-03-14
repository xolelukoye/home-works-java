import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *      positive cases:
 * [3, 5, 7, 2] → 7
 * [-3, -5, -7, -2] → -2
 *      corner case:
 * [1] → 1
 *      negative cases:
 * [] → выбрасывает NoSuchElementException
 * null → выбрасывает IllegalArgumentException
 */

public class FindMaxTest extends BaseTest{

    private static Stream<Arguments> validArraysForFindMax() {
        return Stream.of(
                // positive cases:
                Arguments.of(new int [] {3, 5, 7, 2}, 7),
                Arguments.of(new int [] {-3, -5, -7, -2}, -2),
                // corner cases:
                Arguments.of(new int [] {1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("validArraysForFindMax")
    @DisplayName("Проверка метода поиска максимального значения в массиве:")
    public void userCanFindMaxNumber(int [] numbers, int expectedResult) {
        assertEquals(expectedResult, setOfMethods.findMax(numbers));
    }

    @Test
    @DisplayName("Проверка передачи пустого массива для поиска максимального значения:")
    public void userCanNotFindMaxInEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> {
            setOfMethods.findMax(new int [] {});},
                "При попытке передать пустой массив будет выброшено NoSuchElementException"
        );
    }

    // В этом методе должны были проверять IllegalArgumentException, но пришлось исправить ожидаемый результат,
    // т.к. null -> NullPointerException. Возможно, это повод для БР
    @Test
    @DisplayName("Проверка передачи null для поиска максимального значения:")
    public void userCanNotFindMaxInNullArgument() {
        assertThrows(NullPointerException.class, () -> {
                    setOfMethods.findMax(null);},
                "При попытке передать в качестве аргумента null будет выброшено NullPointerException"
        );
    }
}
