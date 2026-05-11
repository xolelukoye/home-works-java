package practice12.Task3;

/*
positive cases:
    валидная оценка - успешное добавление
    расчет среднего значения оценки по предмету
negative cases:
    отрицательная оценка
    null оценка
    расчет средней оценки для пустого списка
corner case:
    расчет среднего значения для одной оценки
доп.проверки:
    добавление null студента
    добавление null предмета
    добавление одной невалидной оценки в списке
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {

    private GradeService<Integer> gradeService;

    @BeforeEach
    void setUp() {
        gradeService = new GradeService<>();
    }

    private StudentGrade<Integer> createValidGrade() {
        return new StudentGrade<>("Анна", "математика", 5);
    }

    @Test
    @DisplayName("Успешное добавление валидной оценки")
    void addValidGradeSuccessfully() {
        StudentGrade<Integer> grade = createValidGrade();

        assertDoesNotThrow(() -> gradeService.addGrade(grade));
    }

    @Test
    @DisplayName("Расчет среднего значения для нескольких оценок по предмету")
    void calculateAverageValueMultipleGrades() {
        gradeService.addGrade(new StudentGrade<>("Ирина", "математика", 5));
        gradeService.addGrade(new StudentGrade<>("Ольга", "математика", 4));
        gradeService.addGrade(new StudentGrade<>("Андрей", "математика", 3));

        assertEquals(4.0, gradeService.calculatingAverageValue("математика"));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -5, -10, -100})
    @DisplayName("Добавление отрицательной оценки выбрасывает InvalidGradeException")
    void addNegativeGradeValue(int negativeGrade) {
        StudentGrade<Integer> grade = new StudentGrade<>("Иван", "математика", negativeGrade);

        assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(grade));
    }

    @Test
    @DisplayName("Добавление null оценки выбрасывает InvalidGradeException")
    void addNullGradeValue() {
        StudentGrade<Integer> grade = new StudentGrade<>("Иван", "математика", null);

        assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(grade));
    }

    @Test
    @DisplayName("Расчет среднего значения для пустого списка")
    void calculateAverageValueForEmptyList() {
        gradeService.addGrade(createValidGrade());

        double average = gradeService.calculatingAverageValue("философия");

        assertEquals(0.0, average);
    }

    @Test
    @DisplayName("Расчет среднего значения для единственной оценки")
    void calculateAverageValueForSingleGradeValue() {
        gradeService.addGrade(createValidGrade());

        assertEquals(5.0, gradeService.calculatingAverageValue("математика"));
    }

}
