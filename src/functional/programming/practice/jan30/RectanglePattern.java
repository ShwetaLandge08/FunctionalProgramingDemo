package functional.programming.practice.jan30;

public class RectanglePattern {
    public static void main(String[] args) {
        int length = 5;
        int breadth = 7;

        //hollow rectangle
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                if (i == 1 || i == length || j == 1 || j == breadth) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }

        //full rectangle
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
