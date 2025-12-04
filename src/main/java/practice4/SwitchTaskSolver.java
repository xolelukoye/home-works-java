package practice4;
import java.util.Scanner;

public class SwitchTaskSolver {

    public static void main(String[] args) {

        // проверка метода вывода дня недели
        // dayOfWeek();

        // проверка метода "стоимость билета по дню недели"
        // movieTicket();

        // проверка метода перевода оценки
        // convertScore();

        // проверка метода обработки текстовых команд
        // commandProcessing();

        // проверка калькулятора
        // calculate();

    }

    // 1. Вывод дня недели по номеру
    public static void dayOfWeek() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня: ");
        int day = scanner.nextInt();
        String dayOfWeek = "";

        switch (day) {
            case 1 -> dayOfWeek = "Понедельник";
            case 2 -> dayOfWeek = "Вторник";
            case 3 -> dayOfWeek = "Среда";
            case 4 -> dayOfWeek = "Четверг";
            case 5 -> dayOfWeek = "Пятница";
            case 6 -> dayOfWeek = "Суббота";
            case 7 -> dayOfWeek = "Воскресенье";
            default -> dayOfWeek = "Несуществующий";
        }

        System.out.println("День недели: " + dayOfWeek);
        scanner.close();

    }

    // 2. Стоимость билета по дню недели
    public static void movieTicket() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        int day = scanner.nextInt();
        String priceOfDay = "";
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                priceOfDay = "300 рублей";
                break;
            case 6:
            case 7:
                priceOfDay = "450 рублей";
                break;
            default: priceOfDay = "В этот день билетов нет";
        }

        System.out.println("Стоимость билета: " + priceOfDay);
        scanner.close();
    }

    // 3. Перевод числовых оценок в буквенные (A-F)
    public static void convertScore() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свою оценку в баллах (0-100): ");
        int score = scanner.nextInt();
        String scoreAF = "";

        if (score < 0 || score > 100) {
            System.out.println("Оценка должна быть в диапазоне от 0 до 100!");
        } else {
            switch (score / 10) {
                case 10, 9 -> scoreAF = "A";
                case 8 -> scoreAF = "B";
                case 7 -> scoreAF = "C";
                case 6 -> scoreAF = "D";
                default -> scoreAF = "F";
            }
            System.out.println("Ваша оценка: " + scoreAF);
        }
        scanner.close();

    }

    // 4. Обработка текстовых команд
    public static void commandProcessing() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String command = scanner.nextLine();
        String commandDescription = "";

        switch (command) {
            case "start" -> commandDescription = "Программа запущена";
            case "stop" -> commandDescription = "Программа остановлена";
            case "restart" -> commandDescription = "Программа перезапущена";
            default -> commandDescription = "Неизвестная команда";
        }

        System.out.println(commandDescription);
        scanner.close();

    }

    // 5. Простой калькулятор с использованием switch
    public static void calculate() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите оператор '/', '*', '+' или '-': ");
        String operator = scanner.nextLine();
        int result = 0;

        if (b == 0) {
            System.out.println("На ноль делить нельзя!");
        } else {
            switch (operator) {
                case "+" -> result = (a + b);
                case "-" -> result = (a - b);
                case "/" -> result = (a / b);
                case "*" -> result = (a * b);
                default -> {
                    System.out.println("Неверный оператор!");
                    return;
                }
            }
            System.out.println("Ответ: " + result);
        }
        scanner.close();
    }
}
