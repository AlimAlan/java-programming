package officeHours.Practice_05_12_2021;

public class BankAccount {
    String accountHolderName;    //instance variables->blueprint
    int pin;
    double balance;
    long accountNumber;
    public  double getBalance(int inputPinCode){      //local variable  (inputPinCode)
        if(pin==inputPinCode){
            return balance;
        }

        return -1;


    }
}
