package functional.programming.practice.jan17;

import java.util.Arrays;

public class SortArrayWithoutInBuildMethod {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
