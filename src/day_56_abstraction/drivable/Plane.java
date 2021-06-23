package day_56_abstraction.drivable;

import day_56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {

    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-pilot mode");
    }




    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost "+(mile*26)+" to Fly "+mile+" miles");
    }

    @Override
    public void hi() {
        System.out.println("Welcome");
    }

    @Override
    public void bye() {
        System.out.println("Have a great day");
    }

    public void land() {
        System.out.println("Plane is landing , buckle up");
    }
}
