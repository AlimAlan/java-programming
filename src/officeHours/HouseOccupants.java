package officeHours;
import java.util.Scanner;
public class HouseOccupants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String houseType= input.nextLine();
        int maxOccupants=0;

        switch (houseType) {
            case "Tree house":
                maxOccupants = 1;
                break;
            case "Mobile home":
                maxOccupants = 2;
                break;
            case "Apartment":
                maxOccupants = 4;
                break;
            case "Town house":
                maxOccupants = 6;
                break;
            case "Villa":
                maxOccupants = 8;
                break;
            case "Mansion":
                maxOccupants = 10;
                break;

        }
        System.out.println("The number of max occupants in " + houseType + " is - " + maxOccupants);
        }

    }

