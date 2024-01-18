package functional.programming.practice;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12, 3, 6, 77, 56, 7, 63, 2, 5, 321, 66);
        List<String> stringList = Arrays.asList("Spring", "Spring boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        //print odd numbers from list
        integerList.stream().filter(n -> !(n % 2 == 0)).forEach(n -> System.out.print(n + ", "));
        System.out.println();

        //print cube of even number
        integerList.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(n -> System.out.print(n + ", "));
        System.out.println();

        //print string containing spring
        stringList.stream().filter(s -> s.contains("Spring")).forEach(n -> System.out.print(n + ", "));
        System.out.println();

        //print string having length greater than 4
        stringList.stream().filter(s -> s.length() > 4).forEach(n -> System.out.print(n + ", "));
        System.out.println();

        //add number in list
        Integer reduce = integerList.stream().reduce(0, Integer::sum);//(a,b)->a+b
        System.out.println(reduce);

        //return greatest number in list(
        Integer reduce1 = integerList.stream().reduce(0, (f, s) -> f > s ? f : s);
        System.out.println(reduce1);

        List<Integer> list = Arrays.asList(1, 1, 2, 2, 3, 5, 6, 73, 3, 2);
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        //behaviour parameterization
        printPredicate(integerList, (n) -> n % 2 == 0);
        printPredicate(integerList, (n) -> n % 3 == 0);
        printPredicate(integerList, n -> n % 5 == 0);
    }

    private static void printPredicate(List<Integer> list, Predicate<Integer> predicate) {
        list.stream().filter(predicate).forEach(n -> System.out.print(n + ", "));
        System.out.println();
    }
}
