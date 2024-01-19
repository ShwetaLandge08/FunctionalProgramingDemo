package functional.programming.practice.jan17;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int i = searchElementInArray(new int[]{3,5,7,95,32,12,67}, 67);
        System.out.println(i);
    }

    private static int searchElementInArray(int[] arr, int in) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == in) {
                return mid;
            } else if (arr[mid] < in) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
