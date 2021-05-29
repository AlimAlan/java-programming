package replit;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] nums = {input.nextInt(),
//                input.nextInt(),input.nextInt(),
//                input.nextInt(),input.nextInt(),
//                input.nextInt(),input.nextInt()};
        int[] nums = {4, 3, 2, 44, 1, 100, 55};
     //   for (int i = 0; i < nums.length; i++) {
            int temp = nums[0];
            nums[0] = nums[6];
            nums[6] = temp;

            temp=nums[0+1];
            nums[0+1]=nums[6-1];
            nums[6-1]=temp;
            temp=nums[0+2];
            nums[0+2]=nums[6-2];
            nums[6-2]=temp;


        System.out.println(Arrays.toString(nums));
    }
}
