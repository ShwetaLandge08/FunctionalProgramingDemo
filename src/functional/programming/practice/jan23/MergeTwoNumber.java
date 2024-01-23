package functional.programming.practice.jan23;

public class MergeTwoNumber {
    public static void main(String[] args) {
//        Write a java program to merge digits of 2 numbers
//        Eg . number1= 123
//        Number2= 456
//        Output: 142536
        // method 1
        int n1 = 1237;
        int n2 = 4568;
        StringBuilder sb = new StringBuilder();
        while (n1 > 0) {
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            sb.append(rem2).append(rem1);
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        sb.reverse();
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
