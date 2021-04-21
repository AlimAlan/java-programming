package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava=22.50;
        System.out.println("baklava = " + baklava);

        baklava= balance-baklava;
        System.out.println("balance after baklava = " + baklava);

        double kenafe = 44.45;
        System.out.println("kenafe = " + kenafe);
        kenafe=balance-kenafe;
        System.out.println("Balance after kenafe = " + balance);

        kenafe=kenafe/2;

        System.out.println("kenafe = "+ kenafe);

        balance= balance-kenafe;
        System.out.println("balance after second kenafe="+balance);

        double plov = 7.99;
        System.out.println("plov = "+plov);
        balance = balance-plov;
        System.out.println("balance after plov  = " + balance);

        double iceTea=3.0;
        System.out.println("iceTea = "+iceTea);
        balance = balance-iceTea*4;

        System.out.println("balance after icetea:" + balance);

        System.out.println("returning baklava= "+baklava);
        balance=balance+baklava;
        System.out.println("balance after returning baklava = "+balance);




















    }
}
