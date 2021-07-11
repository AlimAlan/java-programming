package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Finish the combineRs method to combine the two given String arrays into one arraylist and return the arraylist.
 *
 * for example:
 * combineRs(["f","o","o"],[" b","a","r"])
 *
 * returns [f, o, o, b, a, r]
 */
public class CombineArrays {
    public static void main(String[] args) {
        String []arr={"f","a","r","b"};
        String []arr2={"t","t","e","r",};
        List<String> arr3=new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            arr3.add(arr[i]);
            arr3.add(arr2[i]);
        }
//        for(int j=0; j<arr2.length;j++){
//            arr3.add(arr2[j]);
//        }

        System.out.println(arr3);
    }
}
