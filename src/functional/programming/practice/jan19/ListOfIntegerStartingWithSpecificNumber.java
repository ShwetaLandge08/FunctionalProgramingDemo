package functional.programming.practice.jan19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfIntegerStartingWithSpecificNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 4, 3, 7, 6, 8, 9, 12, 15, 13, 56, 17, 87);
        List<Integer> listOfNumberStartingWithGivenNumber = getListOfNumberStartingWithGivenNumber(list, 1);
        System.out.println(listOfNumberStartingWithGivenNumber);
    }

    private static List<Integer> getListOfNumberStartingWithGivenNumber(List<Integer> list, int n) {
        return list.stream().map(s -> s + "")
                .filter(c -> c.startsWith(String.valueOf(n)))
                .map(a -> Integer.valueOf(a))
                .collect(Collectors.toList());
    }
}
