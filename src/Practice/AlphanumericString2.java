package Practice;

import java.util.Arrays;

/**
 * Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
 * Ex:
 * Input:  "DC501GCCCA098911"
 * OutPut: "CD015ACCCG011899"
 */
public class AlphanumericString2 {
    public static void main(String[] args) {


    String word = "DC501GCCCA098911";
    String temp = "";
    String finalResult = "";
    String[] result = word.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
    //[DC, 501, GCCCA, 098911]


        for(
    int i = 0;
    i<result.length;i++)

    {
        temp = result[i] + "";
        char[] chars = temp.toCharArray();
        Arrays.sort(chars);
        temp = String.valueOf(chars);
        finalResult += temp + "";
    }
        System.out.println(finalResult);
}
}
