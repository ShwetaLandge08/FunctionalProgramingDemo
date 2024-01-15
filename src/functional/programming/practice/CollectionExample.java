package functional.programming.practice;

import java.util.HashMap;
import java.util.Map;

public class CollectionExample {
    public static void main(String[] args) {
        //WAP to print occurrence of each integer in an array in ascending order of its count.
        int[] arr = {1, 2, 3, 4, 56, 1, 3, 5, 2, 6, 3, 1, 7};
        Map<Integer, Integer> map = new HashMap<>();
        for (int in : arr) {
            if (map.containsKey(in)) {
                map.put(in, map.get(in) + 1);
            } else {
                map.put(in, 1);
            }
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + "  " + entry.getValue()));

    }
}
