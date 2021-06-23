package replit;

import java.util.Arrays;
import java.util.*;
public class BiggestString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(bigger(in.next(), in.next()));
    }

    public static String bigger(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else {
            return b;
        }

    }
}
