package replit;

import java.util.Scanner;

/**
 * This method gets a string and an int, it returns a string.
 *
 * The method will limit the given String by a certain amount of characters(given int)
 */
public class LimitString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(limit(in.nextLine(), in.nextInt()));
    }
    public static String limit(String text, int maxLength) {
        // String text="abcd";
        // int count=2;
        String wordCombination = "";
        for (int i = 0; i <maxLength; i++) {
            // System.out.println(word.charAt(i));
            wordCombination += text.charAt(i) + "";
          //  System.out.print(wordCombination);
        }
        return wordCombination;
    }
}