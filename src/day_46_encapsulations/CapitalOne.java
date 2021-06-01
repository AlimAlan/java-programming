package day_46_encapsulations;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc=new CheckingAccount();
        acc.setAccountNumber(23211421443534L);
        acc.setBalance(250.50);
        acc.setAccountHolder("Adilet Bektemirov");
        acc.setType("360 Checking");
       // System.out.println(acc.toString());
        System.out.println("acc = " + acc);
    }
}
