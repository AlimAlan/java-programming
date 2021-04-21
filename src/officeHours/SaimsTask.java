package officeHours;

public class SaimsTask {
    public static void main(String[] args) {
        int hourlyRate=50;
        int weeklyHours=40;
        int numberOfWeeks=52;
        int salary=hourlyRate*weeklyHours*numberOfWeeks;

        if(hourlyRate<=0){
            System.out.println("Hourly Rate cannot be Negative or Zero");

        }else if(weeklyHours<1 && weeklyHours>65) {
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
       // }else{


        }else {
            System.out.println(salary);

        }
    }
}
