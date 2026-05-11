package practice11;

public class DebugTask8 {

    public static void main(String[] args) {
        double a = Math.round((0.1 * 3 * 1000) / 1000);
        double b = Math.round((0.3 * 1000) / 1000);
        if (Math.abs(a - b) < 1e-9) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

}
