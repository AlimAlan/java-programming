package day_40_array_list;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();      //Pollymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = "+nums.size());
        nums.add(1);
        nums.add(8);
        nums.add(0);
        nums.add(88);
        nums.add(77);
        nums.add(74);
        nums.add(12);
        nums.add(11);
        nums.add(34);
        System.out.println("nums = "+nums);
        nums.remove(0);
        System.out.println(nums);
       // nums.remove(88);  ==>  index 88 => IndexoutOfBound
       nums.remove(new Integer(88));      //removes number 88, not 88th index
        System.out.println(nums);

        for(int i=0; i< nums.size(); i++){
            System.out.println(nums.get(i));
        }
        for(int each:nums){
            System.out.print(each+" ");
        }





    }
}
