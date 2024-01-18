package functional.programming.practice.jan17;

public class SwapTwoStringWithoutThirdVariable {
    public static void main(String[] args) {
        String s1 = "shweta";
        String s2 = "landge";
        System.out.println(s1 + " " + s2);

        //method 1
        s1 = s1 + " " + s2;
        int index = s1.indexOf(' ');
        s2 = s1.substring(0, index);
        s1 = s1.substring(index + 1);
        System.out.println(s1 + " " + s2);

        //method 2
        int s1Length = s1.length();
        int s2Length = s2.length();
        s1 = s1 + s2;
        s2 = s1.substring(0, s1Length);
        s1 = s1.substring(s2Length);
        System.out.println(s1 + " " + s2);
    }
}
