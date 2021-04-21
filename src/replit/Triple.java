package replit;
/**
 * We'll say that a "triple" in a string is a char appearing three times in a row.
 *         Print out the number of triples in the given string. The triples may overlap.
 */
import java.util.*;
public class Triple {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        for(int i=0; i<str.length()-2; i++) {

            String triples = str.charAt(i) + "" + str.charAt(i) + "" + str.charAt(i);
            if (str.substring(i, i + 3).equals(triples)) {
            count++;
        }
        }
        System.out.println(count);

    }
}
