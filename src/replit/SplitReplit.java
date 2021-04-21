package replit;
import java.util.*;
/**
 * Given a String variable email, write code using split method to
 * print email id and domain in separate lines.
 */
public class SplitReplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String []emailSplit=email.split("@");
        for(String E:emailSplit){
 //alimbekova@gmail.com

        }
        if(emailSplit.length==2){

        System.out.println("Email id: " +emailSplit[0]);
        System.out.println("Email domain: "+emailSplit[1]);
     //   String email1=input.nextLine();
       // if(!emailSplit.equals("@")||emailSplit.equals("@, @")){
          //  System.out.println("Invalid email");
        }else{
            System.out.println("invalid email");
        }



    }
}
