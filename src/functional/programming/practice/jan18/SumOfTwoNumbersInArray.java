package functional.programming.practice.jan18;

import java.util.Arrays;

public class SumOfTwoNumbersInArray {
    public static void main(String[] args) {
//        Sum of second smallest and second largest element in the int array
        int[] arr = {1, 5, 3, 7, 2, 8, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min = arr[1];
        int max = arr[arr.length - 2];
        System.out.println(min + max);
    }
}
