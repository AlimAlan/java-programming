package Practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "Listen";
        String word2 = "silent";

        System.out.println(isAnagram(word1, word2));
    }

    public static boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        String[] word1Arr = word1.split("");
        String[] word2Arr = word2.split("");

        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        if (Arrays.equals(word1Arr, word2Arr)) {
            return true;
        } else {
            return false;
        }
    }
}
