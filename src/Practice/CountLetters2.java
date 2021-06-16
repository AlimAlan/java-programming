package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountLetters2 {
    public static void main(String[] args) {
        String letter = "aaabbccccc";

        List<String> letter1 = new ArrayList<>(Arrays.asList(letter.split("")));
        System.out.println(letter1);

        int a = Collections.frequency(letter1,"a");
        int b = Collections.frequency(letter1,"b");
        int c = Collections.frequency(letter1,"c");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
