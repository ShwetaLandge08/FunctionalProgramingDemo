package functional.programming.practice.jan25;

import java.util.Arrays;
import java.util.List;

public class MinimumMaximumAndAverageValueFromIntegerArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 24, 16, 13, 17, 14, 23, 39};
        //minimum value
        Arrays.stream(arr).min().ifPresent(System.out::println);
        //maximum value
        Arrays.stream(arr).max().ifPresent(System.out::println);
        //average value
        Arrays.stream(arr).average().ifPresent(System.out::println);
    }
}
