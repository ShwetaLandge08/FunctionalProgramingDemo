package functional.programming.practice;

public class NumeratorDenominatorOperation {
    public static void main(String[] args) {
//        Write a program to print infinite repeating digits in specific format as below:
//
//        Input Parameter 1: numerator
//        Input Parameter 2: denominator
//        Output: return String
//
//        Test case:
//        Input: 1,2		Output: 0.5
//        Input: 1,3		Output: 0.(3) as 1/3=0.3333333333333333333333……….
        String fractionalValue = findFractionalValue(4, 333);
        System.out.println(fractionalValue);

    }
    private static String findFractionalValue(int numerator, int denominator) {
        float res = (float) numerator / denominator;
        return String.valueOf(res);
    }
}
