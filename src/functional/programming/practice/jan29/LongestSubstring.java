package functional.programming.practice.jan29;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstring {
//    Find Longest Substring Without Repeating Characters
public static void main(String[] args) {
    String input ="abcdabbb";
    StringBuilder substring = new StringBuilder();
    Set<Character> set = new LinkedHashSet<>();
    for(int i=0;i<input.length();i++){
        if(!set.contains(input.charAt(i))){
            substring.append(input.charAt(i));
            set.add(input.charAt(i));
        }
    }
    System.out.println(substring + " "  +substring.length());
}
}
