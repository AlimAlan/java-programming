package replit;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String word1="";
        for(int i=0; i<count;i++){
          word1+=word+separator;

        }
        System.out.println(word1.substring(0,word1.length()-1));
    }
}
