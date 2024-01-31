package functional.programming.practice.jan30;

public class halfPyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
