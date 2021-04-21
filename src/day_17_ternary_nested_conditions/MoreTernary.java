package day_17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate=50;
        String reply = (hourlyRate>45)? "accept": "reject";
        System.out.println("reply = "+reply);

        String todaysClass = "JAVA";
        String teacher = (todaysClass.equals("JAVA")?"Murodil|Saim": "Nadir");
        System.out.println("Today's teacher = " + teacher);

        boolean isEligible=true;
        String driving=isEligible?"Have DL, Can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);







    //    if (hourlyRate>45){
      //      System.out.println("Accept");
    //}else{
      //      System.out.println("Reject");

        }
    }

