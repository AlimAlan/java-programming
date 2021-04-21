package day_15_logicalops_switch_ternary;

import java.sql.SQLOutput;

public class CitySelector {
    public static void main(String[] args) {
        String city="Bishkek";

        if(city.equals("Bishkek")||city.equals("Tampa")){
            System.out.println("Willing to relocate to "+city);

        }else{
            System.out.println("Not considering" +city);

        }
        String teacher ="Murodil";
        if (teacher.equals("SAIM")||teacher.equals("Murodil")){
            System.out.println("It is JAVA class with -"+teacher);
        }else{
            System.out.println("Soft skill class with "+teacher);

        }
        if(teacher.equals("Saim")||teacher.equals("Murodil")){
            System.out.println("Java class with "+teacher);

        }else if(teacher.equals("Nadir")){
            System.out.println("Soft skills class with "+teacher);

        }else{
            System.out.println("Some other class "+teacher);

        }
        String company = "Google";
        double salary=100000;

        if(company.equals("Google")|| salary>=100000){
            System.out.println("Accepting offer from "+company);

        }else{
            System.out.println("Rejecting offer from "+company);


        }

    }
}
