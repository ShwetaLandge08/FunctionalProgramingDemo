package functional.programming.practice.feb6;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    //    Contains Duplicate II
//    Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
//            Example 1:
//    Input: nums = [1,2,3,1], k = 3
//    Output: true
//    Example 2:
//    Input: nums = [1,0,1,1], k = 1
//    Output: true
//    Example 3:
//    Input: nums = [1,2,3,1,2,3], k = 2
//    Output: false
//
//    Constraints:
//            1 <= nums.length <= 105
//            -109 <= nums[i] <= 109
//            0 <= k <= 105
    public static void main(String[] args) {
        System.out.println(isContainDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(isContainDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(isContainDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));

    }

    private static boolean isContainDuplicate(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int index = map.get(arr[i]);
                if ((i - index) <= k) {
                    return true;
                } else map.put(arr[i], i);
            } else map.put(arr[i], i);
        }
        return false;
    }
}
