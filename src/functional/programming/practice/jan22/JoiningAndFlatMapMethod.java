package functional.programming.practice.jan22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningAndFlatMapMethod {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("AWS", "JavaScript", "Kubernetes", "Microservices", "Frameworks");
        System.out.println(stringList.stream().collect(Collectors.joining(", ")));
        System.out.println(stringList.stream().collect(Collectors.joining(" ")));

        //flatMap
        System.out.println(stringList.stream().map(s -> s.split(""))
                .flatMap(Arrays::stream).collect(Collectors.toList()));

        System.out.println(stringList.stream().map(s -> s.split(""))
                .flatMap(Arrays::stream).distinct().collect(Collectors.toList()));

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2, 3));
        list.add(Arrays.asList(4, 5, 6));
        list.add(Arrays.asList(7, 8, 9));
        list.add(Arrays.asList(10, 11, 12));
        System.out.println(list.stream().flatMap(Collection::stream).collect(Collectors.toList()));

        List<String> stringList1 = Arrays.asList("AWS", "JavaScript", "Kubernetes", "Microservices", "Frameworks");
        System.out.println(stringList.stream()
                .flatMap(string -> stringList1.stream().map(str -> List.of(str, string)))
                .collect(Collectors.toList()));

        System.out.println(stringList.stream()
                .flatMap(string -> stringList1.stream().map(str -> List.of(str, string)))
                .filter(li -> li.get(0).equals(li.get(1)))
                .collect(Collectors.toList()));

        System.out.println(stringList.stream()
                .flatMap(string -> stringList1.stream().map(str -> List.of(str, string)))
                .filter(li -> !li.get(0).equals(li.get(1)))
                .collect(Collectors.toList()));

        System.out.println(stringList.stream()
                .flatMap(string -> stringList1.stream().filter(c1 -> c1.length() == string.length())
                        .map(str -> List.of(str, string)))
                .filter(li -> !li.get(0).equals(li.get(1)))
                .collect(Collectors.toList()));
    }
}
