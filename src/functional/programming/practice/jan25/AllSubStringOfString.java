package functional.programming.practice.jan25;

public class AllSubStringOfString {
    public static void main(String[] args) {
//        Find all substrings of a String in java
        String input = "abbc";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                System.out.println(input.substring(i,j));
            }
        }
    }
}
