package functional.programming.practice.feb5;

import java.util.Arrays;

public class AddZerosToRightOFArray {
    /*Move Zeros

    Examples:
    Test Case 1 –
    Input – [0, 1, 0, 3, 12]
    Output – [1, 3, 12, 0, 0]
    Test Case 2 –
    Input – [0]
    Output – [0]
    Test Case 3 –
    Input – [10, 11, 0, 1, 2, 5]
    Output – [10, 11, 1, 2, 5, 0]*/
    public static void main(String[] args) {
        int j = 0;
        int[] arr = {10, 11, 0, 1, 2, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
