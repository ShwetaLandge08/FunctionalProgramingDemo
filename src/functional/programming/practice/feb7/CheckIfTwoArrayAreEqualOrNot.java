package functional.programming.practice.feb7;

public class CheckIfTwoArrayAreEqualOrNot {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 1, 7, 4};

        int[] array2 = {2, 5, 1, 7, 4};

        System.out.println(isTwoArrayAreSame(array1, array2));
    }

    private static boolean isTwoArrayAreSame(int[] arr1, int[] arr2) {
        boolean res = false;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    res = false;
                    break;
                } else res = true;
            }
        }
        return res;
    }
}
