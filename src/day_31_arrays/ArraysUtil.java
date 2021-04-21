package day_31_arrays;
import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[]args){
        Integer []nums={100,5,1,7,0,-4,44,33};
        System.out.println(Arrays.toString(nums));  //converted ARRAYs to String


        //sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: "+nums[0]);
        System.out.println("max value: "+nums[nums.length-1]);

       // Arrays.sort(nums, Collections.reverseOrder());


        String []words={"java","C#","C++","Kotlin","Python","Ruby","Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(",",words)+"]");
        Arrays.sort(words);  //sort words in alphabetic and ASCII order
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));








    }
}
