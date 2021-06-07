package replit;

import java.util.Arrays;
import java.util.*;
public class InnerAndOuter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeInner=scan.nextInt();
        int sizeOuter=scan.nextInt();
        int[] outer = new int[sizeOuter];
        int[] inner = new int[sizeInner];

        for (int j = 0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }

        for (int i = 0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        int counterFound=0;
        for(int innerItem: inner){
            for (int outerItem:outer){
                if(innerItem==outerItem){
                    counterFound++;
                    break;
                }
            }
        }
        System.out.println(counterFound==sizeInner);
    }
}