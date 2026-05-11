package practice10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
    Корректные номера:
 "+1 1234567890" → true.
 "+44 9876543210" → true.
 "+999 1111111111" → true.
    Некорректные номера:
 "12345" → false.
 "invalid" → false.
 "+1 abcdefghij" → false.
 "+1234 1234567890" (слишком длинный код страны) → false.
 "+1 123" (недостаточно цифр) → false.
 "" (пустая строка) → false.
    null номер:
 null → Должно выбрасываться IllegalArgumentException.
 */

public class IsValidPhoneNumberTest extends BaseTest{

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890", "+44 9876543210", "+999 1111111111"})
    @DisplayName("Проверка валидных номеров:")
    public void userCanInputValidPhoneNumber(String phone) {
        assertTrue(setOfMethods.isValidPhoneNumber(phone));
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345", "invalid", "+1 abcdefghij", "+1234 1234567890", "+1 123", ""})
    @DisplayName("Проверка невалидных номеров:")
    public void userCanInputNotValidPhoneNumber(String phone) {
        assertFalse(setOfMethods.isValidPhoneNumber(phone));
    }

    @Test
    @DisplayName("Проверка ошибки в методе:")
    public void userCanNotInputNullPhoneNumber() {
        assertThrows(NullPointerException.class, () -> {
            setOfMethods.isValidPhoneNumber(null);
        }, "При получении значения null в качестве номера телефона получаем NullPointerException");
    }
}
