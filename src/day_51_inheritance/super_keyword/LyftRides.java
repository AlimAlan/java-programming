package day_51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide=new Lyft();
        LyftXL lyftXLRide=new LyftXL();
        Lux luxRide=new Lux();
        System.out.println("LyftRide for 5 miles $ "+lyftRide.calculateRate(5));
        System.out.println("LyftXL for 5 miles $ "+lyftXLRide.calculateRate(5));
        System.out.println("Lux Ride for 5 miles $ "+luxRide.calculateRate(5));


    }
}
