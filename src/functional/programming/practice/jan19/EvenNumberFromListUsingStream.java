package functional.programming.practice.jan19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFromListUsingStream {
    public static void main(String[] args) {
//        Given a list of integers, find out all the even numbers exist in the list using Stream functions?
        List<Integer> list = Arrays.asList(2, 5, 4, 3, 7, 6, 8, 9, 12, 45, 23, 56, 77, 87);
        List<Integer> collect = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        //using forEach method
        list.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
