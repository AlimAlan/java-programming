package officeHoursPractice03_24_2021;
/*Write a program that will print out information about user based on email.
  Print first name, last name, and domain.
 First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
craig_federighi@apple.com
 */
import java.util.Scanner;

public class ReplitEmail {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your email!!");
        String email=scan.nextLine();
        System.out.println("First name: "+(email.charAt(0)));


    }
}
