package practice12.Task3;

public class Main {

    public static void main(String[] args) {
        GradeService<Integer> gradeService = new GradeService<>();

        gradeService.addGrade(new StudentGrade<>("Василий", "мат.анализ", 5));
        gradeService.addGrade(new StudentGrade<>("Анна", "мат.анализ", 3));
        gradeService.addGrade(new StudentGrade<>("Ксения", "мат.анализ", 4));
        gradeService.addGrade(new StudentGrade<>("Алексей", "мат.анализ", 5));
        gradeService.addGrade(new StudentGrade<>("Григорий", "философия", 4));
        gradeService.addGrade(new StudentGrade<>("Игорь", "философия", 4));
        gradeService.addGrade(new StudentGrade<>("Антон", "философия", 2));

        gradeService.calculatingAverageValue("мат.анализ");
        gradeService.calculatingAverageValue("философия");
    }
}
