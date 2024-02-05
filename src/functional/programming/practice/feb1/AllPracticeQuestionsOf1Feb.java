package functional.programming.practice.feb1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPracticeQuestionsOf1Feb {
    public static void main(String[] args) {

        int[] arr = {10, 6, 4, 2, 8};
        int[] arr2 = {1, 5, 3, 9, 7};
        int middle1 = getMiddleElementWithoutMergingTwoArray(arr);
        int middle2 = getMiddleElementWithoutMergingTwoArray(arr2);
        int sum = middle1 + middle2;
        System.out.println(middle1 + " + " + middle2 + " = " + sum);

        System.out.println(getMiddleElementByMergingTwoArray(arr, arr2));

        int[] array = {10, 20, 15, 2, 23, 90, 67};
        System.out.println(getLargestElementInArray(array));

        getMinAndMaxElementInArray(array);

        int[] ints = reverseArray(array);
        System.out.println(Arrays.toString(ints));//8,2,4,6,10

    }
    // 1. Sum of middle elements of two sorted Arrays by merging two array

    private static int getMiddleElementByMergingTwoArray(int[] arr, int[] arr2) {
        //Arrays.sort(arr);
        //sort algorithm
        int size = arr.length + arr2.length;
        int[] output = new int[size];
        System.arraycopy(arr, 0, output, 0, arr.length);
        System.arraycopy(arr2, 0, output, arr.length, arr2.length);

        for (int i = 0; i < output.length; i++) {
            for (int j = i + 1; j < output.length; j++) {
                if (output[i] > output[j]) {
                    int temp = output[i];
                    output[i] = output[j];
                    output[j] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(output));
        int mid1 = (output.length - 1) / 2;
        int mid2 = (mid1 + 1);
        int sum = output[mid1] + output[mid2];
        System.out.println(output[mid1] + " + " + output[mid2] + " = " + sum);
        return sum;
    }
    // 2. Sum of middle elements of two sorted Arrays without merging two array

    private static int getMiddleElementWithoutMergingTwoArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int mid = (arr.length - 1) / 2;
        return arr[mid];
    }

    //3. Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
    //Note: If the array is increasing then just print the last element will be the maximum value.
    private static List<Integer> getLargestElementInArray(int[] arr) {
        List<Integer> output = new ArrayList<>();
        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                output.add(arr[i]);
            }

        }
        return output;
    }

    //4. Given an array, write functions to find the minimum and maximum elements in it.
    private static void getMinAndMaxElementInArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Minimum element in array is " + arr[0]);
        System.out.println("Maximum element in array is " + arr[arr.length - 1]);
    }

    //5. Given an array (or string), the task is to reverse the array/string.
//    Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}
//
//    Input: original_array[] = {4, 5, 1, 2}
//    Output: array_reversed[] = {2, 1, 5, 4}
    private static int[] reverseArray(int[] arr) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[arr.length - i - 1];
        }
        return output;
    }
}
