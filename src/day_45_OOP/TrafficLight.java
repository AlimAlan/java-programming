package day_45_OOP;

public class TrafficLight {
   //public class Trafficlights {
        String color;
        //this is read only method, displays value of color variable
        public void showColor(){
            System.out.println("current color = " + color);
        }
        //this method updates the value of color variable
        public void changeColor(String newColor){
            if(newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow")||newColor.equalsIgnoreCase("green")){
                System.out.println("changing color "+ newColor);
                color = newColor;
            }else {
                System.out.println("error");
            }



        }
    }

