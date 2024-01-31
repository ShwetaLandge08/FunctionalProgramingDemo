package functional.programming.practice.jan29;

public class SubArrayWithGivenSum {
//    Find sub-arrays with given sum in an array.
//    Given an Array of non-negative Integers and a number. You need to print all the starting and ending indices of Subarrays having their sum equal to the given integer.
//    For example :
//
//
//    Input :
//    Input-int[] arr = {2, 3, 6, 4, 9, 0, 11};
//    int num = 9
//    Output-
//    starting index : 1, Ending index : 2
//    starting index : 5, Ending index : 5
//    starting index : 5, Ending index : 6
public static void main(String[] args) {
    int[] arr = {2, 3, 6, 4, 9, 0, 11};
        getElementsWithGivenSum(arr,9);
}
private static void getElementsWithGivenSum(int[] arr,int target){
    for(int start = 0; start < arr.length; start++)
    {
        // initialize the sum of the current sub-array to 0.
        int currSum = 0;
        for(int end = start; end < arr.length; end++)
        {
            // add every element of the current sub-array
            // to the current running sum.
            currSum += arr[end];

            // print the starting and ending indices once we get
            // sub-array with given sum
            if(currSum == target)
            {
                System.out.println("starting index : " +
                        start + ", " + "Ending index : " + end);

            }

        }
    }
}
}
