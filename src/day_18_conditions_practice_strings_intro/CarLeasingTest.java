package day_18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make="Mercedes";
        String model="E";
        double leasePrice=0;

        if(make.equals("Mercedes")&& model.equals("E")) {
            leasePrice=500.0;

        }else if (make.equals ("Mercedes")&& model.equals ("A")) {

        }
        System.out.println("make = "+make);
        System.out.println("model = "+ model);
        System.out.println("lease price = "+leasePrice);


    }
}
