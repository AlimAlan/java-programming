package replit;

import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word ");         // apple   -> aple
        String word = scan.next();                   //a p p l e
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if(!newWord.contains(word.charAt(i)+"")){
                newWord+=word.charAt(i)+"";
            }

        }
        System.out.println(newWord);
    }

}
