package functional.programming.practice.jan22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeMethodInStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 6, 3, 8, 2, 7, 9, 5, 10);
        IntStream.range(1, 10).forEach(System.out::print); //this method exclude the last number/index
        System.out.println();
        IntStream.rangeClosed(1, 10).forEach(System.out::print); // this method include the last number/index
        System.out.println();
        System.out.println(IntStream.range(1, 10).sum());
        IntStream.iterate(1, e -> e + 3).limit(10).forEach(System.out::println);
//        R collect = IntStream.iterate(1, e -> e + 2).collect(Collectors.toList()); gives error
//        to write without error
        Stream<Integer> boxed = IntStream.iterate(1, e -> e + 2).boxed();
        System.out.println(boxed.collect(Collectors.toList()));
    }
}
