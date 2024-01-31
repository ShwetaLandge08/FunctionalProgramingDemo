package functional.programming.practice.jan25;

public class LengthOfStringWithoutBuildInMethod {
    public static void main(String[] args) {
//        How to find length of string in java without using length() method
        String input= "This is hello world";
        int length = 0;
        for(char c: input.toCharArray()){
            length++;
        }
        System.out.println("Length of given string is " + length);
    }
}
