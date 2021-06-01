package replit;
import java.util.*;
public class LongestPalindrome {
    public static void main(String[] args) {
        String[] input = {"java", "longest world", "civic", "apple", "racecar", "mom", "anna"};
        System.out.println(longestPalindrome(input));

    }

    public static String longestPalindrome(String[] words) {

        String index = "";
        String palindrome="";

        for (int i = 0; i < words.length; i++) {    //outer loop: check all indexes
            boolean isPalindrome = true;
            for (int j = 0; i < words[i].length(); j++) {       //inner loop: check the length of each index by itself
                index = words[i];
                if(index.charAt(j) !=index.charAt(index.length()-j-1)){
                    isPalindrome=false;
                    break;
                }
            }
            if(isPalindrome && index.length()>palindrome.length()){
                palindrome=index;

            }
        }
        for(int i=0; i<words.length;i++){
            if(palindrome.length()==words[i].length()){
                palindrome+=", "+words[i];
            }
        }
        return palindrome;
    }
}