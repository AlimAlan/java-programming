package replit;

import java.util.Arrays;
import java.util.*;
public class AddElements {
         public static int[] addElements(int[] ints1, int[] ints2) {
//         int[]temp=ints1[0]+ints2.length;
//         return temp;

             int []temp=new int[5];
             for (int i=0; i<temp.length;i++){
                 int tempNum=ints1[i]+ints2[i];
                 temp[i]=tempNum;
             }
             return temp;
         }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        int[] nums2 = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(addElements(nums, nums2)));
    }
}