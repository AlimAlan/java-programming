package day_24_loops;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum=new Random();
        Scanner scan=new Scanner(System.in);
       // System.out.println(randomNum.nextInt(101));
        int secretNumber=randomNum.nextInt(101);
        int guessingNumber;
        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber>secretNumber){
                System.out.println("Your number is to large");
            }else if(guessingNumber<secretNumber){
                System.out.println("wrong,your number is to small");
            }
        }while (secretNumber!=guessingNumber);




    }
}
