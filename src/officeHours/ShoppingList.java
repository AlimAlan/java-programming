package officeHours;
import java.util.Scanner;


public class ShoppingList {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        String item1 = "Tomatoes Price:";
        System.out.println ("Item1: Tomatoes Price: ");
        double price1 = scan.nextDouble ();
        String item2= "Cheese Price:";
        System.out.println ("Item2: Cheese Price: ");
        double price2= scan.nextDouble ();
        String item3= "Apples Price: ";
        System.out.println("Item3: Apples Price: ");
        double price3= scan.nextDouble ();
        double report =price1+price2+price3;
        System.out.println("Total price: " +report);;




    }
}
