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

        String[]goodWord=text.split(" ");
        System.out.println(Arrays.toString(goodWord));
       for (int i=0;i<goodWord.length;i++){
          if(goodWord.equals(badWord)){

           }

        }


//        for (int i=0; i<goodWord.length;i++){
//            if(!goodWord.equals(badWord)){
//                System.out.println(Arrays.toString(goodWord));
            }
        }











