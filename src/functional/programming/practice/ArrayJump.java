package functional.programming.practice;

public class ArrayJump {
    //    Write a Program which will return count to achieve cycle in Array. In other word We have to find the number of steps which is required to reach at already visited index.
//    Input Parameter 1 : Integer Array
//    Input Parameter 2 : Initial Index
//
//    Output : return Integer
//    Pre condition :
//            1.	0<=Array[i];
//2.	If current visit element greater then array length then return 0;
//
//    Test case:
//    Input: {7,1},0			Output: -1
//    Input: {1,3,0,1},0 		Output: 2
//
//    Explanation:
//    Test 1: {7,1},0: Initial Index is 0 so we have to find element at index 0 which is 7 and array size is less then 7. So return -1;
//
//    Test 2:
//    Initial index is 0 and element at index
//0 is 1 So we jump to index 1 and element at index 1 is 3 So will jump to index 3 and element at index 3 is 1 which is already visited index so will return the number of jump we did which is 2 as below:
//            0->1
//            1->3
    public static void main(String[] args) {
        int countOfJumpInArray = findCountOfJumpInArray(new int[]{1, 3, 0, 1}, 0);
        System.out.println(countOfJumpInArray);
    }

    public static int findCountOfJumpInArray(int[] arr, int initialIndex) {
        int countJump = 0;
        if (initialIndex > arr.length - 1) {
            return -1;
        }
        int i = 0;
        while (i < arr.length) {
            int a = arr[initialIndex];
            if (a == arr.length - 1) {
                return -1;
            } else {
                a = arr[a];
                countJump++;
            }
            i++;
        }
        return countJump;
    }

}
