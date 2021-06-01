package day_46_encapsulations;

public class CheckingAccount {
    private double balance;
    private long accountNumber;
    private String accountHolder;
    private String type = "checking";       //default is checking,we can change if needed using setter


    /**
     * public void setAccountInfo (long accountNumber,
     * @return
     */


    //right click -> generate -> Getter and Setter -> select all -> OK

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    //My Version
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setAccountNumber(long accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public long getAccountNumber() {
//        return accountNumber;
//
//    }
//
//    public void setAccountHolder(String accountHolder) {
//        this.accountHolder = accountHolder;
//    }
}