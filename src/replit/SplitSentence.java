package replit;
import java.util.*;
public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String []newSentence=sentence.split(" ");
        System.out.println(sentence);


    }
}