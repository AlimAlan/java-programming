package day_48_constructors;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus=new Bus();
        bus.driver= new Driver("John");
        bus.engine=new Engine(10);
        System.out.println(bus.toString());
        Bus metroBus=new Bus();
        metroBus.driver=new Driver("Aziz");
        metroBus.engine=new Engine(15);

        System.out.println(metroBus);

        //print Driver name of metroBus
        System.out.println(metroBus.driver.getName());


    }
}
