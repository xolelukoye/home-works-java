import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Базовый случай: factorial(0) → 1
 * Обычные числа: factorial(1) → 1, factorial(5) → 120, factorial(7) → 5040
 * Отрицательные числа: factorial(-3) → Должно выбрасывать IllegalArgumentException.
 */

public class FactorialTest extends BaseTest {

    @Test
    public void userCanTakeFactorialOfZero() {
        assertEquals(1, setOfMethods.factorial(0));
    }

    @Test
    public void userCanTakeFactorialOfOne() {
        assertEquals(1, setOfMethods.factorial(1));
    }

    @Test
    public void userCanTakeFactorialOfFive() {
        assertEquals(120, setOfMethods.factorial(5));
    }

    @Test
    public void userCanTakeFactorialOfSeven() {
        assertEquals(5040, setOfMethods.factorial(7));
    }

    @Test
    public void userCanNotTakeFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            setOfMethods.factorial(-3);
        }, "Попытка взять факториал у отрицательного числа приводит к IllegalArgumentException");
    }
}
