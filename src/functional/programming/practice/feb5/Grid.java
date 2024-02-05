package functional.programming.practice.feb5;

import java.util.Objects;

public class Grid {
    //    Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands.
//    An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
//    You may assume all four edges of the grid are all surrounded by water.
//
//    Example 1:
//    Input: grid = [
//            ["1","1","1","1","0"],  ["1","1","0","1","0"],
//            ["1","1","0","0","0"],
//            ["0","0","0","0","0"]
//            ]Output: 1
//
//    Example 2:
//    Input: grid = [
//            ["1","1","0","0","0"],  ["1","1","0","0","0"],
//            ["0","0","1","0","0"],
//            ["0","0","0","1","1"]
//            ]Output: 3
//
//
//    Constraints:
//    m == grid.length
//    n == grid[i].length
//1 <= m, n <= 300
//    grid[i][j] is '0' or '1'.
    public static void main(String[] args) {
//        String[][] grid = {
//                {"1", "1", "1", "1", "0"},
//                {"1", "1", "0", "1", "0"},
//                {"1", "1", "0", "0", "0"},
//                {"0", "0", "0", "0", "0"}};
        String[][] grid = {
                {"1", "1", "0", "0", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "1", "0", "0"},
                {"0", "0", "0", "1", "1"}};

        System.out.println(getNumberOfIslands(grid));
    }

    public static int getNumberOfIslands(String[][] grid) {
        int island = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                island += sink(grid, i, j);
            }
        }
        return island;
    }

    private static int sink(String[][] matrix, int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col].equals("0")) {
            return 0;
        }
        //mark cell as visited
        matrix[row][col] = "0";

        //recursive call to check visited cell
        sink(matrix, row + 1, col);
        sink(matrix, row - 1, col);
        sink(matrix, row, col + 1);
        sink(matrix, row, col - 1);
        return 1;
    }
}
