package officeHours;
import java.util.Scanner;

/* Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.

 */
public class PracticeHasJava {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String word=scan.next();
        if(word.contains("java")){
            System.out.println(word.length());
        }

    }
}
