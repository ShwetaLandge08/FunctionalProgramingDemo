package functional.programming.practice.jan17;

import java.util.*;

public class AnagramInArray {
    public static void main(String[] args) {
        //        Anagram Algo and variations
//        Based on anagram’s logic, display the output in the below format.
//        Input: [ ‘cat’, ‘dog’, ’cat’, ‘god’ ] #list of words
//        Output: [ {‘cat’} , {‘dog’,’god’} ] #list of sets
        List<String> listOfString = Arrays.asList("cat", "dog", "cat", "god");
        Map<String, Set<String>> anagramGroups = new HashMap<>();
        for (String s : listOfString) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // Add the word to the corresponding anagram group
            anagramGroups.computeIfAbsent(key, k -> new HashSet<>()).add(s);
        }
        System.out.println(anagramGroups.values());
    }
}
