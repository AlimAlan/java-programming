package Practice;

import java.util.Arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8,9};           //2  4   6    8   even
        int even=0;                                       //1  3   5    7   odd
        int odd=0;
        for (int each:num) {
            if(each%2==0){
                even++;
                System.out.print(each+" Even Number");

            }else if(each%2==1){
                odd++;
                System.out.println();
                System.out.print(each+" Odd Number");
            }

        }
      //  System.out.println(even+ " even number ");
      //  System.out.println(odd+"   odd number");

    }
}
