package officeHours;
import java.util.*;
public class Leasing {

        public static void main(String[] args) {
            //DO NOT CHANGE
            int propertyPrice = 0;
            int numberOfBedrooms, garageSpots;
            float metroAccessibility, schoolScore, highwayAccessibility;
            boolean backyard, smoking, garage;
            String houseType;
            Scanner scan = new Scanner(System.in);
            System.out.println("*****************************************");
            System.out.println("* Welcome to the RealEstate calculator! *");
            System.out.println("*****************************************");
            //WRITE YOUR CODE HERE
            System.out.println("Enter your property type:");
            houseType=scan.nextLine();
            if(houseType.equals("Condo")){
                propertyPrice=propertyPrice+50000;

            }else if(houseType.equals ("Townhouse")){
                propertyPrice=propertyPrice+75000;
            }else if(houseType.equals("Single Family Home")){
                propertyPrice=propertyPrice+95000;
            }
            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms=scan.nextInt();
            if(numberOfBedrooms>=1){
                propertyPrice= propertyPrice+(numberOfBedrooms*30000);

            }

            System.out.println("Do you have a backyard?");
            backyard=scan.nextBoolean();
            if(backyard && !houseType.equals("Condo")){
                propertyPrice=propertyPrice+5000;
            }else if(backyard&&houseType.equals("Condo")){

                System.out.println("Backyard is not available for condo!");
            }

            System.out.println("Do you have garage?");
            garage=scan.nextBoolean();

            System.out.println("How many spots?");
            garageSpots=scan.nextInt();
            if (garage &&garageSpots<10){
                propertyPrice=propertyPrice+(garageSpots*2000);
            }else if(garage && garageSpots>10){



                System.out.println("Pardon, it's not a public parking!");
            }
            System.out.println("How close is metro station?");
            metroAccessibility=scan.nextFloat();
            if(metroAccessibility <=1){
                propertyPrice=propertyPrice+1000;
            }else if(metroAccessibility>1 && metroAccessibility<=3){
                propertyPrice=propertyPrice+5000;
            }

            System.out.println("How close is highway?");
            highwayAccessibility=scan.nextFloat();
            if(highwayAccessibility<=1){
                propertyPrice=propertyPrice+15000;
            }else if (highwayAccessibility>1 && highwayAccessibility<=5){
                propertyPrice=propertyPrice+8000;

            }else if(highwayAccessibility>5 &&highwayAccessibility<=20){
                propertyPrice=propertyPrice+4000;

            }
            System.out.println("What's the rating of nearest school?");
            schoolScore=scan.nextFloat();
            if (schoolScore<10 && schoolScore>=8){
                propertyPrice=propertyPrice+45_000;
            }else if(schoolScore <8 && schoolScore>=4){
                propertyPrice=propertyPrice+20_000;
            }else{
                propertyPrice=propertyPrice+5_000;

            }
            System.out.println("Does any of your family members smoke?");
            smoking=scan.nextBoolean();
            if (smoking){
                propertyPrice=propertyPrice-5_000;

            }
            System.out.println("Market report has been generated.");
            System.out.println("Your estimate market price is: " +propertyPrice + "$");
        }
    }


