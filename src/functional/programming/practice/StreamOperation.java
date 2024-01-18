package functional.programming.practice;

import javax.xml.transform.stax.StAXSource;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Properties;

public class StreamOperation {
    public static void main(String[] args) {
        //negative n/2
        //positive and even n*2
        //odd and positive n
        int[] arr = {1, 2, 5, 7, 5, -7, 3, 8};
        int sum = Arrays.stream(arr).map(n -> n < 0 ? n / 2 : (n % 2 == 0 ? n * 2 : n)).sum();
        System.out.println(sum);

        OptionalInt min = Arrays.stream(arr).min();
        int input = 123;

//        Optional<String> optional = Optional.of("");
//        System.out.println(optional.isEmpty());

        // System.out.println(Arrays.stream(arr).min());
        System.out.println(Arrays.stream(arr).max());
    }
}
