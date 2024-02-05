package functional.programming.practice.feb2;

import java.util.HashMap;
import java.util.Map;

public class PlayerOfTheYear {

//    Find the player of the year.
//    Input Format
//    The first line contains an integer, n, denoting the number of players. The next line contains an integer, m, denoting the number of data points per player. Each line i of the n subsequent lines(where 0 ≤ i < n)contains m space separated integers denoting the relative performance of player i during that data point duration.
//    Output Format
//    A single Integer
//    Sample Input
//        3
//        4
//        1 3 4 5   // player 1 perfomances
//        7 2 3 4  // player 2  perfomances
//        1 3 2 1  // player 3 perfomances
//    Sample Output
//        1
//    Explanation
//    Player 1 has been on the top for 3 data point durations, which is the maximum.
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 4, 5},
                {7, 2, 3, 4},
                {1, 3, 2, 1}};

        int POTYear = 0;
        Map<Integer, Integer> playerOfTheYear = playerOfTheYear(arr);
        for (Map.Entry<Integer, Integer> entry : playerOfTheYear.entrySet()) {
            if (POTYear < entry.getValue()) {
                POTYear = entry.getKey();
            }
        }
        System.out.println(POTYear);
    }

    private static Map<Integer, Integer> playerOfTheYear(int[][] arr) {
        int playerCount = arr.length;
        int matchCount = arr[0].length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < playerCount; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < matchCount; i++) {
            int bestPerformer = 0;
            int manOfTheMatch = 0;
            for (int j = 0; j < playerCount; j++) {
                if (bestPerformer < arr[j][i]) {
                    bestPerformer = arr[j][i];
                    manOfTheMatch = j + 1;
                }
            }
            map.put(manOfTheMatch, map.get(manOfTheMatch) + 1);
        }
        return map;
    }
}
