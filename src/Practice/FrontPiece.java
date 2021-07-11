package Practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an int array num of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
 *
 * Examples:
 */
public class FrontPiece {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] num=new int [size];
        for(int i=0; i<size;i++){
            num[i]=scanner.nextInt();
        }
        int[]newArr;
        if(num.length>=2){
          newArr=new int[2];
            num[0]=newArr[0];
            num[1]=newArr[1];
        }else {
            newArr=new int[1];
            num[0]=newArr[0];
       //     num[0]=newArr[1];
        }
        System.out.println(Arrays.toString(newArr));

    }
}
