package functional.programming.practice.jan23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayOperation {
    public static void main(String[] args) {
        //        Given a list of strings, return a list where each string has "*" added at its end.
//        addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
//        addStar(["hello", "there"]) → ["hello*", "there*"]
//        addStar(["*"]) → ["**"]
        System.out.println(addStar(new String[]{"a","bb","ccc"}));
        System.out.println(addStar(new String[]{"hello", "there"}));
    }
    private static List<String> addStar(String[] arr){
        return Arrays.stream(arr).map(s -> s.concat("*")).collect(Collectors.toList());
    }
}
