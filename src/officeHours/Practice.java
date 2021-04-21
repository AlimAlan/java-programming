package officeHours;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = "bill";
        String word2 = "check";
        //WIRTE YOUR CODE HERE
        if (word2.length() <= word1.length()) {
            System.out.println(word1);

        } else {
            System.out.println(word2);

        }
        //public class Main {
        //  public static void main(String[] args) {
        //    Scanner s = new Scanner(System.in);
        String word3 = "java";
        String word4 = "java";

        //your code here
        if (word1.length() == word2.length()) {
            System.out.println("word1 equals word2");
             word3 = "java";
             word4= "jaVa";

        } else if (word3.length() == word4.length()) {
            System.out.println("word1 does not equal word2");

        }
    }

}
