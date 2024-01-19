package functional.programming.practice.jan18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateRemoval {
    public static void main(String[] args) {
        String s = "java programming language";
        char[] input = s.toCharArray();
        //String output = "";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : input) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else map.put(c, 1);
        }
        map.entrySet().stream().filter(ele -> ele.getValue() == 1).forEach(el-> System.out.print(el.getKey()));
    }
}
