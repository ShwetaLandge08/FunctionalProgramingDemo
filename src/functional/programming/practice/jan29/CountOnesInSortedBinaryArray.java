package functional.programming.practice.jan29;

public class CountOnesInSortedBinaryArray {
    private static int[] arr;

    public static void main(String[] args) {
        int[] arr ={0,0,0,1,1,1,1};
        int count = 0;

        while (count < arr.length) {
            if (arr[count] == 1) {
                break;
            }
            count++;
        }
        System.out.println(arr.length - count);
    }
}
