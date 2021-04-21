package replit;
import java.util.*;
/**
 * Given a String, use a loop to print every character from the String on a new line.
 */
public class PrintEach {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
       for(int i=0; i<word.length();i++){
           System.out.println(word.charAt(i));
        }

    }
}
