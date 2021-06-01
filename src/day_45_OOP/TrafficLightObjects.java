package day_45_OOP;
import java.util.*;
public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight=new TrafficLight();
        //trafficlight.color="red"
        //we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2=new TrafficLight();
        trafficLight2.changeColor("brown");
        trafficLight2.showColor();

    }
}
