package functional.programming.practice.jan29;

public class SlidingWindowMaximumInJava {
//    Given an Array of integers and an Integer k, Find the maximum element of from all the contiguous subarrays of size K.
//
//    For eg :
//    Input : int[] arr = {2,6,-1,2,4,1,-6,5}
//    int k = 3
//    output : 6,6,4,4,4,5
//    for every subarray of size k, Print its maximum element.
public static void main(String[] args) {
    int[] arr = {2,6,-1,2,4,1,-6,5};
    solve(arr,3);
}
    public static void solve(int[] arr, int k)
    {
        // starting the outer loop from k and running it until,
        // current pointer is EQUAL to arr.length
        for(int i = k; i <= arr.length; i++)
        {
            int max = Integer.MIN_VALUE;

            // this loop considers sub-arrays of size k ending at i-1
            for(int j = i-k; j<i; j++)
            {
                max = Math.max(max, arr[j]);
            }

            System.out.println(max);
        }
    }
}
