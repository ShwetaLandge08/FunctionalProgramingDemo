package functional.programming.practice.feb7;

public class SumOfAllElementInNumber {
    //    Write a Java program to find sum of all digits of a given number
    public static void main(String[] args) {
        int num = 23456;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println(sum);
    }
}

