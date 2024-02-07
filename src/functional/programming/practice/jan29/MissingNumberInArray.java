package functional.programming.practice.jan29;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MissingNumberInArray {
    public static void main(String[] args) {
//        Find missing number in the array.
//        You are given an integer array containing 1 to n but one of the number from 1 to n in the array is missing. You need to provide optimum solution to find the missing number. Number cannot be repeated in the arry.
//                For example:
//
        int[] arr1 = {7, 5, 6, 1, 4, 2};
//        Missing number : 3
        int[] arr2 = {5, 3, 1, 2};
//        Missing number : 4
        System.out.println(missingNumberInArray(arr1));
        System.out.println(missingNumberInArray(arr2));
    }

    public static int missingNumberInArray(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int restSum = 0;
        for (int i = 0; i < arr.length; i++) {
            restSum += arr[i];
        }
        return sum - restSum;
    }

}
