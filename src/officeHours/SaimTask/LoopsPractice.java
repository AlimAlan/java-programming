package officeHours.SaimTask;

import java.sql.SQLOutput;

/**
 * Write a program that can calculate the sum of all the odd numbers between 1 ~ 100
 */
public class LoopsPractice {
    public static void main(String[] args) {
        int sum=100;
        for(int i=1; i<=sum; i++){
            if(i%2!=0){
                System.out.println("ODD numbers from 1 to 100 are: "+ i);

            }
        }
        int a=100;
        for(int n=1; n<=a; n++){
            if(n%2==0){
                System.out.println("EVEN numbers from 1 to 100 are: "+n);
            }
        }

    }
}
