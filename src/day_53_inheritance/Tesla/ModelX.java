package day_53_inheritance.Tesla;

public class ModelX extends ElectricCar {


    public ModelX(String make, String model, double price, int year, int range) {
        super(make, model, price, year, range);
        System.out.println("Welcome New Model X");

    }
}
