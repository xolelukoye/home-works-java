package practice12.Task3;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Список List<StudentGrade<T>> для хранения оценок.
 * Метод для добавления оценки (addGrade), который также валидирует оценку на предмет того, что она не отрицательна.
 * Метод для расчёта среднего значения оценок по конкретному предмету.
 * Обработка исключений через InvalidGradeException, если оценка некорректна.
 */

public class GradeService<T extends Number> {

    private List<StudentGrade<T>> studentGrades = new CopyOnWriteArrayList<>();

    public void addGrade(StudentGrade<T> studentGrade) {
        if (studentGrade == null) {
            throw new InvalidGradeException("Ошибка! Оценка не может быть null");
        }

        T grade = studentGrade.getGrade();

        if (grade == null || grade.doubleValue() < 0) {
            throw new InvalidGradeException("Ошибка! Оценка не может быть меньше нуля");
        } else {
            studentGrades.add(studentGrade);
            System.out.println("Оценка " + grade + " была успешно добавлена");
        }
    }

    public double calculatingAverageValue(String subject) {
        double sum = 0;
        int count = 0;

        for (StudentGrade<T> sg : studentGrades) {
            if (sg.getSubject().equals(subject)) {
                sum += sg.getGrade().doubleValue();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        double average = sum / count;
        System.out.println("Средняя оценка по предмету " + subject + ": " + average);
        return average;
    }

}
