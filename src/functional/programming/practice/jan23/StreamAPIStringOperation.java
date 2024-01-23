package functional.programming.practice.jan23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIStringOperation {
    //    Convert String to Uppercase and join them using coma
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Shweta", "Snehal", "Mounesh", "samruddha", "Durga", "Shreyashi");
        String collect = stringList.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(collect);
    }

}
