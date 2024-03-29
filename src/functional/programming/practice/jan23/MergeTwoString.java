package functional.programming.practice.jan23;

public class MergeTwoString {
    public static void main(String[] args) {
//        You are merging data from two sources connected to a network access point to create a new
//                data packet.
//                You must merge strings a and b, and then return a single merged string. A merge operation on
//        two strings is described as follows:
//        Append alternating characters from a and b, respectively, to some new string, mergedString.
//                Once all of the characters in one of the strings have been merged, append the remaining
//        characters in the other string to mergedString.
//                As an example, assume you have two strings to merge: 'abc' and 'stuvwx'. Alternate between
//        the first and second strings as long as you can:
//        'a' + 's' + 'b' + 't' + 'c' + 'u'. At this point you have traversed the first string and have generated
//        'asbtcu'. The remainder of the second string, 'vwx' is now added to the end of the string,
//                creating 'asbtcuvwx'.
//                Function Description
//        Write the function mergeStrings. The function must return the merged string.
//        mergeStrings has the following parameter(s):
//        a: first string
//        b: second string
        System.out.println(getMergeString("abcdef", "stu"));//asbtcudef
        System.out.println(getMergeString("abc", "stuvwx"));//asbtcuvwx
    }

    private static String getMergeString(String s1, String s2) {
        StringBuilder res = new StringBuilder();
        int l1 = s1.length();
        int l2 = s2.length();
        int size;
        if ((l1 - l2) > 0) {
            size = l2;
        } else size = l1;
        for (int i = 0; i < size; i++) {
            res.append(s1.charAt(i)).append(s2.charAt(i));
        }
        if (l1 > l2) {
            res.append(s1.substring(l1 - l2));
        } else
            res.append(s2.substring(l2 - l1));
        return res.toString();
    }
}
