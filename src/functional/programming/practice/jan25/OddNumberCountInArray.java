package functional.programming.practice.jan25;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OddNumberCountInArray {
    public static void main(String[] args) {
//        You are given a array of integer. All numbers occur even number of times except one. You need to find the number which occurs odd number of time. You need to solve it with o(n) time complexity and o(1) space complexity.
//        For example:
//
//
//        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
//        Number which occurs odd number of times is : 50
        int[] array = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:array){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else map.put(i,1);
        }
        map.entrySet().stream().filter(ele -> ele.getValue() % 2 != 0)
                .forEach(entry-> System.out.println("Number which occurs odd number of times is : " +entry.getKey()));
    }
}
