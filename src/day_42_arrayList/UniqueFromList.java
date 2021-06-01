package day_42_arrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums =new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        System.out.println(nums);
        List<Integer> uniqueList = getUniqueList(nums);
        System.out.println("\nUnique list = "+uniqueList);
    }
    public static List<Integer> getUniqueList(List<Integer> nums) {
        //new arraylist to store only unique numbers
        List<Integer> uniqueList=new ArrayList<>();
        //loop through the list
        for(int each: nums){
            //check if number appears only once in the list
          //  System.out.print(each+" ");
            if(Collections.frequency(nums, each)==1){
                //print that number
                System.out.print(each+ " ");
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
