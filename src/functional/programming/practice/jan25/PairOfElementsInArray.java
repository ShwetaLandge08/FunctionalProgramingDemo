package functional.programming.practice.jan25;

public class PairOfElementsInArray {
    public static void main(String[] args) {
//        Find all pairs of elements from an array whose sum is equal to given number
//        Given a  array,we need to find all pairs whose sum is equal to number X.
//        For example:
//        array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
//        Pair of elements whose sum is equal to 15 :  7, 8 and -5, 20
        int[] array={ -40, -5, 1, 3, 6, 7, 8, 20 };
        findPairsOfElementsInArrayWithSumEqualToGivenNumber(array,15);
    }
    private static void findPairsOfElementsInArrayWithSumEqualToGivenNumber(int[] arr,int sum){
        if(arr.length<2) {
            System.out.println("Can't get element as arr length is less");
        }
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j< arr.length;j++){
                    if(arr[i]+arr[j]==sum){
                        System.out.println("Pair of elements whose sum is equal to " + sum + " : "+ arr[i] + ", " +arr[j]);
                    }
                }
            }
    }
}
