package day12_boolean_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed=45;
        int speedLimit=55;
       // boolean isSpeeding =true;

        System.out.println(currentSpeed>currentSpeed);
        System.out.println(speedLimit<currentSpeed);
        System.out.println(speedLimit==currentSpeed);

        boolean isSpeeding = currentSpeed>currentSpeed;
        System.out.println("Are you speeding? - "+isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit + "mph");

        currentSpeed+=20;

        //isSpeeding=currentSpeed>speedLimit;
        //System.out.println("Are you speeding?-"+);
       // System.out.println("currentSpeed = "+currentSpeed+ "mph");
       // System.out.println ("speedLimit = "+speedLimit+"mph");




        double accountBalance=250.25;
        double itemPrice = 300.99;
        System.out.println("Can I afford? - "+ (accountBalance >= itemPrice));


        boolean canAfford = accountBalance>=itemPrice;
        System.out.println("can afford = "+canAfford);


        //decrease balance by itemPrice using shorthand operator;
        accountBalance=accountBalance-itemPrice;
        accountBalance-=itemPrice;

        boolean isBroke = accountBalance<=0;
        System.out.println("Am I broke? - "+isBroke);




    }
}
