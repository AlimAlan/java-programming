package Practice;

import java.util.Arrays;

/**
 * Write a return method that can concat two arrays
 */
public class ConcatTwoArrays {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8,9};

        System.out.println(Arrays.toString(mergedArr(arr1,arr2)));
    }
    public static int[] mergedArr(int[] arr1,int[] arr2){
        int length= arr1.length+arr2.length;
        int[] merged = new int[length];

        for (int i = 0,j=0; i < length; i++) {
            if(i<=arr1.length-1){
                merged[i]=arr1[i];//012
            }
            if(i>=arr1.length){
                merged[i]=arr2[j];
                j++;
            }
        }
        return merged;
    }
}
