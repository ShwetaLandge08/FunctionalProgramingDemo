package functional.programming.practice.jan24;

import java.util.Arrays;
import java.util.List;

public class CheckIfListContainEvenNumberOrNot {
    public static void main(String[] args) {
//        How do you check if a list of integers contains only odd numbers in Java?
        List<Integer> list = Arrays.asList(1, 41, 7, 67, 45, 79, 23, 15, 169);
        boolean isEvenNumberPresent = list.stream().anyMatch(i -> i % 2 == 0);
        System.out.println(isEvenNumberPresent);
    }
}
