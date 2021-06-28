package Practice;

import java.util.Arrays;

/**
 * Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
 * Input:  "DC501GCCCA098911"
 * OutPut: "CD015ACCCG011899"
 */
public class AlphanumericString {
    public static void main(String[] args) {


        String word = "DC501GCCCA098911";
        String temp = "";
        String result = "";

        for (int i = 0; i <= word.length(); i++) {
            char each = word.charAt(i);

            if (i == word.length() - 1) {
                temp += word.charAt(i);
                char[] arr = temp.toCharArray();
                Arrays.sort(arr);
                result += String.valueOf(arr);
                break;
            }

            if (Character.isLetter(each)) {
                temp += "" + each;
                if (!Character.isLetter(word.charAt(i + 1))) {
                    char[] arr = temp.toCharArray();
                    Arrays.sort(arr);
                    result += String.valueOf(arr);
                    temp = "";
                }
            }

            if (Character.isDigit(each)) {
                temp += "" + each;
                if (!Character.isDigit(word.charAt(i + 1))) {
                    char[] arr = temp.toCharArray();
                    Arrays.sort(arr);
                    result += String.valueOf(arr);
                    temp = "";
                }
            }


        }

        System.out.println(result);

    }
}