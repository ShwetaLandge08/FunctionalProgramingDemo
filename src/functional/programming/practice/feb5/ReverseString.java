package functional.programming.practice.feb5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    //    Given a string s, reverse the string according to the following rules:
//    All the characters that are not English letters remain in the same position.
//    All the English letters (lowercase or uppercase) should be reversed.
//    Return s after reversing it.
//
//            Example 1:
//    Input: s = "ab-cd"Output: "dc-ba"
//    Example 2:
//    Input: s = "a-bC-dEf-ghIj"Output: "j-Ih-gfE-dCba"
//    Example 3:
//    Input: s = "Test1ng-Leet=code-Q!"Output: "Qedo1ct-eeLg=ntse-T!"
    public static void main(String[] args) {
        //String s = "ab-cd";
        String s = "a-bC-dEf-ghIj";
        //String s = "Test1ng-Leet=code-Q!";

        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (Character.isLetter(chars[i]) && Character.isLetter(chars[j])) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            } else if (!Character.isLetter(chars[i]))
                i++;
            else
                j--;
        }

        String output = new String(chars);
        System.out.println(output);
    }

}
