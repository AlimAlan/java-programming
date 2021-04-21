package day_16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numberOfBedrooms = 0;
        double startPrice=0;

        if(numberOfBedrooms==0){

        }
       switch (numberOfBedrooms){
           case 0:
               System.out.println("Studio selected");
               numberOfBedrooms=0;
               startPrice=1454;
               break;
           case 1:
               System.out.println("1 Bedroom selected");
               numberOfBedrooms=1;
               startPrice=1725;
               break;
           case 2:
               numberOfBedrooms=2;
               startPrice=2899;
               break;
           default:
               System.out.println("5 Bedroom currently is unavailable");
               break;

       }
        System.out.println("Price: $"+startPrice);

    }
}
