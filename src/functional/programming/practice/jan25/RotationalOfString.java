package functional.programming.practice.jan25;

public class RotationalOfString {
    public static void main(String[] args) {
//        How to check if one String is rotation of another String in java
        System.out.println(isRotation("java2blog", "blogjava2"));
    }
    private static boolean isRotation(String s1,String rotationString){
        String s2 = s1+s1;
        System.out.println(s2);
        return s2.contains(rotationString);
    }
}
