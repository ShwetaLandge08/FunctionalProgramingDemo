package functional.programming.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringQuestions {
    public static void main(String[] args) {
//        WAP to reverse string with below condition
//        1.Vowels positions should not change.
//        2.space should not change.
        String input = "space should not change";
        char[] charArray = input.toCharArray();
        StringBuilder output = new StringBuilder();
        StringBuilder vowels = new StringBuilder();
        StringBuilder otherCharacter = new StringBuilder();
        for (char c : charArray) {
            if (isVowel(c)) {
                vowels.append(c);
            } else if (Character.isWhitespace(c)) {
                vowels.append(c);
            } else {
                otherCharacter.insert(0, c);
            }
        }
        int vowelIndex = 0;
        for (char c : charArray) {
            if (isVowel(c) || Character.isWhitespace(c)) {
                output.append(vowels.charAt(vowelIndex));
                vowelIndex++;
            } else {
                output.append(otherCharacter.charAt(0));
                otherCharacter.deleteCharAt(0);
            }
        }
        //System.out.println(output);

//       WAP to find occurrence of words in String:
//        Input : HOW ARE YOU WHERE ARE YOU
//        Output:
//        HOW 1
//        ARE  2
//        YOU 2
//        WHERE 1
        String in = "HOW ARE YOU WHERE ARE YOU";
        String[] arrString = in.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String value : arrString) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else map.put(value, 1);
        }
        //map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        //Write a program to count the number of words in the given string:
        String test = "Hello World Nischith";
        int countOfWhiteSpace = 0;
        for (int i = 0; i < test.length(); i++) {
            if (Character.isWhitespace(test.charAt(i))) {
                countOfWhiteSpace++;
            }
        }
        countOfWhiteSpace++;
        //System.out.println("number of words in the given string: " + countOfWhiteSpace);


//        Write a program to reverse the words in the given string, without using any additional variable.
//        Given:
//        String name = "I love my India"
//        Expected output = "India my love I"
        String name = "I love my India";
        String[] inp = name.split(" ");
        String expectedOutput = "";
        for (int i = inp.length - 1; i >= 0; i--) {
            expectedOutput += inp[i] + " ";
        }
        //System.out.println(expectedOutput);

    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
                c == 'u' || c == 'U';
    }
}
