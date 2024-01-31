package functional.programming.practice.jan25;

import java.util.Arrays;

public class SeparateEvenAddOddInArray {
//    Separate odd and even numbers in an array
//    Given an array of integers, you need to segregate odd and even numbers in an array.
//    Please note: Order of elements can be changed.
//
//    For example:
//    arr[] = {12, 17, 70, 15, 22, 65, 21, 90}
//    Array after separating odd and even numbers :
//    {12, 90, 70, 22, 15, 65, 21, 17}
public static void main(String[] args) {
    int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
    System.out.println(Arrays.toString(separateEvenOddNumbers(arr)));
}
    public static int[] separateEvenOddNumbers(int[] arr) {
        int left=0;
        int right=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            while(arr[left]%2==0)
            {
                left++;
            }
            while(arr[right]%2==1)
            {
                right--;
            }
            if(left<right)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        return arr;
    }
}
