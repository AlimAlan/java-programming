package day09_scanner_practice;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Todays temperature:");
        double fahrenheit = scan.nextDouble();
        double celsius=(fahrenheit -32)*5.9;
        System.out.println("Today's temperature is: +celsius");



    }
}
