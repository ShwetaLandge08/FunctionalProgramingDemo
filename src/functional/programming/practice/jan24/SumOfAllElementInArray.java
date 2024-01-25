package functional.programming.practice.jan24;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllElementInArray {
    public static void main(String[] args) {
//        How do you get the sum of all elements in an integer array in Java?
        int[] arr = {1, 4, 7, 2, 5, 8, 9, 45, 86, 34, 67};
        //using stream
        System.out.println(Arrays.stream(arr).sum());

        //using for loop
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);

        int[] array = Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
        System.out.println(Arrays.toString(array));
    }
}


