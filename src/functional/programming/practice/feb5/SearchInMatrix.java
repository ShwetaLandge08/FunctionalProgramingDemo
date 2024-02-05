package functional.programming.practice.feb5;

public class SearchInMatrix {
    //    Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. 
//    This matrix has the following properties:
//    Integers in each row are sorted in ascending from left to right.
//    Integers in each column are sorted in ascending from top to bottom.
//
//    Example 1:
//
//    Input: matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, target = 5
//    Output: true
//    Example 2:
//
//    Input: matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, target = 20
//    Output: false
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        System.out.println(searchInMatrix(matrix, 5));
        System.out.println(searchInMatrix(matrix, 20));
    }

    private static boolean searchInMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row * col - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int midX = mid / col;
            int midY = mid % col;
            if (matrix[midX][midY] == target) {
                return true;
            } else if (matrix[midX][midY] < target) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return false;
    }
}
