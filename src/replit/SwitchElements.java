package replit;
import java.util.*;
import java.util.Arrays;

public class SwitchElements {
  //  public static void main(String[] args) {
        public static void main(String [] args) {
            Scanner in = new Scanner(System.in);
            int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
//            Arrays.toString(do_switch(arr));
//    }
//    public static int[] do_switch(int []i){
            arr[0]=arr[3];
            arr[3]=arr[0];
            System.out.println(Arrays.toString(arr));

        }

}
