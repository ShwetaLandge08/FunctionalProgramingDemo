package functional.programming.practice.jan24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoList {
    public static void main(String[] args) {
//        How do you merge two lists in Java?
        List<Integer> list1 = Arrays.asList(1, 4, 7, 8, 9);
        List<Integer> list2 = Arrays.asList(5, 6, 2, 3, 10);
        Stream.concat(list1.stream(), list2.stream()).sorted().forEach(System.out::println);
    }
}
