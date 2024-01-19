package functional.programming.practice.jan18;

public class BracketValidation {
    //    Bracket validation i/p "{()}[]" o/p "Balanced" OR i/p "{(a)}[[]" o/p "Not Balanced"s
    public static void main(String[] args) {

    }

    private static boolean isValidBracket(String s) {
        int i = -1;
        char[] stack = new char[s.length()];
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack[++i] = ')';
            else if (c == '{')
                stack[++i] = '}';
            else if (c == '[')
                stack[++i] = ']';
            else if (i >= 0 && stack[i] == c)
                i--;
            else
                i = 1;
        }
        return i == -1;
    }
}
