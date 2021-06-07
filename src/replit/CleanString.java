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
        String badWord="one, two,three,two";
        String cleanWord="";

        for(int i=0;i<badWord.length();i++){
            if(i==i+1){
                cleanWord+=i;
                System.out.println();
            }
        }


    }
}
