package functional.programming.practice.feb2;

import java.util.Arrays;

public class FindSecondLargestElementInArray {
    //Find Second Largest Unique Element
    public static void main(String[] args) {
        //	int[] arr = {1, 4, 5,7,3,8, 9}; //8
        int[] arr = {1, 4, 5, 7, 8, 7}; //-1
        //int[] arr = {1, 4, 5, 7, 7, 8, 9, 9};
        //	int[] arr = {5,5,5,5}; // -1

        Arrays.sort(arr);

        System.out.println(findSecondLargest(arr));

        System.out.println(findSecondHighest(arr));
    }

    //method 1
    private static int findSecondLargest(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return -1;
                }
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 2];
    }

    //method 2
    private static int findSecondHighest(int[] arr) {
        int secondLargest = arr[arr.length - 2];
        int firstLargest = arr[arr.length - 1];
        int index = arr.length - 2;
        int count = 0;
        for (int j : arr) {

            if (firstLargest == secondLargest) {
                secondLargest = arr[index - 1];
                index--;
            }

            if (secondLargest == j) {
                count++;
                if (count > 1) {
                    return -1;
                }
            }
        }
        return secondLargest;
    }
}
