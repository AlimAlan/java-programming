package replit;
import java.util.*;
/*
This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.
EX=> clean ("one two three","two")

returns "one three"
 */
public class CleanString {
    public static void main(String[] args) {
        String text="one two three";
        String badWord="two";


       String [] a=text.split(badWord);
        System.out.println(Arrays.toString(a));
        String cleanWord=String.join("",a);
        System.out.println(cleanWord);


//        for (String each :a ){
//            cleanWord+=each;
//
//        }
      //  System.out.println(cleanWord);



    }
}
