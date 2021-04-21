package day_36_methods_with_return;
import java.util.*;
public class CreditScore {
    public static void main(String[] args) {
        checkEligible(800);
        checkEligible(650);
        //System.out.println(checkEligible(711));  ERROR , Doesnt return value; cannot return method;
        System.out.println("CreditScore = "+getCreditScore());
        int score=getCreditScore();
        System.out.println("score = "+score);
    }
    public static void checkEligible(int creditScore){
        if(creditScore>=700){
            System.out.println("You are eligible for leasing this car");
        }else{
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
    }
    public static int getCreditScore(){
        return 800;

    }
}
