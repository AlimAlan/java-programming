package replit;
import java.util.*;

public class ArraysShortWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};


        String shortWord=str[0];
        for (String each:str) {
            if(each.length()<shortWord.length()){
               shortWord=each;
            }

        }
        System.out.println(shortWord);
    }
}
