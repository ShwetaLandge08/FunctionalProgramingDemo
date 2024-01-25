package functional.programming.practice.jan24;

import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {
//        Write a Java program that sorts HashMap by value.
        Map<String, Integer> map = new HashMap<>();
        map.put("Shweta", 25);
        map.put("Shekhar", 24);
        map.put("Pratiksha", 26);
        map.put("Nitin", 32);
        map.put("Yogiraj", 55);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entries);

        //sort by value
        entryList.sort(Map.Entry.comparingByValue());
        System.out.println(entryList);

        //sort by key
        entryList.sort(Map.Entry.comparingByKey());
        System.out.println(entryList);
    }
}
