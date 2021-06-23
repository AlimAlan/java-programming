package Practice;

import java.util.Arrays;

public class MergeIntArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};       //1 2 3 4 5 6
        int merged = a.length + b.length;
        int[] mergedArray = new int[merged];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            mergedArray[index] = a[i];
            index++;
        }
        for (int j = 0; j < b.length; j++) {
            mergedArray[index] = b[j];
            index++;
        }

        System.out.println(Arrays.toString(mergedArray));
    }

}
