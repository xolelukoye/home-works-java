package practice12.Task3;

/**
 * Поля для имени студента, предмета и оценки.
 * Оценка должна быть типа T, который расширяет класс Number.
 * Конструктор для инициализации всех полей.
 * Геттеры для доступа к полям.
 */

public class StudentGrade<T extends Number> {

    private String studentName;
    private String subject;
    private T grade;

    public StudentGrade(String studentName, String subject, T grade) {
        this.grade = grade;
        this.studentName = studentName;
        this.subject = subject;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public T getGrade() {
        return grade;
    }
}
