package functional.programming.practice.jan22;

public class LuckyNumber {
    public static int count = 2;

    public static void main(String[] args) {
        System.out.println(isLuckyNumber(10));
    }

    static boolean isLuckyNumber(int n) {
        if (count > n)
            return true;
        if (n % count == 0)
            return false;
//determines the position of the given number
        n = n - (n / count);
//increments the count variable by 1
        count++;
        return isLuckyNumber(n);
    }
}
