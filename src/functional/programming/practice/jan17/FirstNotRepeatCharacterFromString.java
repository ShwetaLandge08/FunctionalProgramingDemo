package functional.programming.practice.jan17;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNotRepeatCharacterFromString {
    public static void main(String[] args) {
        for (Map.Entry<Character, Integer> map1 : firstNotRepeatedCharacterFromString("asdaaqwert").entrySet()) {
            if (map1.getValue() == 1) {
                System.out.println(map1.getKey());
                break;
            }
        }
        //method 1
        String str = "rajashekhar";
        for(char c : str.toCharArray()) {
            if(str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non-repeated character of "+str+" is "+c); break;
            }
        }
    }

    //method 2
    public static Map<Character, Integer> firstNotRepeatedCharacterFromString(String s) {
        char[] c = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : c) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}
