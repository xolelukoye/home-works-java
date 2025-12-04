package practice4;
import java.util.Scanner;

public class IfElseTaskSolver {

    public static void main(String[] args) {

        // проверка метода определения знака числа
        // checkNumber();

        // проверка поиска наибольшего из двух чисел
        // findMax();

        // проверка метода вывода текстового описания оценки
        // printEstimation();

        // проверка на четность
        // checkParity();

        // проверка метода определения размера скидки по возрасту
        // checkDiscount();

        // проверка метода оценки результата теста
        // evaluateTestResult();
    }

    // 1. Определение знака числа
    public static void checkNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число: ");
        int number = scanner.nextInt();
        String checkNumber = "";
        if (number > 0) {
            checkNumber = "Число положительное";
        }
        if (number < 0) {
            checkNumber = "Число отрицательное";
        }
        if (number == 0) {
            checkNumber = "Число равно нулю";
        }
        System.out.println(checkNumber);
        scanner.close();

    }

    // 2. Поиск наибольшего из двух чисел
    public static void findMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введи второе число: ");
        int b = scanner.nextInt();
        int max;
        if (a > b) {
            max = a;
            System.out.println("Наибольшее число: " + max);
        }
        else if (b > a) {
            max = b;
            System.out.println("Наибольшее число: " + max);
        }
        else {
            System.out.println("Числа равны");
        }
        scanner.close();
    }

    // 3. Вывод оценки по шкале 1-5
    public static void printEstimation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 5: ");
        int number = scanner.nextInt();
        String estimation = "";
        if (number == 5) {
            estimation = "Отлично";
            System.out.println("Оценка: " + estimation);
        }
        else if (number == 4) {
            estimation = "Хорошо";
            System.out.println("Оценка: " + estimation);
        }
        else if (number == 3) {
            estimation = "Удовлетворительно";
            System.out.println("Оценка: " + estimation);
        }
        else if (number == 2 || number == 1) {
            estimation = "Неудовлетворительно";
            System.out.println("Оценка: " + estimation);
        }
        else {
            System.out.println("Неверное значение");
        }
        scanner.close();

    }

    // 4. Проверка на четность
    public static void checkParity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число и мы проверим, четное ли оно: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число " + number + " является четным");
        }
        else {
            System.out.println("Число " + number + " - нечетное");
        }
        scanner.close();
    }

    // 5. Определение размера скидки по возрасту
    public static void checkDiscount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи свой возраст, по нему будет определен размер скидки: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Размер скидки составляет: 25%");
        }
        if (age >= 65) {
            System.out.println("Размер скидки составляет: 30%");
        }
        else {
            System.out.println("Для данного возраста скидка не предусмотрена");
        }
        scanner.close();
    }

    // 6. Оценка результата теста по баллам
    public static void evaluateTestResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи балл: ");
        int point = scanner.nextInt();
        String testResult = "";
        if (point >= 90) {
            testResult = "Отлично";
        }
        else if (point >= 75) {
            testResult = "Хорошо";
        }
        else if (point >= 60) {
            testResult = "Удовлетворительно";
        }
        else if (point < 60) {
            testResult = "Неудовлетворительно";
        }
        System.out.println("Оценка: " + testResult);
        scanner.close();
    }
}
