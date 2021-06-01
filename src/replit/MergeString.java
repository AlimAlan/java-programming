package replit;
import java.util.Scanner;
public class MergeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
        // for(int i=0; i<=word.length();i++){
        //      for(int a=0; a<=word2.length();a++){
        // System.out.print(word.charAt(i)+""+word2.charAt(a));
    }
    public static String mergeStrings(String one, String two) {
        String word = "";

        if (one.length() < two.length()) {
            for (int i = 0; i < one.length(); i++) {
                //word += i;
                word += one.charAt(i) + "" + two.charAt(i);
            }
            word = word + two.substring(one.length());
             }
        if(two.length()<one.length()) {
            for (int a = 0; a < two.length(); a++) {
                // word+=a;
                word += one.charAt(a) + "" + two.charAt(a);

                //  System.out.println(word.charAt(i));
                }
                word = word + one.substring(two.length());
                }
                return word;
            }
        }