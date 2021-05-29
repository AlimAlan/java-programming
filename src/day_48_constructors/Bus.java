package day_48_constructors;

public class Bus {
    Driver driver;
    Engine engine;

    @Override
    public String toString() {
        return driver.getName()+" | "+engine.getCylinders();


    }
}
