package day_18_conditions_practice_strings_intro;

public class Authentications {
    public static void main (String []args){
        int explast4SSN=1234;
        int expPinCode=4567;

        int last4SSN=1234;
        int pinCode=4567;

        if(last4SSN==explast4SSN && pinCode==expPinCode){
            System.out.println("Authentication successful");

        }else{
            System.out.println("Authentication unsuccessful");
            if(last4SSN!=explast4SSN){
                System.out.println("Last 4 SSN number is incorrect");

            }
        }
    }
}
