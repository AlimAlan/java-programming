package day_45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee latte=new Coffee();
        System.out.println("coffee amount = "+ latte.getAmount());
        latte.refill();
        System.out.println("amount after refill = "+latte.getAmount());
        latte.drink(2);
        System.out.println("after drinking " +latte.getAmount());
      //Not: lattee.type="turkish
       latte.setType("Turkish coffee");
        System.out.println("My Coffee " +latte.getType());

        //describe myCoffee - > show all variable values;
        System.out.println(latte.toString());

        Coffee coffee1=new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee 1 type = "+coffee1.getType());
        //assign coffee1 object to coffee2
        Coffee coffee2=coffee1;
        System.out.println("coffee 2 type = "+coffee2.getType());

        coffee2.setType("espresso");

        Coffee coffee3=new Coffee();
        coffee3=coffee2;
        System.out.println("coffee 3 type "+coffee3.getType());

        Coffee coffee4=null;      //reference variable does not  refer/point to any object in HEAP
        coffee4.setType("turkish");   //NullPointerException










    }
}
