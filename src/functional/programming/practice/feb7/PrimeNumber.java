package functional.programming.practice.feb7;

public class PrimeNumber {
    //    Can you write me a Java program to find whether a number is prime?
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(3));
    }
    private static boolean isPrimeNumber(int n) {
        if (n == 1 || n == 0)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i < n / 2; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
