package MJpractice;
import java.util.*;
public class convert {
    public static void main(String[]args){
        String sentence="I have 20 dollars, and borrow $ 15 from my friend and also get $85 cash from ATM, how much money do i have";
        System.out.println(sumChar(sentence));
    }
    public static int sumChar(String str) {
        String num = "0";
        int sum = 0;
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length ;i++) {
            if (Character.isDigit(characters[i])) {
                num += characters[i];

            }
            if (i==characters.length-1 || !Character.isDigit(characters[i + 1])) {
            sum += Integer.parseInt(num);
            num = "0";
        }
    }

        return sum;
    }
}
