package functional.programming.practice.jan25;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {21, 13, 47, 61, 34, 40, 55, 71, 87};
        int temp;

        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = 0; j < arr.length-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
