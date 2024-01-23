package functional.programming.practice.jan19;

import java.util.*;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        //first non-repeated character in array
        Character[] array = {'c', 'f', 'c', 'r', 'y', 'f', 'a'};
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : array) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else
                map.put(c, 1);
        }
        System.out.println(map.entrySet().stream().filter(s -> s.getValue() == 1).findFirst());
    }
}
