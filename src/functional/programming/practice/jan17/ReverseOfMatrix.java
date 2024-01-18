package functional.programming.practice.jan17;

public class ReverseOfMatrix {
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] output = findReverseOfGivenMatrix(input);

        for (int[] ints : output) {
            for (int j = 0; j < output.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] findReverseOfGivenMatrix(int[][] arr) {

        //swap element
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //swap non-diagonal element
        for (int k = 0; k < arr.length; k++) {
            int l = 0;
            int r = arr.length - 1;
            int t = arr[k][l];
            arr[k][l] = arr[k][r];
            arr[k][r] = t;
        }
        return arr;
    }
}
