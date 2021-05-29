package day_41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(45,48,63,12,78,96);
        System.out.println("nums = "+nums);
       // nums.add(100);        //doesnt work
      //  System.out.println(nums);         //doesnt work
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4,2,12,78,100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numList = "+numsList);
        numsList.remove(0);
        numsList.remove(new Integer(78));
        System.out.println("numsList "+numsList);

        List<String> drinksWithCoffeine =new ArrayList<>(Arrays.asList("coffee","tea","red bull","coke","pepsi","mDew","cambucha"));

        System.out.println(drinksWithCoffeine);
        int coffeineAmount=0;
        for(String each:drinksWithCoffeine){
            if(each.equalsIgnoreCase("pepsi") || each.equalsIgnoreCase("red bull") || each.equalsIgnoreCase("mDew")){
                coffeineAmount=150;
                System.out.println(each+" => "+coffeineAmount);
            }else if(each.equalsIgnoreCase("coffee") || each.equalsIgnoreCase("cambucha") ){
                coffeineAmount=112;
                System.out.println(each+ " => "+coffeineAmount);

            }else if(each.equalsIgnoreCase("tea") || each.equalsIgnoreCase("coke") || each.equalsIgnoreCase("pepsi") ){
                coffeineAmount=35;
                System.out.println(each+" => "+coffeineAmount);
            }
        }
        for(String each:drinksWithCoffeine){
            switch (each){
                case "mDew": case "red bull": case "pepsi":
                    coffeineAmount=150;
                    System.out.println(each+ " => "+coffeineAmount);
                    break;
                case "coffee": case "tea": case "cambucha":
                    coffeineAmount=112;
                    System.out.println(each+" = > "+coffeineAmount);
                    break;
            }
        }
        drinksWithCoffeine.forEach(drink -> System.out.println(drink.toUpperCase(Locale.ROOT)));
        drinksWithCoffeine.forEach(drink -> {
            System.out.println("=======================");
            System.out.println("This is forEach block");
            System.out.println(drink+" DRINKS");
            System.out.println("************************");
        });

    }
}
