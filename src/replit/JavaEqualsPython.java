package replit;
import  java.util.*;

/**
 * Given a string, print out true if the number of appearances of "java" anywhere
 * in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
 */
public class JavaEqualsPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int charCount=sentence.length();
        int tCharCount=4;
        int javaCNT=0, pythonCNT=0;

        for(int i=0; i<=charCount-tCharCount; i++){
            if(sentence.substring(i,i+tCharCount).equals("java")){
                javaCNT++;
            }
        }
        tCharCount=6;
        for(int i=0; i<=charCount-tCharCount; i++){
            if(sentence.substring(i,i+tCharCount).equals("python")){
                pythonCNT++;
            }
            System.out.println(javaCNT==pythonCNT);
        }

    }
}
