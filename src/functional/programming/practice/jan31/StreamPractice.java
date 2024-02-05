package functional.programming.practice.jan31;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
//        1. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> list = Arrays.asList(123, 567, 234, 125, 167, 456, 890, 198, 123, 234);
        System.out.println(list.stream().map(String::valueOf).filter(c -> c.startsWith("1")).collect(Collectors.toList()));
//
//        2. How to find duplicate elements in a given integers list in java using Stream functions?
        Set<Integer> set = new HashSet<>();
        System.out.println(list.stream().filter(n -> !set.add(n)).collect(Collectors.toList()));
//
//        3. Given the list of integers, find the first element of the list using Stream functions?
        System.out.println(list.stream().findFirst());
        list.stream().limit(1).forEach(System.out::println);
//
//        4. Given a list of integers, find the total number of elements present in the list using Stream functions?
        System.out.println((long) list.size());
//
//        5. Given a list of integers, find the maximum value element present in it using Stream functions?
        System.out.println(list.stream().max(Integer::compareTo));
//
//        6. Given a list of integers, sort all the values present in it using Stream functions?
        System.out.println(list.stream().sorted().collect(Collectors.toList()));

//        7. Given a list of integers, sort all the values present in it in descending order using Stream functions?
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
//
//        8. How will you get the current date and time using Java 8 Date and Time API?
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date + " " + time);
//
//        9. Java 8 program to perform cube on list elements and filter numbers greater than 50.
        List<Integer> cubeOfEle = Arrays.asList(1, 4, 2, 6, 7, 9, 8);
        System.out.println(cubeOfEle.stream().map(n -> Math.pow(n, 3)).filter(ele -> ele > 50).collect(Collectors.toList()));
//
//        10. How to find only duplicate elements with its count from the String ArrayList in Java8?
        List<String> stringList = Arrays.asList("shweta", "shweta", "shekhar", "radha", "ram", "radha", "shweta");
        Map<String, Integer> map = new HashMap<>();
        for (String s : stringList) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else map.put(s, 1);
        }
        map.entrySet().stream().filter(ele -> ele.getValue() >= 2).forEach(System.out::println);

        //11. sort array using stream
        int[] arr = {1, 4, 7, 5, 8, 9};
        int[] output = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(output));
    }
}
