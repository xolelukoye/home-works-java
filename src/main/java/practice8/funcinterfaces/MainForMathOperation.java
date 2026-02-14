package practice8.funcinterfaces;

public class MainForMathOperation {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation substraction = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println("Лямбда на сложение: " + add.operationsWithNumbers(5, 9));
        System.out.println("Лямбда на вычитание: " + substraction.operationsWithNumbers(7, 3));
        System.out.println("Лямбда на умножение: " + multiply.operationsWithNumbers(71, 2));
        System.out.println("Лямбда на деление: " + divide.operationsWithNumbers(63,7));
    }
}
