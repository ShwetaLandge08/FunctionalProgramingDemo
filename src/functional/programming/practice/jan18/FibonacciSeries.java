package functional.programming.practice.jan18;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacci(10);
    }

    private static void printFibonacci(int n) {
        int a = 0, b = 1, c = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
