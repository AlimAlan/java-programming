package day_49_static_methods;

public class BankAccountTest {
    public static void main(String[] args) {

        MyBankAccount husband=new MyBankAccount();
        husband.user="husband";
        husband.showBalance();
        husband.spend(100.0);
        husband.showBalance();
        MyBankAccount wife=new MyBankAccount();
        wife.user="wife";
        wife.showBalance();
        wife.spend(150);
        wife.showBalance();
       // System.out.println();
        husband.showBalance();
        System.out.println(MyBankAccount.balance);
    }
}
