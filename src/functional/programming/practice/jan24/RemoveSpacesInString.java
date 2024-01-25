package functional.programming.practice.jan24;

public class RemoveSpacesInString {
    public static void main(String[] args) {
        //    How do you remove spaces from a string in Java?
        String input = "Remove Space Between String";
        char[] charArray = input.toCharArray();
        StringBuilder output = new StringBuilder();
        for (char c : charArray) {
            if (!Character.isWhitespace(c)) {
                output.append(c);
            }
        }
        System.out.println(output);

//        How do you remove leading and trailing spaces from a string in Java?
        String ip = "  abc def/  ";
        System.out.println(ip.strip());
        String ip1 = "  abcd def/  ";
        System.out.println(ip1.trim());
    }
}
