package functional.programming.practice.jan25;

import java.util.*;

public class CountSubArray {
    //    Count subarrays with equal number of 1’s and 0’s
//
//    Given an array arr[] of size n containing 0 and 1 only. The problem is to count the subarrays having an equal number of 0’s and 1’s.
//            Examples:
//    Input: arr[] = {1, 0, 0, 1, 0, 1, 1}
//    Output: 8
//    Explanation: The index range for the 8 sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), (4, 5)(2, 5), (0, 5), (1, 6)
//    Input: arr = { 1, 0, 0, 1, 1, 0, 0, 1}
//    Output: 12
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 0, 1};
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == 0 && arr[j] == 1) {
//                    List<Integer> list = new ArrayList<>();
//                    list.add(i);
//                    list.add(j);
//                    set.add(list);
//                }
//            }
//        }
//        System.out.println(set);
//        System.out.println(set.size());
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            //replacing 0 in array with -1
            if (arr[i] == 0) {
                arr[i] = -1;
            }
            //adding the elements in array
            sum += arr[i];
            //if sum =0, that means equal number of 1 and -1 present in array
            if (sum == 0) {
                count++;
            }
            if (map.containsKey(sum)) {
               // If the map contains the sum, then add the count to the frequency of the current sum’s value in the map.
                count += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }

        }
        System.out.println(count);
    }
}
