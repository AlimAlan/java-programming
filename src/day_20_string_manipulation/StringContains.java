package day_20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("L o")); //true
        System.out.println(company.contains("j")); //false

        if (company.contains(" ")) {
            System.out.println("multiple words company name");

        } else {
            System.out.println("single word company name");
        }


        String etsyTitle = "Wooden spoon | Etsy";
        //check if " | " is in etsyTitle

        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass - title check passed");

        } else {
            System.out.println("Fail - title check failed");

        }
        String firstName = "meerim";
        System.out.println();
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("both m && r are present");

        } else {
            System.out.println("m || r not presented");
        }

        firstName = "Timur";
        if (firstName.contains("i") || firstName.contains("r")) {
            System.out.println("i or r is present");

        } else {
            System.out.println("no i and r is present");

        }
        String email = "alimbekova25m@gmail.com";
        if (email.contains("25m") || email.endsWith("com")) {
            System.out.println("25m || com is present");

        } else {
            System.out.println("25m || com is not present");

        }
        if(email.toLowerCase().contains("v")){
            System.out.println("v is present");

        }else{
            System.out.println("v is not present");

        }
    }
}

