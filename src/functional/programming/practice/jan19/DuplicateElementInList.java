package functional.programming.practice.jan19;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementInList {
    public static void main(String[] args) {
//        How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> list = Arrays.asList(2, 5, 4, 3, 7, 1, 8, 9, 12, 15, 13, 56, 17, 87, 2, 4, 5, 6, 8, 13);
        Set<Integer> set = new LinkedHashSet<>();
        list.stream().filter(s -> !set.add(s)).forEach(System.out::println);
    }
}
