package functional.programming.practice.jan18;

public class PalindromeNumber {
    public static void main(String[] args) {
//        Number is palindrome or not
        boolean palindrome = isPalindrome(122321);
        System.out.println(palindrome);
    }

    private static boolean isPalindrome(int num) {
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }
        return (temp == sum);
    }
}
