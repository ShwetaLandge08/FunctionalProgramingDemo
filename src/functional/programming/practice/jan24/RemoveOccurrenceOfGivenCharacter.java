package functional.programming.practice.jan24;

public class RemoveOccurrenceOfGivenCharacter {
    public static void main(String[] args) {
//        How do you remove all occurrences of a given character from an input string in Java?

        //method 1
        String str = "abcdABCDabcdABCD";
        System.out.println(str.replace("a", ""));

        //method 2
        System.out.println(removeGivenCharacterFromString(str, 'a'));


    }

    private static String removeGivenCharacterFromString(String str, char c) {
        StringBuilder output = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (!(ch == c))
                output.append(ch);
        }
        return output.toString();
    }
}
