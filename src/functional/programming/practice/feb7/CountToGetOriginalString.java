package functional.programming.practice.feb7;

public class CountToGetOriginalString {
    //    input :
//    String s = abcd
//    harry input int h = 1
//    peter input int p = 2
//
//    output : 3
//
//    Explanation :
//    abcd
//
//            dabc
//    bcda
//            abcd
//
//    we need to break the string for inputs one by one. we need to perform this operation until we get original string count no of turns.
    public static void main(String[] args) {
        String s = "abcde";
        int harry = 2;
        int peter = 2;
        String output;
        String sub;
        int count = 0;
        int h = s.length() - harry;
        int p = s.length() - peter;
        sub = s.substring(0, h);
        output = s.substring(h) + sub;
        count++;

        while (!s.equals(output)) {

            sub = output.substring(0, p);
            output = output.substring(p) + sub;
            count++;

            sub = output.substring(0, h);
            output = output.substring(h) + sub;
            count++;
        }
        System.out.println(output);
        System.out.println(count);
    }
}
