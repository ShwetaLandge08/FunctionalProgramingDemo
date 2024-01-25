package functional.programming.practice.jan24;

public class LeaderElementsInArray {
    //    How to find all the leaders in an integer array in Java
    public static void main(String[] args) {
        int[] arr = {8, 23, 19, 21, 15, 6, 11};
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(arr[i]);
            }
        }
    }
}
