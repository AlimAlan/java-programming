package officeHours.Practice_03_10_2021;
import java.util.Scanner;
public class MovieDuration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenght of the movie");
        double movieLenght =input.nextDouble();
        double price=0;

        if(movieLenght==1.0){
            price=8.99;

        }
        if (movieLenght==1.5){
            price=10.50;
        }
        if(movieLenght==2.0){
            price=12.99;
        }
        if(movieLenght==2.5){
            price=14.50;

        }
        if(movieLenght==3.0){
            price=15.99;

        }
        if (movieLenght<=0){
            System.out.println("Invalid lenght");

        }
        System.out.println ("Price: "+price);

    }

}