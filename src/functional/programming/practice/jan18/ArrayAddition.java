package functional.programming.practice.jan18;

import java.util.Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addOneToGivenArray(new int[]{9, 9, 9})));
    }

    private static int[] addOneToGivenArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int length = arr.length - 1;
        while (length >= 0 && arr[length] == 9) {
            arr[length] = 0;
            length--;
        }
        int[] output = new int[0];
        if (length < 0) {
            output = Arrays.copyOf(arr, arr.length + 1);
            output[0] = 1;
        } else
            arr[length] += 1;
        return output;
    }
}

