package functional.programming.practice;

import java.util.ArrayList;
import java.util.List;

public class SumOperation {
    public static void main(String[] args) {
//        Write a program to find some of digits of a number
//        Input 123 output 6
        int input = 123;
        int sum = 0;
        while (input > 0) {
            int rem = input % 10;
            sum += rem;
            input /= 10;
        }
        System.out.println(sum);

//        Write a java program to merge digits of 2 numbers without using string
//        Eg . number1= 123
//        Number2= 456
//        Output: 142536
        int n1 = 123;
        int n2 = 456;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while (n1 > 0) {
            int rem1 = n1 % 10;
            list1.add(rem1);
            n1 /= 10;

            int rem2 = n2 % 10;
            list2.add(rem2);
            n2 /= 10;
        }
        int result = 0;
        for (int i = list1.size() - 1; i >= 0; i--) {
            result = result * 10 + list1.get(i);
            result = result * 10 + list2.get(i);
        }
        System.out.println(result);
    }
}
