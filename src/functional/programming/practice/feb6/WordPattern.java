package functional.programming.practice.feb6;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
//        WORD PATTERN
//        Given a pattern and a string s, find if s follows the same pattern.
//                Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
//
//                Example 1:
//        Input: pattern = "abba", s = "dog cat cat dog"
//        Output: true
//        Example 2:
//        Input: pattern = "abba", s = "dog cat cat fish"
//        Output: false
//        Example 3:
//        Input: pattern = "aaaa", s = "dog cat cat dog"
//        Output: false
//
//        Constraints:
//        1 <= pattern.length <= 300
//        pattern contains only lower-case English letters.
//        1 <= s.length <= 3000
//        s contains only lowercase English letters and spaces ' '.
//                s does not contain any leading or trailing spaces.
//        All the words in s are separated by a single space.
        String pattern = "abba", s = "dog cat cat dog";

        //String pattern = "abba", s = "dog cat cat fish";
         //String pattern = "aaaa", s = "dog cat cat dog";
        System.out.println(isWordPattern(pattern, s));
    }

    private static boolean isWordPattern(String pattern, String input) {
        boolean res = true;

        String[] arr = input.split(" ");
        Map<Character, String> map = new HashMap<>();
        if (pattern.length() != arr.length) {
            res = false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!Character.isLowerCase(pattern.charAt(i))){
                return false;
            }
            String word = arr[i];
            char c = pattern.charAt(i);
            if (map.containsKey(pattern.charAt(i)) && map.get(c).equals(word))
                res = true;
            else res = false;
            map.put(c, word);
        }
        return res;
    }
}

