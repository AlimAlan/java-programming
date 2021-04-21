package replit;
import java.util.Scanner;
/**
 * Print true if the string "cat" and "dog" appear the same number of times in the given string word.
 * catdogcatfjajcat
 */

public class CatAndDogs {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int CountOfDogs=0;
        int CountOfCats=0;
        String word=scan.nextLine();

        for(int i =0; i<word.length()-2; i++){
            String catOrDog=word.substring(i,i+3);
            if(catOrDog.equals("cat")) {
                CountOfCats++;
            }
                if(catOrDog.equals("dog")){
                    CountOfDogs++;
                }


        }
        System.out.println(CountOfCats==CountOfDogs);





    }
}
