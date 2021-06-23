package Practice;
//import java.util.*
/**
 * Write a method that can find the maximum number from an int Array
 */
public class BiggestNumInArray2 {
    public static void main(String[] args) {
        int nums[]={1,23,76,45,43,987};
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            if (temp <nums[i]) {
                temp=nums[i];
            }

        }
        System.out.println(temp);
    }
}
