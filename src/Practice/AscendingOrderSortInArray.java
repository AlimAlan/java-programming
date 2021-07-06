package Practice;

import java.util.Arrays;

/**
 * Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
 * Ex:      int[] arr = {10, 9, 8, 7};
 *          arr = Sort(arr);   ⇒  { 7, 8, 9, 10};
 */
public class AscendingOrderSortInArray {
    public static void main(String[] args) {
        //1 first assign temp variable
        //nested for loop
        //the first will take the one element from the array
        //compare with the other element -> each element ==> exchange the value
        int[] arr = {10, 9, 8, 7,35,2,230,4,33,-1};
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
