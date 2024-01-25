package functional.programming.practice.jan24;

import java.util.Arrays;

public class Anagrams {
    //    Write a program to check if two strings are anagrams in Java.
    public static void main(String[] args) {
        String s1 = "dog";
        String s2 = "god";
        System.out.println(areAnagrams(s1, s2));
    }

    private static boolean areAnagrams(String s1, String s2) {
        boolean res = false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
//        if (c1.length == c2.length) {
        if (Arrays.equals(c1, c2)) {
            res = true;
        }
//        }
        return res;
    }
}
