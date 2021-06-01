package replit;
import java.util.*;
public class FindMaxLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        String longWord = words[0];
        for(int i=0; i< words.length;i++){
            String currentWord=words[i];
            if(currentWord.length()>longWord.length()){
                longWord=currentWord;
            }

        }

        System.out.println(longWord);
    }
}







