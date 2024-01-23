package functional.programming.practice.jan23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SequenceOfCharacter {
    public static void main(String[] args) {
//        Write a java program to generate the sequences based on the length passed as an input, from
//        the given input string.
//        For example, if the input string is “abc”, and input length is 2, then the output must be {ab,bc}
//        only (only the consecutive sequences allowed)
//        If the input is “abcde” and length is 3, then output must be {abc, bcd, cde}
        String input = "abcde";
        List<String> sequenceOfStringWithGivenLength = getSequenceOfStringWithGivenLength(input, 3);
        System.out.println(sequenceOfStringWithGivenLength);
    }

    private static List<String> getSequenceOfStringWithGivenLength(String input, int length) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i <= input.length() - length; i++) {
            String output = input.substring(i, i + length);
            stringList.add(output);
        }
        //in case if you didn't given : i <= input.length() - length. instead provided this : i < input.length() - length
        //stringList.add(input.substring(input.length() - length));
        return stringList;
    }
}
