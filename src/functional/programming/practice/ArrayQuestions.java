package functional.programming.practice;

import java.util.*;

public class ArrayQuestions {
    public static void main(String[] args) {
        //Reverse Given Array:
//        input :1,2,3,4
//        output :4,3,2,1

        int[] arr = {1, 2, 3, 4};
        int length = arr.length - 1;
        for (int i = 0; i < length; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i];
            arr[length - i] = temp;
        }
        System.out.println(Arrays.toString(arr));

//        Write a program to check if two arrays are equal or not
        // boolean arrayAreSame = isArrayAreSame(new int[]{1, 5, 3, 7, 4, 8, 6}, new int[]{8, 1, 3, 7, 4, 5, 9});
        // System.out.println(arrayAreSame);

        //        Anagram Algo and variations
//        Based on anagram’s logic, display the output in the below format.
//        Input: [ ‘cat’, ‘dog’, ’cat’, ‘god’ ] #list of words
//        Output: [ {‘cat’} , {‘dog’,’god’} ] #list of sets
        List<String> listOfString = Arrays.asList("cat", "dog", "cat", "god");
        Map<String, Set<String>> anagramGroups = new HashMap<>();
        for (String s : listOfString) {
            char[] arr1 = s.toCharArray();
            Arrays.sort(arr1);
            String key = new String(arr1);

            // Add the word to the corresponding anagram group
            anagramGroups.computeIfAbsent(key, k -> new HashSet<>()).add(s);
        }
        System.out.println(anagramGroups.values());
        System.out.println(isPalindrome("naan"));
    }

    //not working
//    private static boolean isArrayAreSame(int[] arr1, int[] arr2) {
//        boolean res = false;
//        int[] array = Arrays.stream(arr1).sorted().toArray();
//        System.out.println(Arrays.toString(array));
//        int[] array1 = Arrays.stream(arr2).sorted().toArray();
//        System.out.println(Arrays.toString(array1));
//        for (int a = 0; a < array.length - 1; a++) {
//            if (array.length == array1.length) {
//                if (array[a] == array1[a]) {
//                    res = true;
//                }
//            }
//
//        }
//        return res;
//    }


    private static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        int len = input.length();
        for (int i = 0; i < len / 2; i++) {
            if (input.charAt(i) == input.charAt(len - 1 - i)) {
                return true;
            }
        }
        return false;
    }
}
