package functional.programming.practice.jan19;

public class ReverseWordsInString {
    public static void main(String[] args) {
        //    input : String input = "Today is Monday";
//    Output : "Monday is Today".
//    Do not use any utility methods except toCharArray() or charAt() methods.
        String input = "Today is Monday";
        System.out.println(reverseWordsOfSentence(input));

        //using build in method
        String[] arr = input.split(" ");
        String output = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            output += arr[i] + " ";
        }
        System.out.println(output);
    }
    private static String reverseWordsOfSentence(String input) {

        String reversed = "";
        int index = input.length();

        for (int i = input.length() - 1; i >= 0; i--) {

            if (input.charAt(i) == ' ' || i == 0) {

                for (int j = i; j < index; j++) {
                    reversed = reversed + input.charAt(j);
                }
                index = i;
                reversed = reversed + " ";
            }
        }
        return reversed;
    }
}
