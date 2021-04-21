package officeHoursPractice03_24_2021;
import java.util.Scanner;

/**
 * Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
 *
 * Ask for the first guest name.
 *
 * Then ask does user want to enter one more guests.
 * do
 * If yes - take the next guest input
 *
 * If not - finish the program and print list of the guests.
 */
public class GuestListReplit {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String listOfGuest="";
        String answer="";
        do {
            System.out.println("Please enter your name: ");
            String name=scan.next();
            listOfGuest+=name+",";
            System.out.println("Do you want enter one more guest?");
            answer=scan.next();
        }
        while(answer.equals("yes"));
        listOfGuest=listOfGuest.substring(0, listOfGuest.lastIndexOf(","));
        System.out.println(listOfGuest);








    }
}
