package functional.programming.practice.feb7;

public class FindPalindromeInString {
    //    Given a string s, return the longest
//    palindromic substring in s.
//    Example 1:
//    Input: s = "babad" Output: "bab" Explanation: "aba" is also a valid answer.
//    Example 2:
//    Input: s = "cbbd" Output: "bb"
//
//    Constraints:
//            1 <= s.length <= 1000
    public static void main(String[] args) {
        String input = "babad";
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome(input));
    }

    private static int start = 0;
    private static int length = 0;

    public static String longestPalindrome(String s) {
        if (s.length() == 1 || s.isEmpty())
            return s;

        for (int i = 0; i < s.length() - 1; i++) {
            palindromeChecker(i, i, s);
            palindromeChecker(i, i + 1, s);
        }

        return s.substring(start, start + length);
    }

    private static void palindromeChecker(int leftPointer, int rightPointer, String s) {
        while (leftPointer >= 0 && rightPointer < s.length() && s.charAt(leftPointer) == s.charAt(rightPointer)) {
            leftPointer--;
            rightPointer++;
        }
        if (length < rightPointer - leftPointer - 1) {
            start = leftPointer + 1;
            length = rightPointer - leftPointer - 1;
        }
    }
}
