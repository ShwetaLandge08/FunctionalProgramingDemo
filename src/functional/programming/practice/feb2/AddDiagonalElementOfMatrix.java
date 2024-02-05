package functional.programming.practice.feb2;

public class AddDiagonalElementOfMatrix {
    //	Check if total of right and left diagonal match
    //	1 2 3
    //	4 5 6
    //	7 8 9
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(checkIfSumOfLeftAndRightDiagonalElementIsSame(arr));
    }

    private static boolean checkIfSumOfLeftAndRightDiagonalElementIsSame(int[][] arr) {
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i][i];
            rightSum += arr[i][arr.length - 1 - i];
        }
        return leftSum == rightSum;
    }

}
