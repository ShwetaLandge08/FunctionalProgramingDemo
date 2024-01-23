package functional.programming.practice.jan19;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinimumAndMaximumValueInList {
    public static void main(String[] args) {
//        Write a Java program to find the maximum and minimum values in a list of integers using streams.
        List<Integer> list = Arrays.asList(2, 5, 4, 3, 7, 6, 8, 9, 12, 45, 23, 56, 77, 87);
        //using sorting
        System.out.println(list.stream().sorted().findFirst());
        System.out.println(list.stream().sorted().skip(list.size()-1).findFirst());

        //using min and max
        System.out.println(list.stream().min(Integer::compareTo).get());
        System.out.println(list.stream().max(Integer::compareTo).get());
    }
}
