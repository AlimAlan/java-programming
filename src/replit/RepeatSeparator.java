package replit;

import java.util.Scanner;

/**
 * Given two strings, word and a separator sep,
 * return a big string made of count occurrences of the word, separated by the separator string.
 *
 * Example:
 * input:
 * Word
 * X
 * 3
 *
 * output: WordXWordXWord
 */
public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String word1="";
        for(int i=0; i<count;i++){
            word1+=word+separator;


        }
        System.out.println(word1.substring(0,word1.length()-1));

    }
}
