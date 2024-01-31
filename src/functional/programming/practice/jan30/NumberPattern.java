package functional.programming.practice.jan30;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //output
      /*1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5*/


        //Floyd's Triangle Pattern
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
        //output
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

        //Pascal's Triangle
        int x = 6;
        for (int i = 0; i < x; i++) {

            int num = 1;

            System.out.printf("%" + (x - i) * 2 + "s", ""); //Pascals triangle logic

            for (int j = 0; j <= i; j++) {

                System.out.printf("%4d", num);

                num = num * (i - j) / (j + 1);

            }

            System.out.println();

        }
        //output
//        1
//        1   1
//        1   2   1
//        1   3   3   1
//        1   4   6   4   1
//        1   5  10  10   5   1

    }
}
