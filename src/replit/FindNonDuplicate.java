package replit;
import java.util.*;
public class FindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

       //  int checked=nums[0];
        for (int i=0; i<nums.length;i++){
            int nonDup=0;
         for(int each:nums){
             if(each==nums[i]) {
                 nonDup++;
             }
                 }
         if(nonDup==1){
             System.out.println(nums[i]);
         }
             }
       // System.out.println(nonDup);
         }
    }

