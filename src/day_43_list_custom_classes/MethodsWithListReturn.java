package day_43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        //1 nanosecond=1_000_000_000 of a second
        //1 second =1_000_000_000 nanoseconds
        long start=System.nanoTime();
       // System.out.println(System.nanoTime());
        List<Integer> mlnNums=getIntegerList();     //returns ready ArrayList object. no need new ArrayList
        long end=System.nanoTime();
        double listSeconds=(end-start)/1_000_000_000.0;
        System.out.println("ArrayList time= "+(end-start));
        System.out.println("ArrayList seconds = "+listSeconds);
        long st=System.nanoTime();
        int[]arr=getIntegerArray();
        long en=System.nanoTime();
        double seconds=(en-st)/1_000_000_000.0;
        System.out.println("Array time = "+(en-st));
        System.out.println("Array time second = "+seconds);
       // System.out.println(mlnNums);


    }
        /**
         * getIntegerList
         * return List<Integer>
         *     loop from 0 -1000-0
         *     and add to arraylist then return it
         *
         */
        public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            nums.add(i);

        }
        return nums;
    }
    public static int[] getIntegerArray(){
        //declare empty array with size - 1_000_001
        int []nums =new int[1_000_001];
        for(int i=0; i<=1_000_000;i++){
            nums[i]=i;
        }
        return nums;

    }

}
