package practice11;

public class DebugTask4 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("alla"));
    }
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

}
