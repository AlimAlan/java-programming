package day09_scanner_practice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Price for bread is: ");
        double price1 = scan.nextDouble();
        System.out.println("Enter price for milk: ");
        double price2 = scan.nextDouble();
        System.out.println("Enter price for cucumber: ");
        double price3=scan.nextDouble();
        System.out.println ("Total:");
        double total = price1+price2+price3;
        System.out.println(total);;







    }
}
