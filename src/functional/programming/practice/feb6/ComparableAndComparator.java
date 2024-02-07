package functional.programming.practice.feb6;

import java.util.Comparator;

public class ComparableAndComparator {

    public static void main(String[] args) {
        int i1 = 24;
        Comparator<Integer> comparator = (o1, o2) -> {
            if (o1 > o2) {
                return o1;
            } else
                return o2;
        };
        Comparable<Integer> comparable = o -> {
            if (o > i1) {
                return o;
            } else
                return i1;
        };
        System.out.println(comparator.compare(12, 16));
        System.out.println(comparable.compareTo(23));
    }
}
