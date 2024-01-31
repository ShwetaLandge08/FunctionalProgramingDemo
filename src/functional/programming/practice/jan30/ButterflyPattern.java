package functional.programming.practice.jan30;

public class ButterflyPattern {
    public static void main(String[] args) {
        int row_size = 7;
        int wings = 1;
        for (int i = 1; i <= row_size; i++) {
            if (i == (row_size / 2) + 2) {
                wings = row_size / 2 - 1;
            }
            for (int j = 1; j <= row_size; j++) {
                if (i < row_size / 2) {
                    if (j <= wings || j >= row_size - wings + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i > row_size / 2 + 1) {
                    if (j <= wings || j >= row_size - wings + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");

                }
            }
            if (i <= row_size / 2)
                wings++;
            else
                wings--;
            System.out.println();
        }
    }
}
