package functional.programming.practice.jan18;

public class VowelChecking {
    public static void main(String[] args) {
        String input = "check if vowel is present in string or not";
        input = input.toLowerCase();
        boolean matches = input.matches(".*[aeiou].*");
        System.out.println(matches);
    }
}
