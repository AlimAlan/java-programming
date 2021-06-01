package day_46_encapsulations;

public class Dealership {
    public static void main(String[] args) {
        Car car1=new Car();
        //ERROR below , model and year are  PRIVATE and cannot be a
       // car1.model="Hyundai Santa Fe";
      //  car1.year=2019;

        car1.setModel("Hyundai");
        System.out.println("car1 model "+car1.getModel());
        car1.setYear(2019);
        System.out.println("car1 year "+car1.getYear());
        car1.setMileage(25000);
        System.out.println("car1 mileage "+car1.getMileage());
        System.out.println(car1.toString());
        System.out.println(car1);

        Car lexus=new Car();
        lexus.setModel("Lexus GX 570");
        lexus.setYear(2021);
        lexus.setMileage(00015);


        System.out.println("Model = "+lexus.getModel());
        System.out.println("Year = "+lexus.getYear());
        System.out.println("Mileage = "+lexus.getMileage());
        System.out.println(lexus.toString());





    }
}
