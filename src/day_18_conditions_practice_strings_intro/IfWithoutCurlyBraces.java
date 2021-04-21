package day_18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass="python";

        if(todayClass.equals("JAVA"))
            System.out.println("JAVA if fun");

        else
            System.out.println("it is not JAVA. it is" + "todaysClass");

        int score=1;
        if(score==1){
            System.out.println("lowest score 1");
        }
        int a=1;
        if(a==1){
            System.out.println("a is 1");
            System.out.println("1 ia a");

        }
    }
}
