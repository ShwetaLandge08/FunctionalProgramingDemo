package functional.programming.practice.feb6;

import java.util.*;

public class GroupAnagrams {
    //    GROUP ANAGRAMS
//    Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//            Example 1:
//    Input: strs = ["eat","tea","tan","ate","nat","bat"]
//    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//    Example 2:
//    Input: strs = [""]
//    Output: [[""]]
//    Example 3:
//    Input: strs = ["a"]
//    Output: [["a"]]
//
//    Constraints:
//            1 <= strs.length <= 104
//            0 <= strs[i].length <= 100
//    strs[i] consists of lowercase English letters.
    public static void main(String[] args) {
        //String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"}
        // String[] str = {""};
        String[] str = {"a"};
        Map<String, Set<String>> map = new HashMap<>();
        for (String s : str) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new HashSet<>()).add(s);
        }
        System.out.println(map.values());
    }
}
