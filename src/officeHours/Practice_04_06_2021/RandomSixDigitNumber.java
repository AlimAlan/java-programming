package officeHours.Practice_04_06_2021;
import java.util.Random;
import java.util.Scanner;
/**
 * Generate a random number that is six digit long.
 * Each digit in this number should be unique,
 * meaning the number 6 digit number should have 6 different character numbers that make it up.
 * Print the number.
 *
 */
public class RandomSixDigitNumber {
    public static void main(String[]args){
        Random random=new Random();
        String randomNumber="";
        while(randomNumber.length()!=6){
            int eachRandom=random.nextInt(10);
            if(!randomNumber.contains(""+eachRandom)){
                randomNumber+=eachRandom;

            }
        }
        System.out.println("Random number: "+randomNumber);
    }
}
