package functional.programming.practice.jan22;

import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] arr = {"flow", "flew", "flower", "floor"};
        String[] array = {"mini", "mineral", "minimum"};
        getLongestPrefixOfStringArray(arr);
        getLongestPrefixOfStringArray(array);
    }

    private static void getLongestPrefixOfStringArray(String[] arr) {
        int arrLength = arr.length;
//        Arrays.sort(arr);
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < arrLength; i++) {
//            if (arr[0].charAt(i) == arr[arrLength - 1 - i].charAt(i)) {
//                stringBuilder.append(arr[0].charAt(i));
//            }
//        }
        if (arr.length == 0) System.out.println("Array longest prefix is ");
        String prefix = arr[0];
        for (int i = 1; i < arrLength; i++)
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    System.out.println("No Prefix");

            }
        System.out.println(prefix);
        //System.out.println(stringBuilder);
    }
}
