package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {

        boolean isHungry=true;
        if(isHungry) {
            System.out.println("I am hungry I will go get something to eat");
            System.out.println("Then code JAVA");

        }else{
            System.out.println("I am not hungry, lets keep coding JAVA");

        }

        double price=130.44;

        boolean isAffordable=price<=200.0;
        System.out.println("isAffordable = "+isAffordable);


        if (price >=200){
            System.out.println ("You can afford it!!!");

        }else{
            System.out.println ("You can not afford it!");

        }

        boolean isRemoteJob=false;

        if (!isRemoteJob) {
            System.out.println("Sorry, I am not interested");
        }else{
            System.out.println("Sure I am interested, what is the interview process???");
        }

        String city = "Fairfax";
        if (city=="Fairfax") {
            System.out.println("It is Fairfax");

        }else{
            System.out.println("Los Angeles");

        }
    }
}
