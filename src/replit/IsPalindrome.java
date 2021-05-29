package replit;
import java.util.*;
/**
 * 4. String palindrome.
 *  // isPal("anna")   -> true
 *   // isPal("civic")  -> true
 *   // isPal("apple")  -> false
 *   // isPal("level")  -> true
 */
public class IsPalindrome {
    public static void main(String[] args) {
        boolean isPalindrome=true;
        Scanner scan=new Scanner(System.in);  //1     4           //1      5
        String word=scan.next();             // an   na           //ap   ple
       for(int i=0;i<word.length()/2;i++){
           if(word.charAt(i)!=word.charAt(word.length()-1-i)){
               isPalindrome=false;
               break;
           }

       }
        System.out.println(isPalindrome);

    }
}
