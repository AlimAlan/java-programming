package day13_conditional_statements;

import com.sun.tools.internal.ws.wsdl.document.BindingOutput;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("*****WELCOME TO CHASE BANK ATM*****");

       int secretPinCode=1234;
       int inputPinCode = 1234;

       if (secretPinCode== inputPinCode){
           System.out.println("Welcome to your account!!!");
           System.out.println("You can withdraw, check your balance, deposit");

       }else{
           System.out.println("Incorrect PINCODE!!!"+inputPinCode);
           System.out.println("Please try again!!!");

       }
        System.out.println("Thank you for using CHASE BANK ATM!!!!");

    }
}
