package day_15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location="Tyson Corner";
        double salary=150000;
        boolean remote=true;
        boolean benefit=true;


        if (remote&&benefit) {
            System.out.println("I am accepting your offer");

        }
        if (location.equals("Tyson Corner")&&salary>=150000&&remote&&benefit){
            System.out.println("When i can start?");

        }else{
            System.out.println("Lets consider another offer or negotiate");

        }
    }
}
