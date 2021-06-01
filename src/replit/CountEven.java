package replit;
import java.util.*;
/**Given an array nums, count and print the number of even numbers in the array
 nums → [2, 1, 2, 3, 4]) → 3

 nums → [2, 2, 0, 3, 5]) → 3

 nums → [1, 3, 5, 7, 9]) → 0
 */
public class CountEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count=0;
        for(int each:nums){
            if(each % 2==0){
                count+=each;

            }else{
            //    System.out.println(0);
            }

        }
        System.out.println(count);
    }
}
