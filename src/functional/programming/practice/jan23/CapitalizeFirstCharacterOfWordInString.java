package functional.programming.practice.jan23;

public class CapitalizeFirstCharacterOfWordInString {
    //    capitalize the first letter of each word in string
    //      input string = ' how are you';
    //      output ; How Are You
    public static void main(String[] args) {
        String input = "how are you";
        String output = "";
        for (String s : input.split(" ")) {
            output += (s.substring(0, 1).toUpperCase()) + (s.substring(1)) + " ";
        }
        System.out.println(output);
    }
}
