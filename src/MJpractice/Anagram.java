package MJpractice;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        int num = 0;
        isArmstrong(num);
    }

    public static void isArmstrong(int n) {

        // num = 153 / 10

        // n / 10 = 15
        // 15 / 10 = 1
        // 1 / 10 = 0.1 ==> 0

        // num = 1234
        // 1234 / 10 = 123
        // 123 / 10 = 12
        // 12 / 10 = 1
        // 1/ 10 =0

        // 153
        while (n <= Integer.MAX_VALUE) {

            int copyNum = n;
            int count = 0;
            while (copyNum > 0) {
                count++;
                copyNum /= 10;
            }
            copyNum = n;
            int armstrong = 0;
            while (copyNum > 0) {
                int lastDigit = copyNum % 10; // ==> 3
                armstrong += Math.pow(lastDigit, count); // lastDigit ^ count ==> 1^3
                copyNum /= 10;
            }
            // copyNum = 153 --> 15 --> 1 --> 10
            // count   = 3
            // lastDigit = 3 --> 5 --> 1
            // armstrong = 27 + 125 + 1
            if (n == armstrong) {
                System.out.println(armstrong);
            }


            n++;
        }


    }
}