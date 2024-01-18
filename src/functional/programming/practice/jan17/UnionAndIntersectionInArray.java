package functional.programming.practice.jan17;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionInArray {
    public static void main(String[] args) {
//        {1,2,3,4,2} {2,3,2} find the intersection and union between two array?
        int[] arr1 = {1, 2, 3, 4, 2};
        int[] arr2 = {2, 3, 2};
        Set<Integer> listOfIntersection = new HashSet<>();
        Set<Integer> listOfUnion = new HashSet<>();
        for (int k : arr1) {
            listOfUnion.add(k);
            for (int i : arr2) {
                listOfUnion.add(i);
                if (k == i) {
                    listOfIntersection.add(i);
                }
            }
        }
        System.out.println("Intersection of two array : " + listOfIntersection);
        System.out.println("Union of two array : " + listOfUnion);
    }
}
