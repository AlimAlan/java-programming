package replit;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The populate method accepts an empty int array and populates it with numbers counting up.
 * populate(new int[3])
 *
 * returns:[1,2,3]
 */
public class PopulateArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []num=new int[new Scanner(System.in).nextInt()];
        System.out.println(Arrays.toString(populate(num)));

    }
    public static int[] populate(int []arr){

        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
return arr;
    }
    }
