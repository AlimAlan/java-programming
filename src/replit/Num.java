package replit;
import java.util.*;
public class Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

        int reverse=0;
        int temp=num;

        while(num!=0){

            int lastDigit=temp%10;
            reverse=(reverse*10)+lastDigit;
            temp=temp/10;
          //  if(num==reverse){
               // return reverse==num;

            }
        System.out.println(num==reverse);

        }



    }


