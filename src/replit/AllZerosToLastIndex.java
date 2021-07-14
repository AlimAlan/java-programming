package replit;

import java.util.Arrays;

/**
 * Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
 * Ex:input:  {1,0,2,0,3,0,4,0};
 * output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class AllZerosToLastIndex {
    public static void main(String[] args) {
        int[] num = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println(Arrays.toString(sortArr(num)));
    }
    public static int[] sortArr(int[] num) {
        int[] newArr = new int[num.length];
        int x = 0;
//        int y = num.length - 1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                newArr[x] = num[i];
                x++;
            }
//            if (num[i] == 0) {
//                newArr[y] = num[i];
//                y--;
//            }
        }
        return newArr;

    }
}
