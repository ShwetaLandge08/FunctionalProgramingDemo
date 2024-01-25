package functional.programming.practice.jan24;

public class RemoveVowelsFromString {
    //    How to remove all vowels from a string in Java
    public static void main(String[] args) {
        String input = "Java Concept Of The Day";
        input = input.replaceAll("[aeiou]", "");
        System.out.println(input);
    }
}
