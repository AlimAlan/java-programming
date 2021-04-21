package officeHours;
import java.util.Scanner;
public class OfficeHoursSchedule {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String day=scan.nextLine();
        switch (day){
            case "Monday": case "Tuesday": case "Wednesday":
                System.out.println("Office hours from 5:30 to 6:30");
                break;
            case "Thursday":
                System.out.println("Soft Skills day");
                break;
            case "Friday":
                System.out.println("Day off");
                break;
            case " Saturday": case "Sunday":
                System.out.println("Already a long day, no office hours");
                break;
            default:
                System.out.println("Invalid day given");
                break;
        }
    }
}
