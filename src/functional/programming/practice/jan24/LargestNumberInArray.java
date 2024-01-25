package functional.programming.practice.jan24;

public class LargestNumberInArray {
    public static void main(String[] args) {
//        Write a program to find the largest number in an array in Java.
        int[] arr = {1, 3, 6, 3, 7, 8, 9};
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
