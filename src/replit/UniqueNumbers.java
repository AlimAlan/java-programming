package replit;
import java.util.*;
public class UniqueNumbers {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
       // int size = scan.nextInt();
       int nums[] ={3,7,7,4,3,5,5,3};                      //3  4  3  5  5

        for (int i = 0; i < nums.length; i++) {                   //0              //1
            int count=0;
           for(int j=0; j < nums.length; j++){                    //0 1 2 3 4      // 0 1 2 3 4
               if(nums[i]==nums[j]){
                   count++;
               }
           }
           if(count==1){
               System.out.println(nums[i]);
           }
          //  System.out.println(nums[i]);


    }


    }
}