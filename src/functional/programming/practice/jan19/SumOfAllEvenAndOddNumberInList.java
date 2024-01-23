package functional.programming.practice.jan19;

import java.util.Arrays;
import java.util.List;

public class SumOfAllEvenAndOddNumberInList {
    public static void main(String[] args) {
//        Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
        List<Integer> list = Arrays.asList(2, 5, 4, 3, 7, 1, 8, 9);

        //sum of even number
        int sum = list.stream().filter(s -> s % 2 == 0).mapToInt(c -> Integer.valueOf(c)).sum();
        System.out.println("Sum of all even Numbers : " + sum);

        //sum of odd number
        int sum1 = list.stream().filter(s -> s % 2 != 0).mapToInt(c -> Integer.valueOf(c)).sum();
        System.out.println("Sum of all odd Numbers : " + sum1);
    }
}
