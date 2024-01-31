package functional.programming.practice.jan25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TripletsArray {

    //    How To Find Array Triplets With Sum Of Two Elements Equals Third?
    public static void main(String[] args) {
        int[] arr = {21, 13, 47, 61, 34, 40, 55, 71, 87};
        for (int i = 0; i < arr.length - 2; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] == arr[k]) {
                        System.out.println(arr[i] + ", " +arr[j] + ", " +arr[k]);
                    } else if (arr[i] + arr[k] == arr[j]) {
                        System.out.println(arr[i] + ", " +arr[k] + ", " +arr[j]);
                    } else if (arr[j] + arr[k] == arr[i]) {
                        System.out.println(arr[j] + ", " +arr[k] + ", " +arr[i]);
                    }
                }
            }
        }
    }
}
