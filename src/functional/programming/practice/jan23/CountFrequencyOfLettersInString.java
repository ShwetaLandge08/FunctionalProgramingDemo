package functional.programming.practice.jan23;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfLettersInString {
    public static void main(String[] args) {
        String input = "Find the frequency of each word in this string";
        input = input.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else map.put(c, 1);
        }
        map.entrySet().stream().forEach(entry -> System.out.println("Occurrence of " + entry.getKey() + " are " + entry.getValue()));
    }
}
