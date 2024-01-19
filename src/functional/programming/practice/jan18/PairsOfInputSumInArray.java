package functional.programming.practice.jan18;

import java.util.ArrayList;
import java.util.List;

public class PairsOfInputSumInArray {
    //    Finding pairs for input sum in array
    public static void main(String[] args) {
        List<Integer> pairsOfInputInSumArray = findPairsOfInputInSumArray(new int[]{3, 4, 5, 2, 6, 8, 9}, 8);
        System.out.println(pairsOfInputInSumArray);
    }

    private static List<Integer> findPairsOfInputInSumArray(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(arr[i]);
                    list1.add(arr[j]);
                    list.addAll(list1);
                }
            }
        }
        return list;
    }
}
