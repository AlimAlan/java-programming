package replit;
import java.util.*;
public class Diving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] score = new float[7];
        // WRITE YOUR CODE HERE
        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = scan.nextFloat();
        }
        System.out.println("Enter difficulty:");
        float difficulty = scan.nextFloat();
        Arrays.sort(score);
        score[0] = 0;
        score[score.length - 1] = 0;
        float sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        float result = sum * difficulty * 0.6f;
        System.out.println("Total: " + result);
    }

    }
