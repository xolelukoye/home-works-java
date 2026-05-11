package practice10;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Обычный массив: [3, 5, 7, 2] → findSecondMax() → 5
 * Массив с одинаковыми числами: [4, 4, 4, 4] → Должно выбрасываться NoSuchElementException.
 * Один элемент: [8] → Должно выбрасываться NoSuchElementException.
 * Пустой массив: [] → Должно выбрасываться NoSuchElementException.
 */

public class FindSecondMaxTest extends BaseTest{

    @Test
    public void userCanFindSecondMaxInNormalArray() {
        int [] numbers = {3, 5, 7, 2};
        assertEquals(5, setOfMethods.findSecondMax(numbers));
    }

    @Test
    public void userCanNotFindSecondMaxInArrayWithAllElementsEqual() {
        int [] numbers = {4, 4, 4, 4};
        assertThrows(NoSuchElementException.class, () -> {
            setOfMethods.findSecondMax(numbers);
        }, "При попытке найти второе максимальное значение в массиве из одинаковых значений выбрасывается " +
                "NoSuchElementException");
    }

    @Test
    public void userCanNotFindSecondMaxInArrayWithSingleElement() {
        int [] numbers = {8};
        assertThrows(IllegalArgumentException.class, () -> {
            setOfMethods.findSecondMax(numbers);
        }, "При попытке найти второе максимальное значение в массиве с одним значением выбрасывается " +
                "IllegalArgumentException");
    }

    @Test
    public void userCanNotFindSecondMaxInEmptyArray() {
        int [] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> {
            setOfMethods.findSecondMax(numbers);
        }, "При попытке найти второе максимальное значение в пустом массиве выбрасывается " +
                "IllegalArgumentException");
    }

}
