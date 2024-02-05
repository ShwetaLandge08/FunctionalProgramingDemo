package functional.programming.practice.feb2;

import java.util.Arrays;

public class SearchNumberIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 30},
                {4, 5, 60},
                {7, 8, 90}};
        System.out.println(findElementIn2DArray(arr, 90));
        System.out.println(searchMatrix(arr, 90));
    }

    //method 1
    private static boolean findElementIn2DArray(int[][] arr, int num) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    //method 2
    private static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row * col - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int midX = mid / col;
            int midY = mid % col;

            if (matrix[midX][midY] == target)
                return true;

            if (matrix[midX][midY] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
