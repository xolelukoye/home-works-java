package practice3;

public class MathConstants {

    static final double PI = 3.14159;
    final double E = 2.17828;

    static double calculateArea(double r) {
        return PI * Math.pow(r, 2);
    }

    static double calculateCircumference(double r) {
        return 2 * PI * r;
    }

    static void main(String[] args) {

        System.out.println(calculateArea(6));
        System.out.println(calculateCircumference(2));

    }
}
