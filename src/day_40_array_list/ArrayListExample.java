package day_40_array_list;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        System.out.println("size => "+nums.size());

        System.out.println("first num => "+nums.get(1));
        System.out.println("second index => "+nums.get(2));

        System.out.println(nums);    //Arrays.toString(numArray)

        nums.remove(1);    //remove element at index 1
        System.out.println(nums);

    }
}
