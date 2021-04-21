package day_29_nestedloop_arrays;

import java.util.stream.IntStream;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word="Java";
        for(int i=0;i<word.length(); i++) {
            // System.out.println(word.charAt(i));
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();

        }
        for(int i = 0; i < word.length(); i++) {
            for(int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }


    }
}
