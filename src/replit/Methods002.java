package replit;
import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
/**
 * Implement the plus method. The return is void and has no arguments.
 *
 *                 The method should ask the user to input two numbers, then it will add them and print the result.
 *
 *         Hint: Create a scanner within plus method.
 */

public class Methods002 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter first number: ");
        int first=scan.nextInt();
        System.out.println("enter second number: ");
        int second=scan.nextInt();
        System.out.print("result: ");
        plus(first,second);

    }

    public static void plus(int first, int second){
        System.out.println(first+second);







    }
}
