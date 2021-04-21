package officeHours.Practice03_30_2021;
import java.util.Scanner;

public class DynamicLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");
        String upperOrLower = input.next();
        System.out.println("Do you want ascending or descenting order");
        String ascendingOrDescending=input.next();
        int starting;
        int ending;
        if(upperOrLower.equals("uppercase")){
            starting='A';
            ending='Z';

        }else{
            starting='a';
            ending='z';


        }
        if(ascendingOrDescending.equals("ascending")){



        for(int i ='A'; i <'Z'; i++) {
            System.out.print((char) i + " ");
        }
        }
    }
}
