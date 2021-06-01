package replit;

/**
 * This method accept two strings (text and badWord) and returns a string.
 *
 * The method will take out all the occurrences of badWord in the text.
 */
import java.util.*;
public class Stringcleaning {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(clean(in.nextLine(),in.nextLine()));


    }
    public static String clean(String text, String badWord){
        String goodWord="";
        String []strArr=text.split(" ");
        for (int i=0; i< strArr.length;i++){
            for(int j=0; j< strArr.length;j++){
                if(strArr[i]!=strArr[i]){
                    goodWord+=strArr[i];
                }

            }

        }
        return goodWord;
    }
}
