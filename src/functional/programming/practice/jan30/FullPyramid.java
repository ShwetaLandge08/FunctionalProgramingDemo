package functional.programming.practice.jan30;

public class FullPyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            for (int k = i; k <= n - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
