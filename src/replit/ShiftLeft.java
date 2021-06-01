package replit;
import java.util.*;
public class ShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
       int[] numsShifted=new int[size];
        for (int i = 0; i <size-1 ; i++) {
            numsShifted[i]=nums[i+1];

        }
        numsShifted[size-1]=nums[0];
        System.out.println(Arrays.toString(numsShifted));
        }

        }


        //System.out.println(Arrays.toString(nums) + temp);

