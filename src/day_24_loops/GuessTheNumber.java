package day_24_loops;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = 100;
        int guessingNumber = 0;
        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();

        } while (secretNumber <=0);
        System.out.println("Wrong number");



        }

    }

