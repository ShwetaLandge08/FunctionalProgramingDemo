package functional.programming.practice.jan18;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("nayan"));
    }

    private static boolean isPalindrome(String s) {
        int len = s.length();
        s = s.toLowerCase();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) == s.charAt(len - i - 1)) {
                return true;
            }
        }
        return false;
    }
}
