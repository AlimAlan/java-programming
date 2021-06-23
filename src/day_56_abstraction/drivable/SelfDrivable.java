package day_56_abstraction.drivable;

public interface SelfDrivable {
    void autoPiloting();

    public default void selfPark(){
        System.out.println("Performing self park steps");
    }
}
